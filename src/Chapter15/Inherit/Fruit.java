package Chapter15.Inherit;

public class Fruit {
    public int count;
    public float size;
    public float sweetness;

    public Fruit() {
        this(0, 0.0f, 0.0f);
    }

    public Fruit(int count, float size, float sweetness) {
        this.count = count;
        this.size = size;
        this.sweetness = sweetness;
    }

    @Override
    public String toString() {
        return String.format("{\n\tcount: %d\n\tsize: %f\n\tsweetness: %f\n}", count, size, sweetness);
    }
}
