# 람다식 (Lambda Expression)

람다식이란 특별한 키워드, 함수명, 식별자 없는 함수임

함수를 하나의 식처럼 표현한 것이며, 함수명이 없어 익명 함수라고 하기도 함

## 람다식의 특징

```Java
interface 인터페이스 {
  public void 메서드(파라미터 타입 파라미터);
}

(파라미터) -> 리턴값 // 대괄호 없이 바로 리턴이 가능
(파라미터) -> {
    실행문;
    리턴값;
}
```

1. 람다식 내부에서 선언되고 정의된 모든 상수는 키워드가 붙지 않아도 모두 final, 상수 취급을 받는다
2. 대괄호 없이 바로 리턴이 가능하다
3. return 키워드를 사용하면 반드시 대괄호 안에 선언해야 한다
4. 파라미터는 자동으로 타입 추론을 진행하고, 타입을 명시하는 것은 자유임

## 람다식의 사용

람다식은 인터페이스 객체에 람다식으로 만든 함수를 할당하여 사용함

- 람다식을 사용하지 않는 경우
```Java
interface MyInterface {
  int func(int a, int b);
}

// 람다식을 사용하지 않을 때
MyInterface myInterface = new MyInterface() {
  @Override
  public int func(int a, int b) {
    return a + b;
  }
};
```

- 람다식을 사용하는 경우
```Java
@FunctionalInterface
interface MyInterface {
  int func(int a, int b);
}

// 람다식을 사용할 때
MyInterface myInterface = (a, b) -> a + b;
```

단 위의 경우 주의해야 하는 점이 있음

- @FunctionalInterface 어노테이션을 사용해야 함 (권장)
- 인터페이스에는 하나의 추상함수만 있어야 함

[(참고 블로그)](https://mangkyu.tistory.com/113)