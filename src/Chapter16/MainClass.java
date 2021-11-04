package Chapter16;

import Chapter16.Classes.AnonymousClass;
import Chapter16.Classes.InnerClass;
import Chapter16.Classes.StaticClass;

public class MainClass {
    public static void main(String[] args) {
        InnerClass.InnerInnerClass innerInner = new InnerClass().new InnerInnerClass();
        InnerClass inner = new InnerClass();
        InnerClass.InnerInnerClass innerInner2 = inner.new InnerInnerClass();

        StaticClass.InnerStaticClass innerStatic = new StaticClass.InnerStaticClass();

        class LocalClass {
        }
        LocalClass local = new LocalClass();

        new AnonymousClass() {
            @Override
            public void method() {
                System.out.println("Override Anonymous Class");
            }
        }.method();
    }
}
