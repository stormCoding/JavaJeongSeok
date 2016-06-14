#1. 객체지향언어
###1.1 객체지향언어의 역사
객체지향이론의 기본 개념은 '실제 세계는 사물(객체)로 이루어져 있으며, 발생하는 모든 사건들은 사물간의 상호작용이다.'라는 것이다.
객체지향이론은 상속, 캡슐화, 추상화 개념을 중심으로 구체적으로 발전되었다.

###1.2 객체지향언어
코드 간에 서로 관계를 맺어 줌으로써, 유기적으로 프로그램을 구성하는 것
**특징**
* 코드의 재사용성이 높다.
  - 새로운 코드의 작성 시 기존의 코드를 이용하여 쉽게 작성 가능
* 코드의 관리가 용이하다.
  - 코드간의 관계를 이용해서 쉽게 코드를 변경 가능
* 신뢰성이 높은 프로그래밍을 가능하게 한다.
  - 제어자와 메서드를 이용해서 데이터의 올바른 값을 유지
  - 코드의 중복을 제거하여 코드의 불일치로 인한 오작동을 방지
※ 객체지향개념에 얽매여서 고민하기 보다는 프로그램을 기능적으로 완성 후 개선하는 것이 좋다.

#2. 클래스와 객체
###2.1 클래스와 객체의 정의와 용도
클래스의 정의 - 클래스란 객체를 정의해 놓은 것이다.
클래스의 용도 - 클래스는 객체를 생성하는데 사용된다.

###2.2 객체와 인스턴스
클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화(instantiate)라고 한다.
클래스로부터 만들어진 객체를 그 클래스의 인스턴스(instance)라고 한다.
> ex) 책상은 객체다.

> ex) 책상은 책상클래스의 인스턴스다.

###2.3 객체의 구성요소 - 속성과 기능
객체는 속성과 기능의 집합이라고 할 수 있고, 객체가 가지고 있는 속성과 기능을 그 객체의 멤버(구성원, member)라 한다.
* 속성(property) - 멤버변수(member varible), 특성(attribute), 필드(field), 상태(state)
* 기능(function) - 메서드(method), 행위(behavior), 함수(function)

###2.4 인스턴스의 생성과 사용
```
Tv t // Tv클래스 타입의 참조변수 t를 선언
t = new Tv(); // Tv인스턴스를 생성한 후, 생성된 Tv인스턴스의 주소를 t에 저장
```
※ 자신을 참조하고 있는 참조변수가 없는 인스턴스는 가비지 컬렉터에 의해서 메모리에서 제거된다.
※ 하나의 인스턴스를 여러 개의 참조변수가 가리키는 경우(가능)
※ 여러 개의 인스턴스를 하나의 참조변수가 가리키는 경우(불가능)

###2.5 클래스의 또 다른 정의
데이터와 함수의 결합
