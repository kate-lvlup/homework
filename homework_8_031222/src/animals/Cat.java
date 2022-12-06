package animals;

public class Cat extends Animal implements Eatable, Runnable, Singable, Swimmable {
    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void sing() {
        System.out.println("Cat is singing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
