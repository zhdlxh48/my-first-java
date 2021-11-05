package Chapter19;

public class MainClass {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuffer sbf = new StringBuffer(str);
        StringBuilder sbd = new StringBuilder(str);

        System.out.println(str);
        System.out.println(sbf);
        System.out.println(sbd);

        str = "Hello, Java!";
        sbf.delete(7, 12);
        sbf.insert(7, "Java");
        sbd.delete(7, 12);
        sbd.insert(7, "Java");

        System.out.println(str);
        System.out.println(sbf);
        System.out.println(sbd);
    }
}
