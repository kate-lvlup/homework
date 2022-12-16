public class Main {
    public static void main(String[] args) {
        OuterClass classWithInner1 = new OuterClass();
        classWithInner1.method1();
        System.out.println();
//        InnerClass inner2 = new InnerClass(); В статическом методе мы НЕ МОЖЕМ создать инстанс InnerClass класса!!!
        OuterClass.InnerClass inner2 = classWithInner1.new InnerClass(); // В статическом методе инстанс InnerClass класса создается через инстанс главного класса - OuterClass
        inner2.method2(); // Вызывает метод из класса InnerClass
        System.out.println();
        Second second1 = new Second();
        second1.method3();
        System.out.println();
        OuterClass.StaticClass.methodInStaticClass2();
        OuterClass.StaticClass.methodInStaticClass3();
        System.out.println();
        System.out.println("********Electrocar********");
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();
        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
        System.out.println();
        System.out.println("********Class Anonimous********");
        Animal animal1 = new Animal();
        animal1.eat();
        // Далее создаем инстанс animal2.
        // animal2 - это не объект класса Animal.
        // animal2 - это наследник класса Animal с переопределенным методом eat()
        Animal animal2 = new Animal() {
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        animal2.eat();


//      Создаем класс который реализует метод интерфейса AbleToRun, в которым мы переопределяем методы интерфейса AbleToRun
        AbleToRun ableToRun = new AbleToRun() {
            @Override
            public void run() {
                System.out.println("Someone is able to run");
            }
        };
        ableToRun.run();

        //      Создаем класс который реализует метод абстрактного класса AbleToFly,
        //      в которым мы переопределяем методы абстрактного класса AbleToFly
        AbleToFly ableToFly = new AbleToFly() {
            @Override
            public void fly() {
                System.out.println("Bird is able to fly");
            }
        };
        ableToFly.fly();

    }
}



