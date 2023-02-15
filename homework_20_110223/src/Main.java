import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************Task1********************");
        System.out.println(FuncInterfaceMethods.returnJavaWord().get());
        System.out.println();
        System.out.println("******************Task2********************");
        System.out.println(FuncInterfaceMethods.checkIsEmptyString().test("Hello"));
        System.out.println();
        System.out.println("******************Task3********************");
        System.out.println(FuncInterfaceMethods.returnStringNTimes().apply("Hello!", 4));
        System.out.println();
        System.out.println("******************Task4********************");
        BigDecimal bigDecimal = new BigDecimal("123.1234567890");
        System.out.println(FuncInterfaceMethods.returnStringWithSymbolAndBigDecimal().apply(bigDecimal));
        System.out.println();
        System.out.println("******************Task5********************");
        System.out.println(FuncInterfaceMethods.checkStringRange(3, 5).test("Hello"));
        System.out.println();
        System.out.println("******************Task6********************");
        System.out.println(FuncInterfaceMethods.returnRandomInt().getAsInt());
        System.out.println();
        System.out.println("******************Task7********************");
        System.out.println(FuncInterfaceMethods.returnRandomIntWithinRange().applyAsInt(5));
        System.out.println();
        System.out.println("******************Task8********************");
        System.out.println(FuncInterfaceMethods.returnIntToPowOfItself().applyAsInt(4));
        System.out.println();
        System.out.println("******************Task9********************");
        System.out.println(FuncInterfaceMethods.returnStringLength().applyAsInt("Hello"));
        System.out.println();
        System.out.println("******************Task10********************");
        String[] arrString = new String[10];
        for (int i = 0; i < 10; i++) {
            String str = "Hello";
            arrString[i] = str + i;
        }
        for (String element : arrString) {
            FuncInterfaceMethods.printString().accept(element);
        }
    }
}