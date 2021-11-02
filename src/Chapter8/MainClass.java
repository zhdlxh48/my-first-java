package Chapter8;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(SayHello(2));

        OverloadMethod(1);
        OverloadMethod(1, 2);
        OverloadMethod(3.14f);

        AnotherClass anotherClass = new AnotherClass();

        anotherClass.PublicMethod();
        //anotherClass.PrivateMethod(); // Error: 'PrivateMethod()' has private access in 'Chapter8.AnotherClass'
    }

    public static String SayHello(int count) {
        String hellos = "";

        for (int i = 0; i < count; i++) {
            hellos += "hello!\n";
        }

        return hellos;
    }

    public static void OverloadMethod(int variable) {
        System.out.println("Method have 1 int parameter");
        System.out.println(variable);
    }
    public static void OverloadMethod(int variable1, int variable2) {
        System.out.println("Method have 2 int parameter");
        System.out.println(variable1 + " " + variable2);
    }
    public static void OverloadMethod(float variable) {
        System.out.println("Method have 1 float parameter");
        System.out.println(variable);
    }
}
