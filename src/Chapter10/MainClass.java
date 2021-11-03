package Chapter10;

public class MainClass {
    public static void main(String[] args) {
        TestClass test1 = new TestClass("1");
        TestClass test2 = new TestClass("2");
        TestClass test3 = new TestClass("3");
        TestClass test4 = new TestClass("4");
        TestClass test5 = new TestClass("5");

        test1 = null;
        test2 = null;
        test5 = null;
        test3 = null;
        test4 = null;
    }
}
