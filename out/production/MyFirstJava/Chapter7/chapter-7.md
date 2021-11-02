# 객체지향 프로그래밍

## 객체

- 프로그램에 구현되는 프로그래밍적 단위
- 클래스의 형태를 그대로 가지고 있는 실체

---

## 클래스

- 객체를 생성하기 위한 틀
- 멤버변수, 메서드, 생성자등의 집합

### 클래스의 형태

```Java
public class 클래스명 {
  public type 멤버변수명;
  // 멤버변수는 여러개 있을 수 있음

  public 클래스명() {
    // 기본 생성자
    // 이곳에서 클래스가 인스턴스화 될 시점에 실행하거나 초기화 할 행동을 작성
  }
  public 클래스명(type 매개변수명, type 매개변수명) {
    // 매개변수를 받는 생성자
    // 매개변수는 여러개 존재할 수 있음
    // 이곳에서 클래스가 인스턴스화 될 시점에 실행하거나 초기화 할 행동을 작성
  }

  public type 메서드명(type 매개변수명) {
    // 메서드는 여러개 있을 수 있음
    // 메서드는 반환값이 있을 수 있음
    // 메서드는 매개변수를 받을 수 있음
  }
}
```

### 클래스의 구성요소

- 멤버변수
- 메서드
- 생성자

자전거에 비유하자면...

| 멤버변수                         | 메서드                    |
| -------------------------------- | ------------------------- |
| 핸들, 바퀴, 체인, 바디, 브레이크 | 기어 변속, 핸들 방향 변경 |

### 생성자

```Java
public class 클래스명 {
  public 클래스명() {
    // 기본 생성자
    // 이곳에서 클래스가 인스턴스화 될 시점에 실행하거나 초기화 할 행동을 작성
  }
  public 클래스명(type 매개변수명, type 매개변수명) {
    // 매개변수를 받는 생성자
    // 매개변수는 여러개 존재할 수 있음
    // 이곳에서 클래스가 인스턴스화 될 시점에 실행하거나 초기화 할 행동을 작성
  }
}
```

생성자는 위와 같은 모습을 하고 있음

- 생성자에 매개변수가 없는 것을 기본 생성자라고 함 (Default Constructor)
- 생성자에는 매개변수를 받을 수도 있음 (Parameterized Constructor)

---

## 객체 vs 인스턴스

### 객체

객체지향적 관점으로 보았을 때 클래스의 타입을 가지고 선언되었을 때 그 변수를 객체라고 부른다

메모리에 실체화 되어있지 않은 상태

### 인스턴스

- 객체에 해당하는 실체, 객체의 클래스를 이용해 메모리에 실체화된 것

- 메모리에 공간이 할당되어 실제로 사용되는 것

- 추상적인 개념(또는 명세)과 구체적인 객체 사이의 관계 에 초점을 맞출 경우에 사용됨

  - 객체는 클래스의 인스턴스
  - 인스턴스는 어떤 원본(추상적인 개념)으로부터 ‘생성된 복제본’을 의미
    [(참고 블로그)](https://gmlwjd9405.github.io/2018/09/17/class-object-instance.html)

```Java
public class Animal { ... } // Class, 클래스

public class Main {
  public static void main(String[] args) {
    Animal cat, dog; // '객체'

    // new 키워드를 사용, 인스턴스화
    // cat은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
    cat = new Animal();
    // dog은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
    dog = new Animal();
  }
}
```