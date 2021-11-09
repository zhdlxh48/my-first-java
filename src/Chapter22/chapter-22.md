# 입력과 출력

다른 곳으로 데이터를 보내는 것을 출력, 다른곳에서 데이터를 받아오는 것을 입력이라고 함

자바에서 입력과 출력은 스트림(Stream)을 통해서 이루어진다

## 입출력 기본클래스

- 1Byte 단위로 데이터를 전송함

### InputStream (입력)

- FileInputSystem
- DataInputStream
- BufferedInputStream

### OutputStream (출력)

- FileOutputSystem
- DataOutputStream
- BufferedOutputStream

## FileStream

파일에 데이터를 읽고 쓰기 위한 클래스

- 이 스트림을 통해서 파일의 읽기, 쓰기, 복사가 가능함

### FileInputSystem

```java
read(); // 1Byte씩 읽음
read(byte[]); // []의 index 크기 만큼 읽음
```

### FileOutputSystem

```java
write(byte[]); // [] 전체를 쓰기함
write(byte[], int off, int len); // []의 데이터 중 off(offset, 시작점) index부터 len(length, 크기)만큼 데이터를 쓰기함
```

## DataStream (조금 더 내용 보충)

Byte 단위의 입출력을 개선해서 문자열을 좀더 편리하게 다룰 수 있음

```
File -> DataInputStream -> InputStream
DataOutputStream -> OutputStream -> File
```

## Buffered Reader & Writter

Byte 단위의 입출력을 개선해서 문자열을 좀더 편리하게 다룰 수 있음

```
File -> BufferedReader -> FileReader
BufferedWriter -> FileWriter -> File
```

## 