# 접근제한자

## private

private 키워드가 붙은 메서드, 속성, 변수는 클래스 외부에서 접근할 수 없음

```Java
// 자바 파일의 가장 외부의 클래스, 최상위 클래스에는 private 키워드를 사용할 수 없음
public class PrivateClass {
  private int privateField;
  private void privateMethod() {
    privateField = 1;
  }
}

public class MainClass {
  public static void main(String[] args) {
    PrivateClass privateClass = new PrivateClass();
    // privateMethod()를 호출할 수 없다.
    privateClass.privateMethod();
    // privateField 변수를 사용할 수 없다.
    System.out.println(privateClass.privateField);
  }
}
```

### private class

최상위 클래스는 private 키워드를 사용할 수 없고, 클래스의 안에만 존재할 수 있음 (Inner Class)

```Java
public class PrivateClass {
    // 이 클래스는 PrivateClass 안에서만 사용할 수 있음
  private class PrivateInnerClass {
    // 외부에서는 이 함수에 직접 접근이 불가능함
    public void PrintInfo() { ... }
  }
  public void PrintInfo() {
    PrivateInnerClass privateInnerClass = new PrivateInnerClass();
    privateInnerClass.PrintInfo();
  }
}

public class MainClass {
  public static void main(String[] args) {
    PrivateClass privateClass = new PrivateClass();
    privateClass.PrintInfo();
  }
}
```

[(참고블로그)](https://hashcode.co.kr/questions/6441/private으로-선언된-클래스-내부의-public-static-변수-접근)

## public

public 키워드가 붙은 메소드, 속성, 변수는 클래스 내, 외부에서 자유롭게 사용이 가능함

```Java
public class PublicClass {
  public int publicField;
  public void publicMethod() { ... }
}

public class MainClass {
  public static void main(String[] args) {
    PublicClass publicClass = new PublicClass();
    publicClass.publicMethod();
    System.out.println(publicClass.publicField);
  }
}
```

## default

어떠한 접근제한자도 적혀있지 않은 메소드, 속성, 변수는 같은 패키지 내부에서만 자유롭게 사용이 가능함

```Java
// package: com.example.Default
class DefaultClass {
  int defaultField;
  void defaultMethod() { ... }
}

// package: com.example.Default
public class MainClass {
  public static void main(String[] args) {
    DefaultClass defaultClass = new DefaultClass();
    defaultClass.defaultMethod();
    System.out.println(defaultClass.defaultField);
  }
}

// package: com.example.not_Default
public class MainClass {
  public static void main(String[] args) {
    // 아래의 모든 접근은 불가능함
    DefaultClass defaultClass = new DefaultClass();
    defaultClass.defaultMethod();
    System.out.println(defaultClass.defaultField);
  }
}
```

## protected

protected 키워드가 붙은 메소드, 속성, 변수는 같은 패키지 내부에서만 자유롭게 사용이 가능함

그 외에 protected 키워드를 사용하는 경우, 상속을 통해 상속받은 클래스에서도 자유롭게 사용이 가능함

그 경우 상속받은 클래스에서는 new 키워드를 통한 protected 클래스의 생성자 호출은 불가능함

super을 통한 상속받은 클래스의 생성자를 호출할 수 있음

```Java
// package: com.example.Protected
public class ProtectedClass {
  protected int defaultField;
  protected void defaultMethod() { ... }
}

// package: com.example.Protected
public class MainClass {
  public static void main(String[] args) {
    ProtectedClass protectedClass = new ProtectedClass();
    protectedClass.defaultMethod();
    System.out.println(protectedClass.defaultField);
  }
}

// package: com.example.not_Protected
// 다른 패키지에서는 클래스를 상속해야만 접근 가능
public class AnotherClass extends ProtectedClass {
  public AnotherClass() {
    // new ProtectedClass()는 접근 불가능
    // 반드시 부모 클래스의 생성자를 super()로 호출해야 함
    super();
    this.defaultMethod();
    System.out.println(this.defaultField);
  }
}

// package: com.example.not_Protected
public class MainClass {
  public static void main(String[] args) {
    // 아래의 모든 접근은 불가능함
    DefaultClass defaultClass = new DefaultClass();
    defaultClass.defaultMethod();
    System.out.println(defaultClass.defaultField);
  }
}
```