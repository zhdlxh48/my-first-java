package Chapter17;

import Chapter17.Interface.Drink;

public class StrawberryMilk extends Milk implements Drink {
    public StrawberryMilk() {
        this.flavor = "Strawberry";
    }

    @Override
    public String drink() {
        return String.format("Drink %s milk", this.getFlavor());
    }
}
