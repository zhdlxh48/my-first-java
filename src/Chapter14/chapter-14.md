# 데이터 은닉

객체가 지니고 있는 데이터를 외부로 노출하지 않아 데이터의 변질을 막는 것 (캡슐화)

## private 멤버변수

- 클래스의 내부에서만 사용하는 변수
- 중요한 데이터 같은 경우 private 키워드를 사용해 클래스의 외부에서 직접적으로 접근하는 것을 방지함
- getter, setter 메서드를 사용해 변수를 직접 조작하는 것을 방지해 잘못된 값을 저장하지 않도록 함

## Getter

```Java
public class Fruit {
  private String name;

  public String getName() {
    return name;
  }
}
```

## Setter

```Java
public class Fruit {
  private String name;

  public void setName(String name) {
    this.name = name;
  }
}
```

[(참고블로그)](https://mainpower4309.tistory.com/7)