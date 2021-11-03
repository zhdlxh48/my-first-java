1. final 키워드 사용법

```Java
final int num;
{
  num = 10;
}
```
Q: final 키워드는 선언과 동시에 초기화, 정의가 이루어져야 한다고 했는데 이것이 가능한 이유와 이 문법을 뭐라고 하는지?

2. static 블록

```Java
public class StaticClass {
  public static int static_num = 0;
  public int instance_num = 0;

  static {
    System.out.println("Hello, Static!");
    System.out.printf("static_num is %d", static_num);
    // static_num = 200;
  }

  public int add(int a, int b) {
    return a + b;
  }
  public static int staticAdd(int a, int b) {
    return a + b;
  }
}

public class MainClass {
  static public void main(String[] args) {
    StaticClass.static_num = 200;
      System.out.println(StaticClass.static_num);
      System.out.println(StaticClass.staticAdd(3, 7));

      StaticClass staticClass = new StaticClass();
      staticClass.instance_num = 10;
      System.out.println(staticClass.static_num);
      System.out.println(staticClass.add(1, 4));
  }
}
```
Q: static 블록에서 출력되는 값 중 static_num이 200으로 나오는데 static 블록이 static 변수의 대입 시점보다 빠른데 어떻게 가능한지?