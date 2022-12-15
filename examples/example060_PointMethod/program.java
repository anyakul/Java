package examples.example060_PointMethod;

public class program {
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - b.y, 2));
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        // a.x = 0;
        // a.y = 2;
        System.out.println(a.toString()); // x: 0; y: 2

        Point2D b = new Point2D(0, 10);
        // b.x = 0;
        // b.y = 10;
        System.out.println(b); // x: 0; y: 10

        Point2D c = new Point2D(10);
        // b.x = 0;
        // b.y = 10;
        System.out.println(c.toString()); // x: 10; y: 10
        System.out.println(a.getX()); // 0
        a.setX(5);
        System.out.println(a.getX()); // 5
        var dis1 = distance(a, c);
        var dis = Point2D.distance(a, c);
        System.out.println(dis); // 9,43981132056603
        System.out.println(dis1); // 5.0
    }
}
