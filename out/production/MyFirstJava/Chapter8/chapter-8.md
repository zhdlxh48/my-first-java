# 메소드

## 메소드의 형태

```Java
접근자 반환형 메소드명(매개변수) { // 메소드 선언
    // 메소드 실행문 (메소드 정의)
}
메소드명(매개변수); // 메소드 호출

// ex)
public int addNumber(int a, int b) {
    return a + b;
}
addNumber(1, 2); // Result: 3
```

## 매개변수

- 매개변수는 메소드에 전달되는 값을 의미함

- 매개변수는 변수의 타입과 변수명으로 이루어져있음

- 매개변수는 선언되지 않거나 한개 이상 선언할 수 있음

- 매개변수는 지역변수로써, 메소드 안에서만 사용할 수 있음

```Java
public void testMethod(type name, type name2 ...)
```

## 메소드 오버로딩

Method Overloading

- 같은 메소드의 이름으로 다른 형태의 메소드를 정의할 수 있음

  - 매개변수의 타입이 다름
  - 매개변수의 개수가 다름

- 메소드 오버라이드(override)는 다른 개념이므로 착각하지 않도록 주의해야 함

```Java
public void testMethod(int test) { ... }

// 매개변수의 개수를 다르게 해서 오버로딩
public void testMethod(int test, int test2) { ... }

// 매개변수의 타입을 다르게 해서 오버로딩
public void testMethod(float test) { ... }

// 리턴값의 타입이 달라도 매개변수가 같다면 오버로딩에 해당되지 않음
public int testMethod(int test) { ... } // [x]
```

## 메소드의 접근

- public: 메소드가 선언된 클래스 외부에서도 호출가능

```Java
// 내부의 클래스
public class TestClass {
  public void testMethod() { ... }
}

// 외부의 다른 클래스
public class MainClass {
  testMethod(); // 호출 가능
}
```

- private: 메소드가 선언된 클래스 내부에서만 호출가능

```Java
// 내부의 클래스
public class TestClass {
  private void testMethod() { ... }
}

// 외부의 다른 클래스
public class MainClass {
  testMethod(); // 호출 불가능
}
```
