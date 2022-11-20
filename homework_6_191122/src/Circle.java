// Napisat' class Circle s parametrami radiysa, method polycheniya i zadaniya radiysa i vuchisleniya
// ploshadi kryga.

public class Circle {
    double radius;
    double areaCircle;

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getAreaCircle() {
        return this.areaCircle = Math.PI * Math.pow(radius, 2);
    }
}
