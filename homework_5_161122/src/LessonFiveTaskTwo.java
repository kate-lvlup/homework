// napisat` class kotoruy vuvodit v consol` massiv chisel ot n do 1, gde n - chislo zadannoe iz
// potoka vvoda-vuvoda classa scaner, esli n = 0 ili n < 0 vuvesti na ekran coobwenie chto
// chislo ne validno i zaprosit` novui vvod

import java.util.Scanner;

public class LessonFiveTaskTwo {
    public static void main(String[] args) {
        Scanner valueScanner = new Scanner(System.in);
        int valueNum;
        do {
            System.out.println("Enter the number");
            valueNum = valueScanner.nextInt();
            if (valueNum <= 0) {
                System.out.println("You entered an invalid number");
            }
        } while (valueNum <= 0);
        int[] valueArray = new int[valueNum];
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = valueNum;
            valueNum--;
            if (i == valueArray.length - 1) {
                System.out.println(valueArray[i]);
            } else {
                System.out.print(valueArray[i] + ", ");
            }
        }
    }
}