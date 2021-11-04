package Chapter17;

import Chapter17.Interface.Drink;

public class MainClass {
    public static Drink[] drinks;

    public static void main(String[] args) {
        drinks = new Drink[]{
                new StrawberryMilk(),
                new ChocolateMilk(),
                new BananaMilk()
        };

        for (var drink : drinks) {
            System.out.println(drink.drink());
        }
    }
}
