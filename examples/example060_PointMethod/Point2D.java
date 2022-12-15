package examples.example060_PointMethod;

/**
 * Это тачка 2D
 */
public class Point2D {
    int x, y;

    /**
     * это конструктов
     * 
     * @param value
     */
    public Point2D(int valueX, int valueY) {
        x = valueX; // это координата x
        y = valueY; // это координата y
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
