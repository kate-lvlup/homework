package triangles;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
            System.out.println("The triangle is right angled");
        } else {
            System.out.println("The triangle is not a right triangle. Sides are set incorrectly");
        }
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
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
