package Chapter13;

import Chapter13.com.zhdlxh48.Protected.ProtectedClass;

public class AnotherClass extends ProtectedClass {
    public AnotherClass() {
        super();
        this.protectedField = 100;
        this.protectedMethod();
    }
}
