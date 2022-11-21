// Napisat' class Triangle s parametrami storon i method vuchisleniya ploshadi i perimetra figyru.

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

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

    public double setSideC(double sideC) {
        return this.sideC = sideC;
    }

    public double getSideC() {
        return sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getAreaTriangle() {
        return Math.sqrt(((sideA + sideB + sideC) / 2) * ((sideA + sideB + sideC) / 2 - sideA) * ((sideA + sideB + sideC) / 2 - sideB) * ((sideA + sideB + sideC) / 2 - sideC));
    }
}