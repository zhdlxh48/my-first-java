package Chapter4;

public class Chapter4 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;

    System.out.println(num1);
    num1 = num2;
    System.out.println(num1);

    num1 = 15;
    num2 = 28;

    System.out.println(num1 + num2);
    System.out.println(num1 - num2);
    System.out.println(num1 * num2);
    System.out.println(num1 / num2);
    System.out.println(num1 % num2);

    int num3 = 10;
    int result = 15;

    result += num3;
    System.out.println(result);
    result = 15;
    result -= num3;
    System.out.println(result);
    result = 15;
    result *= num3;
    System.out.println(result);
    result = 15;
    result /= num3;
    System.out.println(result);
    result = 15;
    result %= num3;
    System.out.println(result);

    int num4 = 3;
    int num5 = 4;
    System.out.println(num4 > num5);
    System.out.println(num4 < num5);
    System.out.println(num4 >= num5);
    System.out.println(num4 <= num5);
    System.out.println(num4 == num5);
    System.out.println(num4 != num5);

    int num6 = 1;
    System.out.println(++num6);
    System.out.println(num6++);
    System.out.println(--num6);
    System.out.println(num6--);

    boolean condition1 = true;
    boolean condition2 = false;

    System.out.println(condition1 && condition2);
    System.out.println(condition1 || condition2);
    System.out.println(!condition1);

    System.out.println(condition1 ? "True Boolean Value" : "False Boolean Value");

    int bit_num1 = 1;
    int bit_num2 = 3;

    System.out.println(bit_num1 & bit_num2);
    System.out.println(bit_num1 | bit_num2);
    System.out.println(bit_num1 ^ bit_num2);
  }
}
