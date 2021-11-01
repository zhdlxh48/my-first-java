public class Chapter3 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");
        System.out.println("Hello\"World\"");
        System.out.println("Hello\'World\'");
        System.out.println("Hello\\World\\");

        System.out.printf("The number is %d\n", 10);
        int num = 10;
        System.out.printf("The variable num's value is %d\n", num);
        int num2 = 31;
        System.out.printf("10진수: %d\n", num2);
        System.out.printf("8진수: %o\n", num2);
        System.out.printf("16진수: %x\n", num2);

        System.out.printf("소문자 %c의 대문자는 %c 입니다.\n", 'c', 'C');

        System.out.printf("Everybody Say! %s\n", "Hello, World!");

        System.out.printf("파이의 근사값은 %f 입니다.\n", 3.14f);
        System.out.printf("파이의 근사값은 %f 입니다.\n", 3.1415926535d);

        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 1234);
        System.out.printf("%5d\n", 12345);

        float floatNum = 0.12345f;
        System.out.printf("%.3f\n", floatNum);
        System.out.printf("%.4f\n", floatNum);
        System.out.printf("%.5f\n", floatNum);
    }
}
