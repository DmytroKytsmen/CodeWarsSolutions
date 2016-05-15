public class Circle {
    public static double area(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        double area = Math.PI * radius * radius;
        double rarea = Math.round(area * 100);
        area = rarea / 100;
        return area;
    }
}