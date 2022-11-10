// napisat' class kotoruy vuvodit v console summy vseh celuh chisel ot 1 do zadanogo znacheniya, chislo vsegda bol'she 0

import java.util.Scanner;

class LessonFourTaskThree {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = myScan.nextInt();
        int valueSum = 0;
        if (num <= 0) {
            System.out.println("You entered an invalid number");
        }
        if (num == 1) {
            System.out.println("Sum: " + num);
        }
        if (num > 1) {
            for (int i = 1; i < num + 1; i++) {
                valueSum = valueSum + i;
            }
            System.out.println("Sum: " + valueSum);
        }
    }
}