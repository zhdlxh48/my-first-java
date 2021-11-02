package Chapter2;

public class Chapter2 {
  public static void main(String[] args) {
    byte b = 1;
    System.out.println(b);

    char c = 'A'; // char의 변수에 대입(초기화)을 할 때는 자료의 값을 작은 따옴표로 감싼다
    System.out.println(c);

    short s = 10;
    System.out.println(s);

    int i = 10;
    System.out.println(i);

    long l = 10L;
    System.out.println(l);

    float f = 0.1f;
    System.out.println(f);

    double d = 0.1d;
    System.out.println(d);

    boolean bl = true;
    System.out.println(bl);

    String st = "Hello, World!";
    System.out.println(st);

    byte small = 10;
    int big = small;
    System.out.println(big);

    int big2 = 100;
    byte small2 = (byte) big2;
    System.out.println(small2); // 데이터의 손실이 일어나지 않음

    int big3 = 1000;
    byte small3 = (byte) big3;
    System.out.println(small3); // 데이터의 손실이 일어날 수 있음 (Overflow)
  }
}
