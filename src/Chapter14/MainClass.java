package Chapter14;

public class MainClass {
    public static void main(String[] args) {
        HiddenClass hidden = new HiddenClass();

        // 멤버변수의 접근제한자가 private라 직접적으로 접근이 불가능함
        //System.out.println(hidden.importantVariable);
        System.out.println(hidden.getImportantVariable()); // 0
        hidden.setImportantVariable(99);
        System.out.println(hidden.getImportantVariable()); // 99
    }
}
