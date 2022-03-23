package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculator {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getValue() {
        return width + " units, height: " + height;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, width: "
                + getValue() + " units, color: "
                + getColor();
    }
}
