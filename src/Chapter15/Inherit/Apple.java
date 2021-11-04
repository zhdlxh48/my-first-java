package Chapter15.Inherit;

public final class Apple extends Fruit {
    public float surfaceDensity;

    public Apple() {
        super();
        surfaceDensity = 0.0f;
    }

    public Apple(int count, float size, float sweetness, float surfaceDensity) {
        super(count, size, sweetness);
        this.surfaceDensity = surfaceDensity;
    }

    @Override
    public String toString() {
        return String.format(
                "{\n\tcount: %d\n\tsize: %f\n\tsweetness: %f\n\tsurfaceDensity: %f\n}"
                , count, size, sweetness, surfaceDensity
        );
    }
}
