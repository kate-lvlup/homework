package products;

public class Plum extends Fruit {
    boolean ripe;

    public Plum(int weight, int size, String color, boolean withBone, String taste, boolean withVitaminC, boolean ripe) {
        super(weight, size, color, withBone, taste, withVitaminC);
        this.ripe = ripe;
    }

    public void cooking() {
        System.out.println("Plum makes a delicious jam");
    }

    public void smells() {
        System.out.println("Plum smells");
    }

    public void growInUkraine() {
        System.out.println("Plum grows on a tree");
    }

    public void juiciness() {
        System.out.println("Plum is a juicy fruit");
    }
}
