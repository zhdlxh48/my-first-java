# 배열

인덱스를 이용해 **자료형이 같은 자료**를 관리하는 자료구조

자바는 0-based indexing을 채택하고 있으므로, 크기가 n인 배열은 0부터 시작해서 n-1까지의 인덱스를 가진다.

```Java
int[] array;
float[] floatArray = new float[10]; // 동적 할당
```

## 배열의 생성

### 선언

관리하고자 하는 자료의 타입을 선언하고, 배열 객체의 이름을 지정함

```Java
type[] arrayName;
```

### 초기화

선언된 배열의 객체에 new를 사용해 배열의 크기를 지정하고, 초기화를 한다.

```Java
arrayName = new type[size];
```

### 선언과 동시에 초기화

배열을 생성할 때 위와 같이 선언과 초기화를 따로하지 않고 동시에 할 수 있다.

```Java
type[] arrayName = new type[size]; // 배열의 사이즈를 지정해 생성

// 배열을 생성할 때 값을 지정해 값의 개수만큼의 크기의 배열을 생성
type[] arrayName = new type[] {value1, value2, ..., valueN};
type[] arrayName = {value1, value2, ..., valueN}; 
```

## 배열의 메모리

배열의 자료형에 따라 배열의 데이터의 크기가 결정됨

```Java
int[] array = new int[10]; // 배열의 사이즈는 10개
```

위와 같은 경우 배열의 사이즈는 10개이므로, 메모리에는 10개의 int 값을 가지는 배열을 생성함

int는 4byte의 메모리를 가지므로, 배열의 데이터 크기는 4byte * 10 = 40byte가 됨

## 배열 변수

기본형 자료의 변수는 메모리에 직접 접근하는 것과 달리 배열의 변수는 배열의 데이터가 저장되어있는 메모리의 주소를 참조(레퍼런스)하고 있음

```Java
int[] array = new int[10];
// array 변수는 배열의 주소값을 참조하고 있음
// 실제 데이터는 array 변수에 인덱스를 이용해 접근함
```

그래서 만약 배열의 선언만 하고 초기화를 하지 않는다면 메모리의 배열을 가리킬 수 있는 참조 할 수 있는 상태가 되고, 이를 이용해 배열에 (데이터가 존재하지 않고, 가지고 있는 주소값이 없으니) 접근할 수 없음.

## 배열의 속성

속성(property)은 배열의 여러 정보를 가지고 있음

```Java
type[] array = new type[size];
array.length; // 배열의 크기를 반환, Result: size
```

## Arrays 클래스

이 클래스 객체는 배열의 조작에 필요한 메소드를 제공함

```Java
Arrays.sort(array); // 배열의 정렬 (오름차순)
Arrays.fill(array, value); // 배열의 모든 값을 value로 채움
Arrays.copyOf(array, size); // 배열의 복사 (깊은복사)
Arrays.toString(array); // 배열의 문자열 표현
```

## 배열의 복사

이 것은 배열만의 문제는 아님

참조(레퍼런스)타입의 변수를 복사할 때, 대입 연산자를 사용하게 되면 변수의 주소를 복사해서 대입하게 되는 **얕은복사**가 됨

배열을 온전히 복사하기 위해서는 **깊은복사**를 사용해야 함

깊은복사를 위한 방법에는 ***Arrays.copyOf()*** 메소드가 있음

```Java
int[] testArray = {4, 1, 5, 3, 2};
int[] testArray2 = null;
int[] testArray3 = null;

// Arrays 클래스의 copyOf 메소드를 이용해 배열의 복사
testArray2 = Arrays.copyOf(testArray, testArray.length);
// 대입 연산자를 사용해 testArray의 변수에 담긴 **메모리 주소**를 testArray2에 대입
testArray3 = testArray;

System.out.println(testArray);
System.out.println(testArray2);
System.out.println(testArray3);

// Result: testArray - [I@27716f4, testArray2 - [I@8efb846, testArray3 - [I@27716f4
// testArray와 testArray3는 **얕은복사**로 인해 같은 주소를 가리키고 있음
// testArray2는 testArray의 **깊은 복사본**이기 때문에 다른 고유한 주소를 가리키고 있음
```

## 다차원 배열

다차원 배열은 1차원 배열의 안에 1차원 배열이 담겨있는 형태의 배열을 의미함

배열의 차원이 늘어나면 배열의 크기도 늘어나고, 배열의 요소도 늘어남

배열의 차원이 늘어나면 데이터의 크기가 기하급수적으로 늘어나 처리속도의 저하를 유발할 수 있어, 보통 2차원 배열까지 사용함

```Java
int[][] array = new int[2][3];
// 2개의 1차원 배열 안에 3개의 1차원 배열이 담겨있는 2차원 배열
array[0][0] = 1;
array[0][1] = 2;
array[0][2] = 3;
array[1][0] = 4;
array[1][1] = 5;
array[1][2] = 6;

System.out.println(array.length); // 배열의 크기를 반환, Result: 2
System.out.println(Arrays.toString(array)); // [[I@2a84aee7, [I@a09ee92]
System.out.println(Arrays.toString(array[0])); // [1, 2, 3]
System.out.println(array[1][2]); // 6
```

위의 코드에서 볼 수 있듯이 2차원 배열은 1차원 배열 안에 또 다른 배열을 가리키는 형태이고, 아래와 같이 저렇게 표로 나타낼 수 있음

| 1 | 2 | 3 |
|---|---|---|
| 4 | 5 | 6 |

이렇게 [2][3]의 형태로 되어있는 배열은 2행, 3열의 배열로 볼 수 있음

정리하자면 다차원 배열은 행에 해당하는 일차원 배열 안에 열에 해당하는 일차원 배열을 담을 수 있고, 그 안의 일차원 배열의 값은 배열의 데이터를 가리키는 참조 주소 데이터를 가지고 있음

### 다차원 배열의 선언

```Java
// 배열의 사이즈를 지정하여 선언
int[][] array = new int[2][3];
array[0][0] = 1;
array[0][1] = 2;
array[0][2] = 3;
array[1][0] = 4;
array[1][1] = 5;
array[1][2] = 6;
```

```Java
// 생성할 때 배열의 사이즈를 지정하지 않고 값을 지정하여 선언 (자동으로 크기가 결정됨)
int[][] array = {
  {1, 2, 3},
  {4, 5, 6}
};
```
