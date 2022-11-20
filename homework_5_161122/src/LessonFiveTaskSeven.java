// napisat` programmu nahozhdeniya factoriala chisla, chislo poluchaem iz potoka vvoda-vuvoda scaner,
// rezyltat vuvoditsya na ekran

import java.util.Scanner;

public class LessonFiveTaskSeven {
    public static void main(String[] args) {
        Scanner valueScanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int valueNumber = valueScanner.nextInt();
        int valueFactorial = 1;
        for (int i = valueNumber; i > 0; i--) {
            valueFactorial *= i;
        }
        System.out.println("Factorial of a number: " + valueFactorial);
    }
}
