// napisat` programmu kotoraya iz potoka vvoda-vuvoda scaner prinimayet celochislennoe chislo i
// vuvodit na ekran chislo polozhytelnoye ili otricatelnoye, a esli 0, to
// soobweniye ob etom i programma zavershaetsya. Obrabotat poluchenie ne chislennyh znacheniy

import java.util.Scanner;

public class LessonFiveTaskSix {
    public static void main(String[] args) {
        Scanner valueScanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int valueNumber = valueScanner.nextInt();
        if (valueNumber > 0) {
            System.out.println("The number is positive!");
        } else if (valueNumber < 0) {
            System.out.println("The number is negative!");
        } else {
            System.out.println("The number is zero!");
        }
    }
}