package Chapter15;

import Chapter15.Inherit.Apple;
import Chapter15.Inherit.Banana;
import Chapter15.Inherit.Grape;

public class MainClass {
    public static void main(String[] args) {
        Apple apple = new Apple(1, 4.4f, 2.5f, 45.9f);
        Banana banana = new Banana(4, 6.6f, 2.8f, 32.1f);
        Grape grape = new Grape();

        System.out.println(apple);
        System.out.println(banana);
        System.out.println(grape);
    }
}
