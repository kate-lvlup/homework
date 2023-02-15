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

public class FuncInterfaceMethods {


    // Task1
    public static Supplier<String> returnJavaWord() {
        return () -> "Java";
    }

    // Task2
    public static Predicate<String> checkIsEmptyString() {
        return s -> {
            if (s.length() == 0) {
                return true;
            } else return false;
        };
    }

    // Task3
    public static BiFunction<String, Integer, String> returnStringNTimes() {
        return (s, integer) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < integer; i++) {
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        };
    }

    // Task4
    public static Function<BigDecimal, String> returnStringWithSymbolAndBigDecimal() {
        return bigDecimal -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("$" + bigDecimal);
            return String.valueOf(stringBuilder);
        };
    }

    // Task5
    public static Predicate<String> checkStringRange(int min, int max) {
        return s -> s.length() >= min && s.length() <= max;
    }

    // Task6
    public static IntSupplier returnRandomInt() {
        return () -> (int) (Math.random() * 10);
    }

    // Task7
    public static IntUnaryOperator returnRandomIntWithinRange() {
        return operand -> (int) (Math.random() * operand);
    }

    // Task8
    public static IntUnaryOperator returnIntToPowOfItself() {
        return operand -> (int) Math.pow(operand, operand);
    }

    // Task9
    public static ToIntFunction<String> returnStringLength() {
        return value -> value.length();
    }

    // Task10
    public static Consumer<String> printString() {
        return s -> System.out.println(s);
    }
}
