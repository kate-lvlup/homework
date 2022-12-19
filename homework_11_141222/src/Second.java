public class Second {
    public void method3() {
        OuterClass.InnerClass inner3 = new OuterClass().new InnerClass(); // Чтобы обратиться к InnerClass классу - мы делаем это через главный класс OuterClass
        inner3.method2();
    }
}
