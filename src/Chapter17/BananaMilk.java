package Chapter17;

import Chapter17.Interface.Drink;

public class BananaMilk extends Milk implements Drink {
    public BananaMilk() {
        this.flavor = "Banana";
    }

    @Override
    public String drink() {
        return String.format("Drink %s milk", this.getFlavor());
    }
}
