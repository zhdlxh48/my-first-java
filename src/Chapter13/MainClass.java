package Chapter13;

// 디폴트 접근제어자 클래스는 다른 패키지에서는 import 불가능
//import Chapter13.com.zhdlxh48.Default.DefaultClass;

public class MainClass {
    public static void main(String[] args) {
        PrivateClass privateClasss = new PrivateClass();
        privateClasss.PrintInfo();

        // 디폴트 접근제어자 클래스는 다른 패키지에서는 접근 불가능
        //DefaultClass defaultClass = new DefaultClass();

        AnotherClass anotherClass = new AnotherClass();
    }
}
