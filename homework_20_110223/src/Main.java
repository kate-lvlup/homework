//        1) Написать метод который возвращает Supplier<String>, который всегда возвращает слово "Java"
//        2) Написать метод который возвращает Predicate<String>, который проверяет строка пустая или нет
//        3) Написать метод который возвращает BiFunction<String, Integer, String> который преобразует в себя строку,
//        возвращая строку повторяемую N раз
//        4) Написать метод который возвращает Function<BigDecimal, String>,
//        который преобразует строку и возвращает строку которая начинается со знака доллара и этого BigDecimal
//        5) Написать метод который возвращаетPredicate<String>(int min, int max),
//        который принимает на вход параметр минимальной длины строки и максимальной,
//        проверить соответствует ли строка данному пределу
//        6) Написать метод который возвращает IntSupplier, который возвращает рандомное целое число
//        7) Написать метод который возвращает IntUnaryOperator, который принимает инт и возвращает рандомный инт,
//        ограниченный пределом который мы задаем(тут ознакомьтесь как IntUnaryOperator работает)
//        8) Написать метод который возвращает IntUnaryOperator, который принимает число и возвращает
//        число возведенное в степень самого числа
//        9) Написать метод который возвращает ToIntFunction<String>, который принимает строку и возвращает ее длину
//        10)Написать метод который возвращает Consumer<String>, метод который выводит строку на екран,
//        проверить работу через цикл строк

import java.math.BigDecimal;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("******************Task1********************");
        Supplier<String> supplier = () -> "Java";
        System.out.println(supplier.get());
        System.out.println();
        System.out.println("******************Task2********************");
        String stringPredicate = "Hello";
        Predicate<String> predicate = s -> {
            if (s.length() == 0) {
                return true;
            } else return false;
        };
        System.out.println(predicate.test(stringPredicate));
        System.out.println(predicate.test(""));
        System.out.println();
        System.out.println("******************Task3********************");
        BiFunction<String, Integer, String> biFunction = (s, integer) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < integer; i++) {
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        };
        System.out.println(biFunction.apply("Hello!", 4));
        System.out.println();
        System.out.println("******************Task4********************");
        Function<BigDecimal, String> function = bigDecimal -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("$" + bigDecimal);
            return String.valueOf(stringBuilder);
        };
        BigDecimal bigDecimal = new BigDecimal("123.1234567890");
        System.out.println(function.apply(bigDecimal));
        System.out.println();
        System.out.println("******************Task5********************");
        Predicate<String> predicate2 = s -> true;
        System.out.println(Main.checkMinMaxLength(predicate2, "Hello", 1, 5));
        System.out.println();
        System.out.println("******************Task6********************");
        IntSupplier intSupplier = () -> (int) (Math.random() * 10);
        System.out.println(intSupplier.getAsInt());
        System.out.println();
        System.out.println("******************Task7********************");
        IntUnaryOperator intUnaryOperator = operand -> (int) (Math.random() * operand);
        System.out.println(intUnaryOperator.applyAsInt(5));
        System.out.println();
        System.out.println("******************Task8********************");
        IntUnaryOperator intUnaryOperator2 = operand -> (int) Math.pow(operand, operand);
        System.out.println(intUnaryOperator2.applyAsInt(4));
        System.out.println();
        System.out.println("******************Task9********************");
        ToIntFunction<String> toIntFunction = value -> value.length();
        System.out.println(toIntFunction.applyAsInt("Hello"));
        System.out.println();
        System.out.println("******************Task10********************");
        Consumer<String> consumer = s -> System.out.println(s);
        String[] arrString = new String[10];
        for (int i = 0; i < 10; i++) {
            String str = "Hello";
            arrString[i] = str + i;
        }
        for (String element : arrString) {
            consumer.accept(element);
        }
    }

    public static boolean checkMinMaxLength(Predicate<String> predicate, String str, int min, int max) {
        if (predicate.test(str) && str.length() >= min && str.length() <= max) {
            return true;
        }
        return false;
    }

}