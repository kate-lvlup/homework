package triangles;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void getSideA() {
        System.out.println("Side A: " + sideA);
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void getSideB() {
        System.out.println("Side B: " + sideB);
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void getSideC() {
        System.out.println("Side C: " + sideC);
    }

    public void getPerimeter() {
        System.out.println("Perimeter of a triangle: " + (sideA + sideB + sideC));
    }

    public void getSquare() {
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
            System.out.println("Square of a triangle: " + (sideA * sideB) / 2);
        } else {
            System.out.println("The triangle is not a right triangle. Sides are set incorrectly");
        }
    }

    public void verifyPythagoras() {
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
            System.out.println("The triangle is right angled");
        } else {
            System.out.println("The triangle is not a right triangle. Sides are set incorrectly");
        }
    }
}
