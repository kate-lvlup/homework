package products;

public class Apple extends Fruit {
    String shape;

    public Apple(int weight, int size, String color, boolean withBone, String taste, boolean withVitaminC, String shape) {
        super(weight, size, color, withBone, taste, withVitaminC);
        this.shape = shape;
    }

    public void cooking() {
        System.out.println("Apple makes delicious jam");
    }

    public void smells() {
        System.out.println("Apple smells");
    }

    public void growingPlace() {
        System.out.println("Apple grows on a tree");
    }

    public void season() {
        System.out.println("Apple is summer fruit");
    }
}
