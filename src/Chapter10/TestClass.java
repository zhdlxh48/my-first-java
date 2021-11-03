package Chapter10;

public class TestClass {
    int num = 0;
    String name = "";

    static int staticInt = 0;

    public TestClass() {
        System.out.println("기본 생성자");
        num = 0;
        name = "";
    }
    // 멤버변수 직접 지정 초기화
    public TestClass(int num) {
        System.out.printf("인자 생성자 %d\n", num);
        this.num = num;
        this.staticInt = 10;
    }
    // 다른 생성자를 이용해 초기화
    public TestClass(String name) {
        this(0, name); // this는 이 클래스의 생성자를 의미함
    }
    public TestClass(int num, String name) {
        System.out.printf("인자 생성자, num: %d, name: %s\n", num, name);
        this.num = num;
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable { // Deprecated
        System.out.println(name + "번 인스턴스가 GC에 의해 소멸자 호출");
        super.finalize();
    }
}
