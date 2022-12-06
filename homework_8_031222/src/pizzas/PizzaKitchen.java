package pizzas;

public class PizzaKitchen extends PizzaStore {

    private int time;
    private String box;

    public PizzaKitchen(String type, int size, boolean withPineapple, int time, String box) {
        super(type, size, withPineapple);
        this.time = time;
        this.box = box;
    }

    @Override
    public boolean pizzaReady() {
        if (type == "chicken" && time >= 15) {
            return true;
        } else if (type == "cheese" && time >= 12) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void pizzaRelease() {
        if (pizzaReady()) {
            System.out.println("Pizza " + type + " is ready to release");
        } else {
            pizzaCancel();
        }
    }
}
