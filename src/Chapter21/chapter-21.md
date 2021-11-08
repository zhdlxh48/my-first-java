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

[(참고블로그)](https://www.nextree.co.kr/p3239/)