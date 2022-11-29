package products;

public class Fruit extends Product {
    String taste;
    boolean withVitaminC;

    public Fruit(int weight, int size, String color, boolean withBone, String taste, boolean withVitaminC) {
        super(weight, size, color, withBone);
        this.taste = taste;
        this.withVitaminC = withVitaminC;
    }

    public void cooking() {
        System.out.println("This fruit makes a delicious jam");
    }

    public void smells() {
        System.out.println("Fruit smells");
    }

    public void growInUkraine() {
        System.out.println("Fruit grow on a tree");
    }

}
