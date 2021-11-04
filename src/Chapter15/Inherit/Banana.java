package Chapter15.Inherit;

public final class Banana extends Fruit {
    public float softness;

    public Banana() {
        super();
        softness = 0.0f;
    }

    public Banana(int count, float size, float sweetness, float softness) {
        super(count, size, sweetness);
        this.softness = softness;
    }

    @Override
    public String toString() {
        return String.format(
                "{\n\tcount: %d\n\tsize: %f\n\tsweetness: %f\n\tsoftness: %f\n}"
                , count, size, sweetness, softness
        );
    }
}
