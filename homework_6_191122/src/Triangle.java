// Napisat' class Triangle s parametrami storon i method vuchisleniya ploshadi i perimetra figyru.

public class Triangle {
    double sideA;
    double sideB;
    double baseTriangle;
    double perimeter;

    double heightTriangle;
    double areaTriangle;

    public double setSideA(double sideA) {
        return this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public double setSideB(double sideB) {
        return this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public double setBaseTriangle(double baseTriangle) {
        return this.baseTriangle = baseTriangle;
    }

    public double getBaseTriangle() {
        return baseTriangle;
    }

    public double getPerimeter() {
        return this.perimeter = sideA + sideB + baseTriangle;
    }


    public double getHeightTriangle() {
        return this.heightTriangle = 2 / baseTriangle * Math.sqrt((perimeter / 2) * (perimeter / 2 - sideA) * (perimeter / 2 - sideB) * (perimeter / 2 - baseTriangle));
    }


    public double getAreaTriangle() {
        return this.areaTriangle = 1.0 / 2.0 * baseTriangle * heightTriangle;
    }
}
