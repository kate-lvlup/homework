// napisat' class kotoruy vuvodit v console summy vseh pozitivnux znacheniy massiva

import java.util.Scanner;

class LessonFourTaskTwo {
    public static void main(String[] args) {
        int[] valueArray;
        valueArray = new int[5];
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter 5 (positive / negative) numbers: ");
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = myScan.nextInt();
        }
        int valueSum = 0;
        for (int i = 0; i < valueArray.length; i++) {
            if (valueArray[i] >= 0) {
                valueSum = valueSum + valueArray[i];
            }
        }
        System.out.println("Sum of positive values in an array of 5 numbers: " + valueSum);
    }
}