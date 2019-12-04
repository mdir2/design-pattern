# TOC

* [Duck](#duck)

    * [Problem](#problem)

    * [Solution](#solution)

        * [인터페이스를 이용한 추상화와 캡슐화](#인터페이스를-이용한-추상화와-캡슐화)

        * [추상화한 행동 모듈들을 Duck class에 `Composition`](#추상화한-행동-모듈들을-duck-class에-composition)

        * [의존주입을 이용 한 `Composition`](#의존주입을-이용-한-composition)

<br>

# Problem

__Duck__ 이라는 Model이 있고 `quack()`, `swim()`, `display()` method가 있다.
`display()`는 abstract method

```java
public Class Duck {
    public void quack() {...}
    public void swim() {...}
    public abstract void display() {...}
}
```

<br>

고객의 요구로 날 수 있는 기능이 추가 되어야 한다.  
해서 아래와 같이 `fly()` method를 추가했다. 

```java
public class Duck {

    ...

    public void fly() {...}
}
```

하지만, __RubberDuck__ 처럼 날 수 없어야 하는 model도 날 수 있게 되는 상황이 발생된다.

<br>

# Solution

## 인터페이스를 이용한 추상화와 캡슐화

```java
public interface QuackBehavior {
    public void quack();
}

public class Quack implements QuackBehavior {
    @Override
    public void quack() {...}
}

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        // 삑삑
    }
}
```

```java
public interface FlyBehavior {
    public void fly();
}

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {...}
}

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        // can not fly
    }
}
```

<br>

## 추상화한 행동 모듈들을 Duck class에 `Composition`

```java
public class Duck {
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public void swim() {...}
    public abstract void display() {...}

    public void performQuack() {
        quackBehavior.quack();
    }

    public void perFormFly() {
        flyBehavior.fly();
    }
}

public class RubberDuck extends Duck {

    ...

    public RubberDuck() {
        super.quackBehavior = new Squack();
        super.flyBehavior = new FlyNoWay();
    }
}
```

<br>

## 의존주입을 이용 한 `Composition`

```java
public Duck {

    ...

    public void setQuackBehavior(final QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public void setFlyBehavior(final FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
```

```java
public class Application {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();

        duck.setQuackBehavior(new Squack());
        duck.setFlyBehavior(new FlyNoWay());
        duck.display();

        // 유연하게 행동을 바꿀 수 있음.
        duck.setQuackBehavior(new Quack());
        duck.setFlyBehavior(new FlyWithWings());
        duck.display();
    }
}
```
