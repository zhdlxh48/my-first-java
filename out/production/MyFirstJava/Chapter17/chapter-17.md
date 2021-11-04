# 인터페이스

인터페이스란 클래스에 사용되는 메소드를 정의하는 명세서의 개념임

인터페이스는 클래스를 상속받을 때 사용하는 extends 키워드 대신 implements 키워드를 사용함

## 인터페이스를 사용하는 이유

하나의 객체가 여러가지의 자료형을 사용할 수 있기 때문

## 인터페이스의 형태

```Java
public interface InterfaceName {
  // 인터페이스에 정의된 메소드들
  public void method1();
  public void method2();
}

public class ClassName implements InterfaceName {
  // 인터페이스를 구현하는 클래스에서 인터페이스에 정의된 메소드들을 구현해야 함
  public void method1() { /* 인터페이스의 메소드 정의 부분 */ }
  public void method2() { /* 인터페이스의 메소드 정의 부분 */ }
}
```

### 인터페이스 안의 상수

```Java
public interface InterfaceName {
  // 인터페이스에 정의된 상수들
  public static final int CONSTANT1 = 1;
  public static final int CONSTANT2 = 2;
}
```

- 상단처럼 인터페이스에 정의된 상수들은 클래스에서 사용할 수 있으나 수정은 불가능함 (final)

## 인터페이스의 활용

```Java
public interface InterfaceA {
  public void method1();
}
public interface InterfaceB {
  public void method2();
}

public class ClassName implements interfaceA, interfaceB { ... }

public class MainClass {
  public static void main(String[] args) {
    ClassName obj = new ClassName();
    obj.method1(); // interfaceA의 method1() 호출
    obj.method2(); // interfaceB의 method2() 호출

    // ClassName 클래스에서 InterfaceA를 구현하고 있으므로, ClassName 클래스의 인스턴스를 할당받을 수 있으며 InterfaceA 인터페이스의 메소드인 method1를 호출할 수 있음
    InterfaceA objA = new ClassName();
    objA.method1();

    // ClassName 클래스에서 InterfaceB를 구현하고 있으므로, ClassName 클래스의 인스턴스를 할당받을 수 있으며 InterfaceB 인터페이스의 메소드인 method2를 호출할 수 있음
    InterfaceB objB = new ClassName();
    objB.method2();
  }
}
```

[(침고자료)](https://wikidocs.net/217)

## 인터페이스와 추상클래스의 차이

| 인터페이스                                                                  | 추상클래스                                                                                                |
| :-------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------- |
| 추상 메서드를 선언함                                                        | 추상 메서드를 선언, 일반 메서드를 선언 및 정의, 생성자 사용가능함                                         |
| 상수만 선언이 가능함                                                        | 일반 클래스와 같이 사용이 가능함                                                                          |
| 구현되는 클래스에서 반드시 인터페이스에 선언된 메서드를 정의, 오버라이드 함 | 추상 클래스에 일반 메소드를 제외하고, abstract로 선언된 추상 메서드만 반드시 메서드를 정의, 오버라이드 함 |
| 다형성을 정의할 수 있음                                                     | 단일 상속만 지원함                                                                                        |
