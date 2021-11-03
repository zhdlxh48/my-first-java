# 생성자, 소멸자 그리고 this

## 생성자

생성자는 객체가 인스턴스화 될 때 호출하는 함수임

생성자의 모습은 기본적으로 아래의 형태를 띄고 있음

```Java
접근자 class 클래스명(매개변수){
  초기화 블록
}
```

매개변수는 생성자의 종류에 따라 있을 수도 없을 수도 있음

클래스 내부의 멤버변수의 초기값을 지정해 주거나 클래스가 인스턴스화 될 시점에 실행해야 할 함수가 있는 경우에 사용함

### 기본 생성자

- 기본 생성자는 디폴트 생성자 또는 사용자 정의 생성자 라고도 함

- 아래와 같이 기본 생성자는 인자를 받지 않는 형태로 되어있음

- 사용자가 정의하지 않아도 기본 생성자는 컴파일 시점에 기본적으로 생성해줌

```Java
public class TestClass {
  public TestClass() {
    System.out.println("TestClass 생성자");
  }
}
```

### 인자 생성자

- 기본 생성자와 달리 인자를 한개 이상 받는 형태로 되어있음

- 멤버변수의 초기값을 인스턴스마다 다르게 지정해주고자 할 경우에 주로 사용됨

- 인자의 개수나 종류에 따라 생성자를 오버로딩 할 수 있음

```Java
public class TestClass {
  private String name;

  public TestClass(String name) {
    System.out.println("TestClass 생성자, 이름: " + name);
    this.name = name;
  }
}
```

### 생성자에서 생성자 호출

클래스의 생성자의 내부에서 다른 생성자를 호출하는 것이 가능함

```Java
public class TestClass {
  public TestClass() {
    this(0, "");
  }
  public TestClass(int num) {
    this(num, "");
  }
  public TestClass(int num, String name) {
    System.out.println("TestClass 생성자, 인자: " + num + ", " + name);
  }
}
```

이런 식으로 매개변수를 가장 많이 가지고 있는 인자 생성자를 이용할 수 있음

생성자 내부에서 다른 생성자를 사용하기 위해서는 ***this 키워드***가 필요함

## this

클래스의 내부에서 자신의 객체를 호출하기 위해 사용하는 키워드

또한 생성자의 내부에서 다른 생성자를 호출하기 위해서는 this를 메서드처럼 사용하기도 함

- 주의할 점

  - static 메서드에서는 this를 사용할 수 없음

  - static 멤버변수를 this를 통해 사용할 수는 있으니 권장되지 않음
    - 보통은 클래스명.static멤버변수 로 사용함

```Java
public class TestClass {
  private int num;

  public TestClass(int num) {
    this.num = num; // this 키워드를 이용해서 멤버변수임을 명확히 함
  }
}
```

## 소멸자

- 클래스가 소멸될 때 자동으로 호출되는 메서드
  - finalize() 메서드를 이용해서 사용함
- 보통은 소멸자가 눈에 드러나는 일이 없음
  - C, CPP같이 언매니지드언어에서는 소멸자가 있어야 하는 경우가 많음
  - 자바는 GC가 있는 매니지드언어임
- System.gc()
  - 이 메서드를 통해 gc가 빨리 작동하도록 요청할 수는 있음
  - 하지만 메소드 호출 시점에 gc가 돌아간다는 보장은 없음

```Java
@Override
protected void finalize() throws Throwable {
  System.out.println("소멸자 호출");
  super.finalize();
}
```