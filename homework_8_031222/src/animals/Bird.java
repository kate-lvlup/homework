package animals;

public class Bird extends Animal implements Runnable {
    @Override
    public void swim() {
        System.out.println("Bird is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void sing() {
        System.out.println("Bird is singing");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
}
