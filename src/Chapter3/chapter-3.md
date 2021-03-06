# 특수문자 & 서식문자

## 특수문자

일반적인 문자가 아닌 특수한 목적으로 사용되는 문자 **(이스케이프 문자)**

```Java
System.out.println("Hello\nWorld!");
```

- \\t
  - 탭
- \\n
  - 엔터 (줄바꿈, 개행)
- \\'
  - 작은 따옴표
- \\"
  - 큰 따옴표
- \\\
  - 역 슬래쉬

## 서식문자

일반적인 문자가 아닌 문자열의 서식에 사용되는 문자

```Java
System.out.printf("This is " + "Special" + "!");
System.out.printf("This is %s!", "Special"); // 위와 동일
```

- %d
  - 정수의 서식 문자
- %o
  - 정수의 8진수 변환 서식 문자
- %x
  - 정수의 16진수 변환 서식 문자
- %c
  - 문자의 서식 문자
- %s
  - 문자열의 서식 문자
- %f
  - 실수의 서식 문자

### 정수 자리 정렬

정수가 차지할 자리수를 정하고 정수를 좌측정렬해 출력한다

```Java
System.out.printf("%5d", 123);
// Result: "  123"
```

### 소수점 출력 제한

소수점의 자리수를 정해, 그 다음 자리수에서 반올림하여 출력한다

```Java
System.out.printf("%.4f", 3.1415926535);
// Result: "3.1416"
```
