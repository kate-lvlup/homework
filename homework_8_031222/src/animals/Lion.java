package animals;

public class Lion extends Cat implements Runnable{
    @Override
    public void swim() {
        System.out.println("Lion is swimming");
    }

    @Override
    public void run() {
        System.out.println("Lion is running");
    }

    @Override
    public void sing() {
        System.out.println("Lion is rrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }
}
