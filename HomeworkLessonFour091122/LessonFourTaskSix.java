// napisat' class kotoruy vuvodit v console massiv chisel v obratnom poryadke, polychennuy iz chisla vvedenogo v console

import java.util.Scanner;

class LessonFourTaskSix {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = myScan.nextInt();
        int[] valueArray;
        valueArray = new int[num];
        int valueNum = num;
        for (int i = 0; i < num; i++, valueNum--) {
            valueArray[i] = valueNum;
            System.out.println("Array element [" + i + "]: " + valueArray[i]);
        }
    }
}