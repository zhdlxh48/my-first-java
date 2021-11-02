# 조건문

## 조건문이란

조건에 따라서 양자택일 혹은 다자택일, 어떠한 경우 여러 경우를 택하는 구문임

## 조건문의 종류

### if문

```Java
if (조건식) {
  조건식이 참일 경우 실행할 문장
}
```

위의 형태로 이루어져 있음

```Java
if (x > 5) {
  System.out.println("x is less than 5");
}
```

### if-else문

```Java
if (조건식) {
  조건식이 참일 경우 실행할 문장
}
else {
  조건식이 거짓일 경우 실행할 문장
}
```

위의 형태로 이루어져 있음

```Java
if (x < 20) {
  System.out.println("x is less than 20");
} else {
  System.out.println("x is larger or equal than 20");
}
```

### if-elif-else문

```Java
if (조건식) {
  조건식이 참일 경우 실행할 문장
}
else if (조건식) {
  위에 있는 if 구문이나 else if 구문의 조건식에 해당하지 않고 조건식이 참일 경우 실행할 문장
}
else {
  위의 조건식이 모두 거짓일 경우 실행할 문장
}
```

위의 형태로 이루어져 있음

```Java
if (x > 10) {
  System.out.println("x is larger than 10");
} else if (0 <= x && x <= 10) {
  System.out.println("x is less or equal than 10, And x is larger or equal than 0");
} else {
  System.out.println("x is negative");
}
```

### switch문

```Java
switch (조건문(조건값)) {
  case 조건값1:
    조건값1이 조건문의 조건값과 같을 경우 실행할 문장
    break;
  case 조건값2:
    조건값2가 조건문의 조건값과 같을 경우 실행할 문장
    break;
  ...
  default:
    위의 조건값들이 모두 일치하지 않을 경우 실행할 문장
}
```

위와 같은 식으로 구성되어 있음

#### 스위치문을 이용한 정수값 조건문

```Java
int x = 10;
switch (x) {
  case 100:
    System.out.println("x is 100");
    break;
  case 10:
    System.out.println("x is 10");
    break;
  case 1:
    System.out.println("x is 1");
    break;
  default:
    System.out.println("x is out of condition");
}
```

#### 스위치문을 이용한 범위 정수값 조건문

```Java
int score = 87;
switch (score / 10) {
  case 10:
    System.out.println("Wow you get 100 score!");
    break;
  case 9:
    System.out.println("You get 90 score!");
    break;
  case 8:
    System.out.println("You get 80 score!");
    break;
  case 7:
    System.out.println("Oh.. you get 70 score");
    break;
  default:
    System.out.println("You are under 70 score...");
}
```

#### 스위치문을 이용한 문자열 조건문

```Java
String name = "John";
switch (name.toLowerCase()) {
  case "john":
    System.out.println("Your name is John");
    break;
  case "cherie":
    System.out.println("Your name is Cherie");
    break;
  default:
    System.out.println("Not in DB");
}

```

# 반복문

반복문이란 조건식이 참일 동안 반복해서 구문을 실행하도록 하는 문법임

## for문

```Java
for (초기화식; 조건식; 증감식) {
  조건식이 참일 동안 실행할 문장
}
```

for문은 위와 같이 이루어져 있음

 - 초기화식
   - for문 안에서 쓰이는 변수의 초기화가 이루어짐
   - 변수는 여러개 존재할 수 있음
 - 조건식
   - 초기화식에 사용된 변수의 값이 증감식에 의해 조건식이 참일 동안 반복함
 - 증감식
   - 초기화식에 사용된 변수의 값을 증가시키거나 감소시킴

```Java
for (int i = 0; i < 10; i++) {
  System.out.println("Hello, for!");
}

for (int a = 3, b = 4, c = 5; a < 8 && b < 9 && c < 10; a++, b++, c++) {
  System.out.println(a + " " + b + " " + c);
}
```

## while문

```Java
while (조건식) {
  조건식이 참일 동안 실행할 문장
}
```

while문은 위와 같이 이루어져 있음

 - 조건식
   - 조건식이 참일 동안 반복함

for문과 달리 초기화식과 증감식이 별도로 존재하지 않으므로, 증감식은 보통 while문 내부에, 초기화식은 while문 외부에 적혀있음

```Java
int i = 0;
while (i < 10) {
  System.out.println("Hello, while!");
  i++;
}
```

## do-while문

```Java
do {
  조건식이 참일 동안 실행할 문장
} while (조건식);
```

do-while문은 위와 같이 이루어져 있음

 - 조건식
   - 조건식이 참일 동안 반복함

do-while문의 특징이라면 무조건 이 do-while 구문을 만나면 내부의 문장을 무조건 단 한번 실행하고, 조건식이 참일 때만 반복함

```Java
i = 0;
do {
  System.out.println("Hello, do-while!");
} while (i > 0);
```

## for-each문

```Java
for (type 변수명: 컬렉션) {
  컬렉션을 루프하는 동안 실행할 문장
}
```

for-each문은 외부로 봐서는 for문과 동일하게 되어있지만 내부의 모습은 타입과 변수명이 자리하고 있고, 그 옆에는 컬렉션이라는 것이 존재함

컬렉션은 말 그대로 무언가 모아놓은 것(리스트, 배열, 큐, 스택 등)을 의미함

이 컬렉션의 요소를 하나하나 꺼내와서 왼쪽의 변수에 넣어준 상태로 for문 내부의 문구를 실행함

그렇게 컬렉션의 요소를 순차적으로 전부 일순하게 되면 반복문이 종료됨

```Java
for (int num: new int[] {1, 2, 3, 4}) {
  System.out.println(num);
}
```

```Java
for (var fName: new String[] {"John", "Cherie", "McDonald"}) {
  System.out.printf("Name is %s\n", fName);
}
```