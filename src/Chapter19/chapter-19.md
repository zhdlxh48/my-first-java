# 문자열 클래스

## String

일반적인 문자열 클래스

- 특징
  - 문자열 클래스 변수에 문자열을 할당할 때 메모리에 정해진 크기를 할당받아 인스턴스를 생성함
    - 이 할당된 공간은 절대 변하지 않음
    - 결론적으로 한번 할당된 문자열의 인스턴스는 절대 변하지 않음 (Immutable)
  - 문자열이 할당된 객체에 문자열을 대입하거나 연산을 진행하면 기존 객체에 대입된 문자열 인스턴스는 사라지고 새로운 문자열을 가진 String 인스턴스가 할당됨

```Java
String str = "Hello"; // str의 인스턴스 주소가 1이라고 가정
str += " World"; // str의 인스턴스 주소 2로 변경됨 - 새롭게 "Hello World" 문자열의 인스턴스 생성, 기존의 인스턴스는 GC가 일어남
System.out.println(str);
```

## StringBuffer

문자열이 변경됨에 따라 객체의 크기가 변하면 유연하게 버퍼의 크기를 조절해주는 클래스

- 특징
  - 인스턴스의 크기가 가변적으로 변함
  - 메소드 별로 synchronized keyword가 존재해 멀티 스레드 상황에서 동기화를 지원
  - StringBuilder 클래스에 비해 속도는 낮지만 안정성이 높음
  - 클래스에 수많은 문자열 변경 메소드가 제공됨

```Java
StringBuffer sb = new StringBuffer("Hello, World!");
System.out.println(sb);
sb.delete(7, 12); // Hello, 
sb.append("Java!");
```

## StringBuilder

StringBuffer랑 비슷하지만 메소드별로 synchronized keyword가 없어 멀티 스레드 상황에서 동기화를 지원하지 않음

- 특징
  - 인스턴스의 크기가 가변적으로 변함
  - StringBuffer 클래스에 비해 속도는 빠름
  - 클래스에 수많은 문자열 변경 메소드가 제공됨

```Java
StringBuilder sb = new StringBuilder("Hello, World!");
System.out.println(sb);
sb.delete(7, 12); // Hello, 
sb.append("Java!");
```

## String을 사용하는 좋은 경우

StringBuffer, StringBuilder를 생성할 때, 버퍼의 크기를 초기에 정해주는 작업이 생김

이런 경우로 생성 초기에 인스턴스의 생성 속도가 느림

중간에 문자열 변경의 경우에도 버퍼의 크기를 조절해주는 작업이 필요하는 등 내부적인 연산이 필요해 많은 양의 문자열 연산이 아닌 경우 String이 다시 객체를 생성하는 속도보다 느릴 수 있음

- 잦은 문자열 수정이 필요하다면 StringBuffer, StringBuilder가 유리
- 일시적인 문자열 수정, 문자열 수정이 없는 경우 String이 유리