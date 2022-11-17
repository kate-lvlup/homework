// napisat` class kotoruy vuvodit v consol` srednee znacheniye elementov celochislenogo
// massiva, znacheniya massiva zadat` cherez potok vvoda-vuvoda class scaner

import java.util.Scanner;

public class LessonFiveTaskOne {
    public static void main(String[] args) {
        Scanner valueScanner = new Scanner(System.in);
        System.out.println("Enter the number of elements of the new array");
        int valueArrayLength = valueScanner.nextInt();
        System.out.println("Enter the elements of the new array");
        int[] valueInputArray = new int[valueArrayLength];
        for (int i = 0; i < valueArrayLength; i++) {
            valueInputArray[i] = valueScanner.nextInt();
        }
        int valueSum = 0;
        for (int i = 0; i < valueArrayLength; i++) {
            valueSum += valueInputArray[i];
        }
        System.out.println("Arithmetical mean: " + valueSum / valueArrayLength);
    }
}