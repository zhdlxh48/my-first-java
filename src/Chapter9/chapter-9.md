# 객체와 메모리

## 동적 할당

### new 키워드

```Java
ClassType variable = new ClassType();
```

자바에서 레퍼런스 타입 변수들을 메모리에 할당하기 위해서는 new 키워드를 사용해야 함

new를 사용하면 메모리에 할당된 인스턴스를 반환하는데, 그 객체는 생성자를 통해서 초기화됨

또한 인스턴스는 레퍼런스 변수인 객체에 그 주소를 저장해 주소로 접근할 수 있게 함

## 참조 변수

```Java
ClassType variable = new ClassType();
```

위에서 나오는 변수인 variable은 우항에서 생성된 인스턴스의 메모리 주소를 담고 있음

이러한 변수를 참조 변수, reference variable라고 함

## 동적 할당된 객체의 특징

### 같은 클래스 타입으로 생성된 객체(인스턴스)

```Java
ClassType variable1 = new ClassType();
ClassType variable2 = new ClassType();
```

위의 코드는 각기 다른 참조 변수에 같은 클래스로 동적 할당된 인스턴스를 담았음

하지만 두 참조변수에 담긴 메모리의 주소를 확인하면 두 참조변수가 다른 메모리 주소를 가리키고 있는 것을 확인할 수 있음

```
36baf30c // variable1의 메모리 참조 주소
7a81197d // variable2의 메모리 참조 주소
```

이처럼 같은 클래스 타입으로 동적 할당을 하더라도 두 참조 변수가 다른 메모리 주소를 가리키고 있는 것을 확인할 수 있음

### null

- null은 동적 할당된 객체가 없을 때 사용되는 값
- 어떠한 메모리 주소도 가리키지 않는 값
- null을 참조 변수에 담았을 때 이 변수를 통해 메모리에 접근하려 시도하면 오류가 발생함
  - 해당 오류는 NullPointerException이라는 예외를 발생시킴

```Java
public class TestClass {
  public void getInfo() {
    System.out.println("This is test info");
  }
}

...

TestClass nullVar = new TestClass();
nullVar.getInfo(); // Result: This is test info
nullVar = null;
nullVar.getInfo(); // Result: NullPointerException
// Cannot invoke "...TestClass.getInfo()" because "nullVar" is null
```

### GC

GC: Garbage Collector

- 자바에서는 메모리 관리를 위해 자바에서 제공하는 가비지 컬렉터를 사용함
- 참조변수를 사용하지 않게되면 GC가 자동으로 실행됨
- GC를 실행하는 시점을 직접 조절할 수는 없음
  - 자바의 내부적으로 참조가 되지않는 객체, 즉 참조 카운트가 0이 된 객체는 GC의 대상이 됨

#### 참조 카운트

Reference Counting

```Java
[1] TestClass obj1 = new TestClass();
[2] TestClass obj2 = new TestClass();
[3] obj1 = obj2;
```

1. obj1에 참조된 인스턴스는 참조 카운트가 1이 됨

- obj1에 new 키워드로 메모리에 객체가 동적할당됨

2. obj2에 참조된 인스턴스는 참조 카운트가 1이 됨

- obj2에 new 키워드로 메모리에 객체가 동적할당됨

3. obj1에 참조되고 있었던 인스턴스는 참조 카운트가 0이 됨

- obj1에 obj2의 참조주소를 담았기 때문에 원래 참조하고 있었던 인스턴스는 아무도 참조하지 않게 되어 참조 카운트가 0이 됨
- GC의 대상이 됨

프로그램 종료 시점에 obj1과 obj2가 참조하고 있는 인스턴스만 참조 카운트가 1이 되어 GC가 진행되어있지 않음
