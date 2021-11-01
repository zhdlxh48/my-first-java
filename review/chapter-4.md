# 연산자

## N항연산자

### 단항 연산자

- +x, -x, !x
- 피연산자가 하나 존재하는 연산자

### 이항 연산자

- x += 1, x \*= y, x < 2, x = num
- 피연산자가 두개 존재하는 연산자
- 상수도 피연산자에 해당함

### 삼항 연산자

- **조건(삼항)연산자**
  - predicate ? true : false

```Java
x < 0 ? "negative" : "positive";
```

- 삼항 연산자는 위의 경우가 대부분임
- 조건에 부합하면 ? 바로 뒤의 값이, 부합하지 못하면 : 뒤의 값이 할당됨

## 대입연산자

변수에 상수나 다른 변수의 값을 "=" 연산자를 사용해 대입하는 연산자

오른쪽의 값을 왼쪽에 대입하는 연산이 이루어짐

```Java
int num;
num = 10; // 대입 연산자 사용
int num2 = num; // 초기화도 대입 연산
```

## 산술연산자

- \+
  - 덧셈

```Java
 int num = 1 + 2; // 3
```

- \-
  - 뺄셈

```Java
 int num = 1 - 2; // -1
```

- \*
  - 곱셈

```Java
 int num = 2 * 3; // 6
```

- \/
  - 나눗셈

```Java
 int num = 4 / 2; // 2
```

- \%
  - 나머지

```Java
 int num = 5 % 2; // 1
```

## 복합 대입연산자

연산이 이루어진 후 좌측의 변수, 항에 연산의 결과가 대입됨

- +=

```Java
int num = 10;
num += 5; // num == 15
```

- -=

```Java
int num = 10;
num -= 5; // num == 5
```

- \*=

```Java
int num = 10;
num *= 5; // num == 50
```

- /=

```Java
int num = 10;
num /= 5; // num == 2
```

- %=

```Java
int num = 10;
num %= 5; // num == 0
```

## 관계연산자

두 상수 혹은 변수의 크기적 관계를 비교해 참과 거짓을 표현하는 연산자,
비교연산자라고도 함

- \>
  - 좌항이 우항보다 크다면 참

```Java
boolean result = 3 > 4; // Result: false
```

- \<
  - 좌항이 우항보다 작다면 참

```Java
boolean result = 3 < 4; // Result: true
```

- \>=
  - 좌항이 우항보다 크거나 같다면 참

```Java
boolean result = 3 >= 4; // Result: false
boolean result = 4 >= 4; // Result: true
```

- \<=
  - 좌항이 우항보다 작거나 같다면 참

```Java
boolean result = 3 <= 4; // Result: true
boolean result = 4 <= 4; // Result: true
```

- \==
  - 좌항이 우항과 같다면 참

```Java
boolean result = 4 == 4; // Result: true
boolean result = 3 == 4; // Result: false
```

- \!=
  - 좌항과 우항이 다르다면 참

```Java
boolean result = 3 != 4; // Result: true
boolean result = 4 != 4; // Result: false
```

## 증감연산자

### 전위연산자

변수를 사용하기 전에 1을 증가시킨다

```Java
int num = 1;
System.out.println(++num); // Result: 2
```

### 후위연산자

변수를 사용한 후에 1을 증가시킨다

```Java
int num = 1;
System.out.println(num++); // Result: 1
System.out.println(num); // Result: 2
```

## 논리연산자

- \&\&
  - 좌항과 우항이 모두 참이면 참

- \|\|
  - 좌항과 우항 중 하나라도 참이면 참

- \!
  - 변수의 논리를 부정

## 비트연산자

데이터를 비트 단위로 연산하는 연산자

다른 연산에 비해 연산의 속도가 빠르다

- \&
  - 좌항과 우항의 값을 2진수로 보았을 때 같은 자리에 있는 비트가 모두 1이면 1, 그렇지 않으면 0 (AND 연산을 의미)

- \|
  - 좌항과 우항의 값을 2진수로 보았을 때 같은 자리에 있는 비트가 모두 0이면 0, 그렇지 않으면 1 (OR 연산을 의미)

- \^
  - 베타적 논리합
  - 좌항과 우항의 값을 2진수로 보았을 때 같은 자리에 있는 비트가 같으면 0, 그렇지 않으면 1 (XOR 연산을 의미)

