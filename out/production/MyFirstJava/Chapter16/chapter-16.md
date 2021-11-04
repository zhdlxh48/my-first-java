# 여러가지 클래스

## 내부 클래스

1. 내부 클래스

- 내부 클래스, Non-Static Nested Class

내부 클래스로써 일반 클래스 안에 있는 클래스를 말함

밖에 있는 클래스는 내부 클래스를 멤버변수로처럼 사용이 가능함 (다만 사용시에 new 키워드로 생성해야 함)

내부 클래스는 외부 클래스의 자원(멤버변수, 멤버함수)을 사용할 수 있음

```Java
public class OuterClass {
  public class InnerClass { ... }
}

public class MainClass {
  public static void main(String[] args) {
    // 외부 클래스의 인스턴스가 있어야만 내부 클래스를 사용할 수 있음
    OuterClass.InnerClass inner = new OuterClass().new InnerClass();
    // or
    OuterClass outer = new OuterClass();
    OuterClass.InnerClass inner = outer.new InnerClass();
  }
}
```

- 클래스 파일 생성
  - OuterClass.class
  - OuterClass$InnerClass.class

2. 정적 클래스 (static class)

- 정적 중첩 클래스, Static Nested Class 

내부 클래스(인스턴스 클래스)와 비슷하지만 static 키워드와 함께 선언됨

정적 클래스는 외부 클래스의 자원에 static 키워드가 붙어 있어야만 사용할 수 있음

`외부 클래스의 객체 생성 없이도 정적 클래스의 생성이 가능함`

```Java
public class OuterClass {
  static class InnerClass { ... }
}

public class MainClass {
  public static void main(String[] args) {
    OuterClass.InnerClass inner = new OuterClass.InnerClass();
  }
}
```

3. 지역 클래스 (local class)

메소드 내부에 정의된 클래스를 말함

메소드 내부에서만 사용이 가능하며, 메소드 내부에서만 new 키워드로 생성이 가능함

```Java
public class OuterClass {
  public void method() {
    class InnerClass { ... } // 이 메서드 안에서만 사용가능
    InnerClass inner = new InnerClass();
  }
}
```

- 클래스 파일 생성
  - OuterClass.class
  - OuterClass$'Index'InnerClass.class

4. 익명 클래스 (anonymous class)

- 익명클래스는 인스턴스 변수명이 존재하지 않음
- new 와 동시에 부모클래스를 상속받아 내부에서 오버라이딩해서 사용함
- 매개변수로 활용이 가능함
- 주로 상속을 받아야 하지만 한번만 사용할 일회성 클래스 인스턴스를 생성하기 위해 사용함
- 생성자를 사용할 수 없음
- 익명 클래스 외부의 자원들은 final 키워드가 붙은 것들만 가능함
- 익명 클래스로 사용할 클래스를 미리 지정해 놓아야 함
  - 미리 지정한 클래스의 형태에서, 바로 외부의 부모 클래스를 상속받고 사용함

```Java
class AnonymousClass {
  public void method() { ... }
}

public class OuterClass {
  new AnonymousClass() { // OuterClass를 상속받음
    @Override
    public void method() { ... }
  }.method();
}
```

[(참고자료1)](http://www.tcpschool.com/java/java_usingClass_innerClass)
[(참고자료2)](https://sjh836.tistory.com/145)

### 내부 클래스의 단점

내부 클래스는 항상 외부 클래스를 참조하고 있음

하지만 그 참조는 숨겨져 있음(숨김참조)

항상 외부 클래스를 참조하고 있다는 것은 GC가 참조로 인해 제대로 작동하지 않을 수 있다는 의미

그로인해 메모리 공간의 불필요하게 차지하는 공간이 늘어나므로, 내부 클래스보단 정적 중첩 클래스를 사용하는 것을 권장함

[(참고자료)](https://siyoon210.tistory.com/141)

## 추상 클래스

클래스의 공통된 부분의 형태만을 만들고, 이를 상속해서 사용함

```Java
abstract class AbstractClass {
  public int field;

  public AbstractClass() { ... }

  abstract void method();

  public void method2() { ... }
}

public class TestClass extends AbstractClass {
  @Override
  public void method() { ... }
}
```

특징

- 추상 클래스는 인스턴스를 생성할 수 없음
- 일반적으로 상속하듯이 상속을 함
- abstract 메서드는 정의가 없는 메서드임
  - 이 메서드는 상속을 받은 클래스에서 반드시 재정의해야 함
- 멤버변수, 메서드, 생성자도 정의할 수 있음