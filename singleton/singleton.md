# TOC

- [싱글턴 패턴의 정의](#싱글턴-패턴의-정의)

- [고전적인 싱글턴](#고전적인-싱글턴)

- [멀티스레딩 문제 해결 방법](#멀티스레딩-문제-해결-방법)

    - [synchronized](#synchronized)

    - [처음부터 만들어버리기](#처음부터-만들어버리기)
    
    - [DCL(Double-Checking Locking)](#dcldouble-checking-locking)

<br>

## 싱글턴 패턴의 정의

> 해당 클래스의 객체가 하나만 만들어지고, 어디서든 그 인스턴스에 접근할 수 있도록 하기 위한 패턴.

## 고전적인 싱글턴

```java
public class Singleton {
    private static Singletone instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

멀티쓰레드에서 다중 객체가 생겨 리소스낭비가 날 수 있음.

## 멀티스레딩 문제 해결 방법

### synchronized

```java
public class Singleton {
    private static Singletone instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 처음부터 만들어버리기

```java
public class Singleton {
    private static Singletone instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
```

### DCL(Double-Checking Locking)

```java
public class Singleton {
    private volatile static Singletone instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singletone();
                }
            }
        }
        return instance;
    }
}
```

> __Note:__ `volatile`이란? CPU 캐시가 아닌 메인메모리에서 값을 읽어오는것을 보장해줌.