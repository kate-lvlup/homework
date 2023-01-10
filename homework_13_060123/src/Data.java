//        Task7:
//        Cоздать класс в котором будет статический метод, который будет вводить числа с клавиатуры.
//        Код по чтению чисел с клавиатуры должен быть в методе readData.
//        Код внутри readData обернуть в try..catch.
//        Если пользователь ввёл какой-то текст, вместо ввода числа,
//        то метод должен перехватить исключение и вывести на экран все ранее
//        введенные числа в качестве результата.
//
//        В этом классе создать статический метод который вызывает в себе другой метод,
//        тот в свою очередь еще один, который  возвращает результат - глубину его стек-трейса - количество
//        методов в нем (количество элементов в списке).
//        воспользоваться методом Thread.currentThread().getStackTrace().
//        Это же число метод должен выводить на экран.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Data {

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter the numbers:");
        int i = 0;
        int j;
        try {
            for (i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            int[] array2 = new int[i];
            for (j = i - 1; j >= 0; j--, i--) {
                array2[j] = array[i - 1];
            }
            for (i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + " ");
            }
        }
    }


    public static void testMethod1() {
        testMethod2();
    }

    public static void testMethod2() {
        System.out.println(testMethod3());
    }

    public static int testMethod3() {
        return Thread.currentThread().getStackTrace().length;
    }

}
