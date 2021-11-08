# 예외처리

프로그램 자체의 문제나, 개발자의 실수로 인한 문제가 발생했을 때 발생한 예외로 인한 시스템 동작 자체가 멈추는 것을 박는 것을 예외처리라고 함

## 에러와 예외

### Error

- 시스템 자체에 비정상적인 상황으로 인해 문제가 발생하는 것
- 보통 시스템 단계에서 발생하기에 심각한 레벨임
- 개발자가 미리 예측하여 대처하기 힘들어, 어플리케이션에서는 오류에 대해서 신경쓰지 않아도 됨 

### Exception

- 개발자의 로직 구현 실수등에 의해 발생함
- 개발자가 미리 예측해 대처할 수 있음
- 예외를 구분하고 그에 따른 대처 방법을 명확히 알고 적용하는 것이 중요

## 예외 클래스

모든 예외 클래스들은 Throwable을 상속받고 있음

### Error

### Exception

- 예외 클래스들의 상위 클래스
- 모든 예외들은 이 클래스를 상속받음

#### Checked Exception

- 예외처리를 반드시 해야 하는 경우
  - 반드시 Try-Catch 블럭이나 throw로 던져서 처리해야 함
- 컴파일 단계에서 발생함
- Exception 클래스를 상속받는 하위 클래스 중 Runtime Exception을 제외한 예외

```java
IOException, SQLException
```

#### Unchecked Exception

- 명시적인 처리를 강제하지 않음
- 실행 단계에서(Runtime) 발생함
- Runtime Exception을 하위(자식)클래스로 가지고 있음

```java
NullPointerException, // 객체를 가리키지 않고 있는 레퍼런스를 사용할 때
IllegalArgumentException, 
NumberFormatException, // 정수, 실수같은 수 데이터에 문자열, 문자 등 올바르지 않은 데이터를 넣었을 때
IndexOutOfBoundException, // 배열에서 존재하지 않는 인덱스에 접근할 때, 크기를 벗어난 범위에 접근 할 때
SystemException
```

## 예외처리

```java
try {
  // 예외가 발생할 수 있는 코드
} catch (Exception e) {
  // 예외가 발생했을 때 처리할 코드
} final {
  // 예외 발생 여부에 상관없이 try 블럭을 실행 한 이후에 실행됨
}
```

### Try-Catch 블럭

Exception 및 RuntimeException의 하위 클래스를 이용하여 다양한 예외처리가 가능함

```java
Scanner scanner = new Scanner(System.in);

try {
  System.out.println("input i : ");
  int i = scanner.nextInt();
  System.out.println("input j : ");
  boolean j = scanner.nextBoolean();
  int[] iArr = {1, 2, 3, 4, 5};
  for (int k = 0; k < 6; k++) {
    System.out.println("iArr[" + k + "] : " + iArr[k]);
  }
  LinkedList list = null;
  System.out.println("list.size() : " + list.size());
} catch (InputMismatchException e) {
  e.printStackTrace();
} catch (ArrayIndexOutOfBoundsException e) {
  e.printStackTrace();
} catch (Exception e) {
  e.printStackTrace();
}
```

### Finally

예외 발생에 상관 없이 try 블럭을 실행한 후 무조건 실행됨

```java
int result = 0;

try {
  result = 10 / 0; // 0으로 나눔으로써 예외 발생
} catch (Exception e) {
  e.printStackTrace();
  String msg = e.getMessage();
  System.out.println("Exception: " + msg);
  // 
} finally {
  System.out.println("Final Block");
}

/*
Final Block // try블럭을 실행한 후 finally 블럭으로 이동해 실행
java.lang.ArithmeticException: / by zero
	at Chapter21.MainClass.main(MainClass.java:8)
Exception: / by zero
*/
```

### Throws

예외가 발생할 시 함수에서 직접 처리하지 않고 함수를 호출한 곳으로 예외를 넘김

```java
public static void main(String[] args) {
  try {
    ExceptionMethod();
  } catch (Exception e) {
    e.printStackTrace();
    System.out.println("Exception: " + e.getMessage());
    // Exception: / by zero
  }
}

public static void ExceptionMethod() throws Exception {
  int result = 10 / 0;
}
```

[(참고블로그)](https://www.nextree.co.kr/p3239/)