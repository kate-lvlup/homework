package animals;

public class Eagle extends Bird implements Eatable, Flyable, Runnable, Singable {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void run() {
        System.out.println("Eagle is running");
    }

    @Override
    public void sing() {
        System.out.println("Eagle is eeyy-eeyy");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
}
