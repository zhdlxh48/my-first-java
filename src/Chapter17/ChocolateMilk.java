package Chapter17;

import Chapter17.Interface.Drink;

public class ChocolateMilk extends Milk implements Drink {
    public ChocolateMilk() {
        this.flavor = "Chocolate";
    }

    @Override
    public String drink() {
        return String.format("Drink %s milk", this.getFlavor());
    }
}
