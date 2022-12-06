import addresses.Address;
import animals.*;
import pizzas.PizzaKitchen;
import pizzas.PizzaPickUp;
import pizzas.PizzaStore;
import pizzas.PizzaOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Task1********");
        Address address1 = new Address("Ukraine", 49000, "Dnipro", "Shevchenko", "14A", 11, 7, 2);
        Address address2 = new Address("Ukraine", 49000, "Dnipro", "Shevchenko", "11", 25, 4, 1);
        System.out.println(address1.equals(address2));
        Address address3 = new Address();
        System.out.println(address1.equals(address3));
        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
        System.out.println(address3.hashCode());
        System.out.println(address1.toString());
        System.out.println(address3.toString());
        address3.setCountry("Germany");
        address3.setPostcode(40210);
        address3.setCity("Dusseldorf");
        address3.setStreet("Karlstrasse");
        address3.setHomeNumber("13B");
        address3.setFlatNumber(222);
        address3.setFloor(5);
        address3.setBlock(6);
        System.out.println(address3.toString());
        System.out.println(address3.getCountry());
        System.out.println(address3.getPostcode());
        System.out.println(address3.getCity());
        System.out.println(address3.getStreet());
        System.out.println(address3.getHomeNumber());
        System.out.println(address3.getFlatNumber());
        System.out.println(address3.getFloor());
        System.out.println(address3.getBlock());
        System.out.println();
        System.out.println("********Task2********");
        String[] phones = {"80975566333", "80633215566"};
        PizzaStore pizza1 = new PizzaKitchen("chicken", 2, true, 15, "medium");
        PizzaStore pizza2 = new PizzaPickUp("cheese", 1, false, true, "80633215566", phones);
        PizzaStore pizza3 = new PizzaKitchen("chicken", 2, true, 14, "medium");
        PizzaStore pizza4 = new PizzaPickUp("cheese", 1, false, false, "80633215566", phones);
        PizzaOrder pizzaOrder1 = new PizzaOrder();
        pizzaOrder1.orderPizza(pizza1);
        pizzaOrder1.orderPizza(pizza2);
        pizzaOrder1.orderPizza(pizza3);
        pizzaOrder1.orderPizza(pizza4);
        System.out.println();
        System.out.println("********Task3********");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.fly();
        animal1.run();
        animal1.sing();
        animal1.swim();
        Bird bird1 = new Bird();
        bird1.eat();
        bird1.fly();
        bird1.run();
        bird1.sing();
        bird1.swim();
        Eagle eagle1 = new Eagle();
        eagle1.eat();
        eagle1.fly();
        eagle1.run();
        eagle1.sing();
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.run();
        cat1.sing();
        cat1.swim();
        Lion lion1 = new Lion();
        lion1.eat();
        lion1.run();
        lion1.sing();
        lion1.swim();
    }
}