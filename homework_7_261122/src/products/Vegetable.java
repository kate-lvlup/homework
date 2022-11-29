package products;

public class Vegetable extends Product {

    boolean withAntioxidants;
    String homeland;

    public Vegetable(int weight, int size, String color, boolean withBone, boolean withAntioxidants, String homeland) {
        super(weight, size, color, withBone);
        this.withAntioxidants = withAntioxidants;
        this.homeland = homeland;
    }

    public void healthy() {
        System.out.println("Vegetable is good for health");
    }

    public void growingPlace() {
        System.out.println("Vegetable grow on the ground");
    }
}
