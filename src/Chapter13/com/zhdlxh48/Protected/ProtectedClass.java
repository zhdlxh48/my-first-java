package Chapter13.com.zhdlxh48.Protected;

public class ProtectedClass {
    protected ProtectedClass() {
        System.out.println("Protected 생성자");
    }

    protected int protectedField = 0;

    protected void protectedMethod() {
        System.out.println("Protected 메소드");
    }
}
