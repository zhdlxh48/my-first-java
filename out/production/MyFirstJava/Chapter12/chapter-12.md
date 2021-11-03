# Static

## Static 변수

static 변수는 클래스가 인스턴스화 되지 않아도 사용할 수 있는 변수임

여러 객체의 인스턴스들이 공유하면서 사용할 수 있음

```Java
public class StaticVariable {
  public static int staticVariable = 0;
  public int instanceVariable = 0;
}

public class MainClass {
  public static void main(String[] args) {
    // 인스턴스화 하지 않아도 사용 가능
    StaticVariable.staticVariable = 10;
    StaticVariable obj = new StaticVariable();
    // static 키워드가 없으면 인스턴스화 해야 사용 가능
    obj.instanceVariable = 20;
  }
}
```

### Private Static 변수

private static 변수는 public이 아니라서 외부의 사용이 불가능함

이러한 경우 특별하게 싱글톤 패턴이라는 곳에서 사용이 가능함

```Java
// TODO: 싱글톤 패턴 작성할 것
```

## static 메소드

static 메소드는 해당 클래스를 인스턴스화 하지 않고 사용할 수 있는 메소드임

해당 클래스의 변수와만 상호작용하는 메소드가 아닌, 주로 기능적인 메소드를 정의하는 것에 사용됨

```Java
System.out.println("Hello World"); // Static 메소드 예시
// System 클래스를 인스턴스화 하지 않고 사용할 수 있음
```

### static 블록

클래스 안의 static 블록은 클래스가 인스턴스화 되지 않아도 사용할 수 있는 블록임

프로그램이 실행되는 시점에 한 번만 실행되는 블록이라고 볼 수 있음

## 메모리상 위치

> 클래스 변수는 JVM Runtime Data Area에서 Method area 에 들어간다. 여기서 클래스는 Method area에, 객체는 heap에 올라간다. static이 붙으면 클래스의 시그니처?같은 것들이 메모리 상에 로딩되면서 같이 올라가는 것이다. 따라서 아래에서 설명할
> 
> ***static 변수, static 메소드은 Method area***
> 
> 에 들어가므로(생성되므로) 모든 객체에서 가져다 쓸 수 있다.

[(출처)](https://sjh836.tistory.com/125)

[(참고블로그)](https://wikidocs.net/228)
[(참고블로그)](https://chfhrqnfrhc.tistory.com/entry/전역변수와-전적변수)