package Chapter13;

public class PrivateClass {
    private static class InnerPrivateClass {
        public void PrintInfo() {
            System.out.println("This is private class \"InnerPrivateClass\" inner PrivateClass");
        }
        private void PrintPrivateInfo() {
            System.out.println("Is this able to access outer \"InnerPrivateClass\"?");
        }
    }

    InnerPrivateClass innerPrivateClass;

    public PrivateClass() {
        innerPrivateClass = new InnerPrivateClass();
    }

    public void PrintInfo() {
        innerPrivateClass.PrintInfo();
        innerPrivateClass.PrintPrivateInfo(); // Is able!
    }
}
