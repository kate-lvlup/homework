// napisat' class kotoruy vuvodit v console chislo preobrazovannoe iz stroki

import java.util.Scanner;

class LessonFourTaskSeven {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter the number:");
        String row = myScan.next();
        Integer num = Integer.valueOf(row);
        System.out.println("Number converted from string: " + num);
    }
}

