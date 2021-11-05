package Chapter18;

public class MainClass {
    public static void main(String[] args) {
        TestInterface testInterface1 = new TestInterface() {
            @Override
            public String testMethod(int count) {
                String tempStr = "";
                for (int i = 0; i < count; i++) {
                    tempStr += "test ";
                }
                return tempStr;
            }
        };
        TestInterface testInterface2 = (count) -> {
            String tempStr = "";
            for (int i = 0; i < count; i++) {
                tempStr += "test ";
            }
            return tempStr;
        };

        printUsingInterface(testInterface1, 10);
        printUsingInterface(testInterface2, 10);
    }

    public static void printUsingInterface(TestInterface testInterface, int count) {
        System.out.println(testInterface.testMethod(count));
    }
}
