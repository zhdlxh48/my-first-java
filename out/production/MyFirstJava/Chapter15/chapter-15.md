# 상속

## 상속이란?

상속이란 어떠한 부모 클래스를 기반으로 하는 자식 클래스를 만드는 것을 말함

기존의 부모 클래스의 기능을 자식 클래스에서 사용할 수 있도록 하는 것

|      | 과일   |        |
| ---- | ------ | ------ |
| 사과 | 오렌지 | 바나나 |

이런 식으로 과일이라는 공통적인 기능과 속성을 지닌 클래스를 만들어 하위의 세부 과일 클래스에게 상속하면 조금 더 빠르고 효율적으로 클래스를 구성하고 수정할 수 있음

### 상속의 장점

`상황: 과일의 정보에 이것이 세척되었는지 여부를 추가하고 싶음`

- 상속을 이용하지 않는 경우
  - 모든 과일 클래스, 사과, 오렌지, 바나나등 각각의 과일 클래스에 전부 세척 여부 속성을 추가해야 함
- 상속을 사용하는 경우
  - 과일 부모 클래스에 세척 여부 속성을 하나 추가함

---

## 상속의 구현

```Java
public class Fruit {
  public int price;
  protected String barcode;

  public void Info() { ... }
}

public class Apple extends Fruit {
  public Apple() {
    price = 1000;
    barcode = "1234";
  }
}
```

클래스 상속을 사용하는 경우 extends 키워드를 사용해 부모 클래스를 지정해야 함

## 메소드 오버라이드 (Method Overriding)

부모 클래스에 정의되어 있는 메소드를 자식 클래스에서 재정의하는 것

```Java
public class Parent {
  public void testMethod() { ... }
}

public class Child extends Parent {
  @Override
  public void testMethod() { ... }
}
```

위와 같이 부모 클래스의 메소드를 자식 클래스에서 동일 이름으로 선언하되 정의를 다르게 해 재 정의 하는 것이 오버라이드임

`부모 클래스의 메서드를 재정의 하기 위해서는 @Override 라는 어노테이션을 사용할 수 있다`

### 어노테이션

어노테이션(annotation)은 어떤 클래스나 메서드에 특정한 정보를 메타데이터의 개념으로 추가하는 것

### @Override 어노테이션을 사용하는 이유

```Java
public class Parent {
  public void testMethod() { ... }
}

public class Child1 extends Parent {
  public void testMethod() { ... }
}

public class Child2 extends Parent {
  @Override
  public void testMethod() { ... }
}
```

위의 코드를 보면 Child1, Child2 모두 testMethod를 오버라이드 하여 재정의 하는 것을 알 수 있음

하지만 두개의 오버라이드 된 메소드는 큰 차이가 있음

- Child1은 명시적이지 않게, Child2는 명시적으로 오버라이드 하는 것
  - 이는 추후 개발 시 어떤 메소드가 오버라이드 된 것인지 개발과정에서 좀더 명확하게 알아볼 수 있도록 함
- 만약 Parent 클래스의 testMethod의 이름이 바뀌게 되는 경우
  - Child1은 부모 클래스의 메소드를 재정의 한 것이 아닌 클래스의 고유한 메소드로 인식하여 디버그, 런타임 시 오류가 나지 않음
  - Child2는 부모 클래스의 메소드를 재정의 한 것이라고 명시적으로 메타데이터에 정의 해놓았으므로, 부모 클래스의 오버라이드 한 메소드의 이름이 바뀌면 실행 시점에서 오버라이드 한 메소드가 존재하지 않는다고 오류가 확인됨

## 부모 클래스와의 관계

### 부모 클래스와 자식 클래스의 관계

A와 B 클래스가 있다고 가정했을 때, B 클래스가 A 클래스를 상속했을 때

- A 객체는 B 객체의 인스턴스를 할당받을 수 있음
  - 이 경우 B 클래스의 인스턴스를 할당받은 A 객체는 B 객체에만 존재하는 메소드를 호출할 수 없음
  - A 클래스의 메소드를 B 클래스가 오버라이드 한 경우, A 객체가 메소드를 실행하면 B 클래스의 메소드가 실행됨
- 하지만 반대로 B객체는 A 객체의 인스턴스를 할당받을 수 없음

### 부모 클래스의 생성자, 메소드 호출

```Java
public class Parent {
  public Parent() { ... }

  public void testMethod() { ... }
}

public class Child extends Parent {
  public Child() {
    super(); // 부모 클래스의 생성자 호출
  }

  @Override
  public void testMethod() { 
    super.testMethod(); // 부모 클래스의 메서드 호출
  }
}
```

위와 같이 super 키워드를 사용하여 오버라이드 한 부모 클래스의 생성자나 메소드를 호출할 수도 있음

