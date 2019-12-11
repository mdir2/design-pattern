# TOC

## [Strategy](./strategy/strategy.md#TOC)

* [Problem](./strategy/strategy.md#problem)

* [Solution](./strategy/strategy.md#solution)

    * [UML](./strategy/strategy.md#uml)

    * [인터페이스를 이용한 추상화와 캡슐화](./strategy/strategy.md#인터페이스를-이용한-추상화와-캡슐화)

    * [추상화한 행동 모듈들을 Duck class에 `Composition`](./strategy/strategy.md#추상화한-행동-모듈들을-duck-class에-composition)

    * [의존주입을 이용 한 `Composition`](./strategy/strategy.md#의존주입을-이용-한-composition)
    
<br>
    
# Design Pattern Principle
 
## Strategy
 
* 바뀌는 부분은 캡슐화 한다.
 
* `inherit`보다는 `composition`을 활용한다.
 
* 구현이 아닌 인터페이스에 맞춰서 프로그래밍한다.

## Observer

* 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.