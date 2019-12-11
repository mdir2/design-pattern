# TOC

## [Strategy](./strategy/strategy.md#TOC)

- [Problem](./strategy/strategy.md#problem)

    - [시나리오](./strategy/strategy.md#시나리오)

    - [문제점](./strategy/strategy.md#문제점)

- [Solution](./strategy/strategy.md#solution)

    - [UML](./strategy/strategy.md#uml)

    - [인터페이스를 이용한 추상화와 캡슐화](./strategy/strategy.md#인터페이스를-이용한-추상화와-캡슐화)

    - [추상화한 행동 모듈들을 Duck class에 `Composition`](./strategy/strategy.md#추상화한-행동-모듈들을-duck-class에-composition)

    - [의존주입을 이용 한 `Composition`](./strategy/strategy.md#의존주입을-이용-한-composition)

## [Observer](./observer/observer.md#TOC)

- [Problem](./observer/observer.md#problem)

    - [시나리오](./observer/observer.md#시나리오)

    - [요약](./observer/observer.md#요약)

    - [문제점](./observer/observer.md#문제점)

- [Solution](./observer/observer.md#solution)

    - [옵저버 패턴의 정의](./observer/observer.md#옵저버-패턴의-정의)

    - [UML](./observer/observer.md#uml)

    - [느슨한 결합(Coupling)](./observer/observer.md#느슨한-결합coupling)
    
- [유의사항](./observer/observer.md#유의사항)
    
<br>

## [Decorator](./decorator/decorator.md#TOC)

- [Problem](./decorator/decorator.md#problem)

    - [시나리오](./decorator/decorator.md#시나리오)

    - [문제점](./decorator/decorator.md#문제점)

- [Solution](./decorator/decorator.md#solution)

    - [데코레이터 패턴의 정의](./decorator/decorator.md#데코레이터-패턴의-정의)
    
    - [UML](./decorator/decorator.md#uml)
    
<br>

# Design Pattern Principle
 
## Strategy
 
* 바뀌는 부분은 캡슐화 한다.
 
* `inherit`보다는 `composition`을 활용한다.
 
* 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.

## Observer

* 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.

## Decorator

*  클래스는 확장에 대해서는 열려 있지만 변경에 대해서는 닫혀 있어야 한다. (Open Close Principle)