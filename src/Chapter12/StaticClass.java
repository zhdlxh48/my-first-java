package Chapter12;

public class StaticClass {
    public static int static_num = 0;
    public int instance_num = 0;

    static {
        System.out.println("Hello, Static!");
        System.out.printf("static_num is %d", static_num);
    }

    public int add(int a, int b) {
        return a + b;
    }
    public static int staticAdd(int a, int b) {
        return a + b;
    }
}
