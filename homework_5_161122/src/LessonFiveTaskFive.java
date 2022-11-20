// napisat` class kotoruy iz potoca vvoda-vuvoda scaner prinimaet chislo s plavayuschey tochkoy i
// vuvodit na ekran 1)chislo okryglennoe k menshemu celochislinomy znacheniyu 2) samo chislo
// 3)k bolshemu celochislennomu cheslu, dlya resheniya ispolzovat` Math

import java.util.Scanner;

public class LessonFiveTaskFive {
    public static void main(String[] args) {
        Scanner valueScanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double valueNumber = valueScanner.nextDouble();
        System.out.println("The number rounded down to the smallest integer number: " + (int) (Math.floor(valueNumber)));
        System.out.println("My number: " + valueNumber);
        System.out.println("The number is rounded up to a higher integer number: " + (int) (Math.ceil(valueNumber)));
    }
}
