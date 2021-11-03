# 패키지

패키지는 클래스들을 묶어서 하나의 폴더형식으로 관리해주는 것

## 기본 패키지

java.*

- java. 으로 시작되는 것들은 자바에서 기본적으로 제공하는 패키지들임
  - 자바의 버전에 따라 기본적으로 제공하는 패키지와 클래스들이 다를 수 있음

## 패키지 네이밍

패키지는 자바의 클래스들을 관리하는 형태이며, 소속된 클래스마다 고유한 네이밍 공간을 제공한다

- 패키지 이름은 다른 패키지에 속해있는 클래스의 이름과 중복되는것을 방지되도록 함
- 개발 중에 자유롭게 패키지 이름을 변경할 수 있음
  - 다만 패키지 이름을 변경할 경우 그 패키지를 사용하는 곳에서도 이름을 전부 변경해야 함
- 패키지 이름만 보고도 당 패키지 안에 클래스들이 어떤 속성과 기능을 가지고 있는지 알 수 있게 해야 함
- 동일한 패키지 내의 클래스들은 ***서로의 package-private 및 protected 멤버들에 접근***할 수 있음

### 권장 규칙 (네이밍 컨벤션)

1. 소문자만 사용
2. 회사의 경우 회사의 도메인을 거꾸로 뒤집어서 명명
3. 동일 회사 내에서 동일 패키지는 지역, 프로젝트 명 등을 사용하여 구분이 가능
4. 숫자, 하이픈, 예약어가 사용된 경우는 언더 스코어로 대치해 줌

| 도메인 이름                 | 패키지 이름                 |
| :-------------------------- | :-------------------------- |
| hyphenated-name.example.org | org.example.hyphenated_name |
| example.int                 | int_.example                |
| 123name.example.com         | ccom.example._123name       |

[(참고자료-1)](https://zetawiki.com/wiki/자바_패키지_네이밍)
[(참고자료-2)](https://zetawiki.com/wiki/자바_패키지)

## 패키지 선언

기본적으로 프로젝트의 루트로부터 폴더의 경로를 패키지의 이름으로 취급하며, 패키지를 선언하는 방법은 다음과 같음

```Java
// /com.example.testFunction - 폴더 경로
package com.example.testFunction;

public class TestClass {
  ...
}

// /com.example2.secondFunction - 폴더 경로
package com.example2.secondFunction;

public class TestClass {
  ...
}
```

## 패키지 사용

### 사용하고자 하는 클래스가 다른 패키지에 속해있을 경우
- 패키지의 이름과 사용하고자 하는 클래스들을 import 키워드와 함께 명시해야 함

```Java
// /com.fruit.apple - 폴더 경로
package com.fruit.apple;

public class Apple {
  ...
}

// /com.seller.person - 폴더 경로
package com.seller.person;

import com.fruit.apple.Apple;

public class Person {
  Apple apple = new Apple(); // 사용 가능
}
```

### 사용하고자 하는 클래스가 다른 패키지에 속해있고, ***패키지의 모든 클래스를 사용하고자 하는 경우***

```Java
// /com.fresh.fruit - 폴더 경로
package com.fresh.fruit;

public class Apple {
  ...
}
public class Grape {
  ...
}

// /com.seller.person - 폴더 경로
package com.seller.person;

import com.fresh.fruit.*;

public class AppleMango {
  Apple origin = null; // 사용 가능
  Grape grape = null; // 사용 가능
}
```

### 사용하고자 하는 클래스가 같은 패키지에 속해있을 경우
- 상단에 package 키워드와 함께 명시된 패키지의 이름이 같은 경우 생략 가능

```Java
// /com.fruit.apple - 폴더 경로
package com.fruit.apple;

public class Apple {
  ...
}

// /com.fruit.apple - 폴더 경로
package com.fruit.apple;

public class AppleMango {
  Apple origin = null; // 사용 가능

  public AppleMango() {
    origin = new Apple(); // 사용 가능
  }
}
```