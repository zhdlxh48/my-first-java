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

```Java
ClassType variable = null;
System.out.println(variable);
```
