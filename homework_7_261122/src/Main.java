import cars.Car;
import laptops.Laptop;
import products.Apple;
import products.Fruit;
import products.Plum;
import products.Vegetable;
import triangles.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Task1********");
        Fruit fruit1 = new Fruit(1, 2, "red", false, "sweet", true);
        fruit1.growInUkraine();
        Vegetable vegetable1 = new Vegetable(3, 5, "green", true, true, "Dnipro");
        vegetable1.growInUkraine();
        fruit1.cooking();
        fruit1.smells();
        vegetable1.healthy();
        Apple apple1 = new Apple(1, 2, "green", true, "sweet", true, "circle");
        apple1.cooking();
        apple1.growInUkraine();
        apple1.smells();
        apple1.season();
        apple1.setWeight(15);
        apple1.setSize(10);
        System.out.println(apple1.getWeight());
        System.out.println(apple1.getSize());
        Plum plum1 = new Plum(2, 1, "blue", true, "sweet", false, true);
        plum1.cooking();
        plum1.growInUkraine();
        plum1.smells();
        plum1.juiciness();
        System.out.println();
        System.out.println("********Task2********");
        Car car1 = new Car(240, 80, 2021, 22000, "Kia");
        car1.getMaxSpeed();
        car1.getFuelAmount();
        car1.getProductionYear();
        car1.getPrice();
        car1.getBrand();
        car1.startStopEngine();
        car1.setCurrentSpeed(100);
        car1.getCurrentSpeed();
        car1.startStopEngine();
        car1.startStopEngine();
        car1.setCurrentSpeed(80);
        car1.getCurrentSpeed();
        car1.increaseAccelerating();
        car1.decreaseAccelerating();
        car1.startBeeping();
        System.out.println();
        System.out.println("********Task3********");
        Laptop laptop1 = new Laptop("Lenovo", false, "Hello World!", 30);
        laptop1.getBrand();
        laptop1.getIsTurnedOn();
        laptop1.getWelcomePhrase();
        laptop1.getButteryAmount();
        laptop1.TurnOn();
        laptop1.getIsTurnedOn();
        laptop1.TurnOn();
        laptop1.decreaseButteryAmount();
        laptop1.decreaseButteryAmount();
        laptop1.decreaseButteryAmount();
        laptop1.decreaseButteryAmount();
        laptop1.decreaseButteryAmount();
        laptop1.decreaseButteryAmount();
        laptop1.getIsTurnedOn();
        System.out.println();
        System.out.println("********Task4********");
        Triangle triangle1 = new Triangle();
        triangle1.setSideA(3);
        triangle1.setSideB(4);
        triangle1.setSideC(5);
        triangle1.getSideA();
        triangle1.getSideB();
        triangle1.getSideC();
        triangle1.getPerimeter();
        triangle1.getSquare();
        triangle1.verifyPythagoras();
        Triangle triangle2 = new Triangle();
        triangle2.setSideA(3);
        triangle2.setSideB(3);
        triangle2.setSideC(5);
        triangle2.getSideA();
        triangle2.getSideB();
        triangle2.getSideC();
        triangle2.getPerimeter();
        triangle2.getSquare();
        triangle2.verifyPythagoras();
    }
}