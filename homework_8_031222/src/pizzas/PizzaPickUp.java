package pizzas;

public class PizzaPickUp extends PizzaStore {
    private boolean paid;
    private String buyerPhone;
    private String[] phones;

    public PizzaPickUp(String type, int size, boolean withPineapple, boolean paid, String buyerPhone, String[] phones) {
        super(type, size, withPineapple);
        this.paid = paid;
        this.buyerPhone = buyerPhone;
        this.phones = phones;
    }


    @Override
    public boolean pizzaReady() {
        boolean result = false;
        for (String phone : phones) {
            if (buyerPhone.equals(phone) && paid == true) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public void pizzaRelease() {
        if (pizzaReady()) {
            System.out.println("Client " + buyerPhone + " can get the pizza!");
        } else {
            pizzaCancel();
        }
    }
}

