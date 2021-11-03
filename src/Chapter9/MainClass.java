package Chapter9;

public class MainClass {
    public static void main(String[] args) {
        TestClass variable1 = new TestClass();
        TestClass variable2 = new TestClass();

        System.out.println(variable1);
        System.out.println(variable2);

        TestClass nullVar = new TestClass();
        nullVar.getInfo();
        nullVar = null;
        nullVar.getInfo();
    }
}
