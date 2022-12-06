// Task2. создать иерархию классов на основе абстрактного класса и наследников, перенимающие
// его свойства и имеющие свои уникальные(полагаюсь на вашу креативность).
// Создать класс, использующий эти реализации, но по разному.(как на уроке)

package pizzas;

public abstract class Pizza {

    protected String type;
    protected int size;
    protected boolean withPineapple;

    Pizza(String type, int size, boolean withPineapple) {
        this.type = type;
        this.size = size;
        this.withPineapple = withPineapple;
    }

    public abstract boolean pizzaReady();

    public abstract void pizzaRelease();

    final void pizzaCancel() {
        System.out.println("Pizza is canceled");
    }

}
