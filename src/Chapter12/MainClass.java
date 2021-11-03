package Chapter12;

public class MainClass {
    static public void main(String[] args) {
        StaticClass.static_num = 200;
        System.out.println(StaticClass.static_num);
        System.out.println(StaticClass.staticAdd(3, 7));

        StaticClass staticClass = new StaticClass();
        staticClass.instance_num = 10;
        System.out.println(staticClass.static_num);
        System.out.println(staticClass.add(1, 4));
    }
}
