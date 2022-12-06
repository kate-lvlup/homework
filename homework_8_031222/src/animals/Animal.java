// Task3. Создать иерархию классов от Animal, (Bird, Cat -> Eagle, Lion), но методы действий
// животных(плавать, летать, бежать, и тп.) расширять через интерфейс, подходящий соотв. типу животного

package animals;

public class Animal implements Runnable {


    @Override
    public void swim() {
        System.out.println("Animal is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Animal is flying");
    }

    @Override
    public void run() {
        System.out.println("Animal is running");
    }

    @Override
    public void sing() {
        System.out.println("Animal is singing");
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
}
