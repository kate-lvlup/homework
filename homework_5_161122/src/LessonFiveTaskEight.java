// napisat` programmu kotoraya prinimayet iz potoka vvoda-vuvoda dva znacheniya: vysota i shyrina dvumernogo massiva,
// sozdaem dva dvuhmernuh massiva na osnovanii etih znacheniy, zapolnyaem eti massivy randomnymi chislami ot 0 do 100
// i proizvesti slozheniye dannyh massivov (rezultatom bydet nekiy tretiy massiv) s vyvedeniye rezultata
// na ekran (naprimer znacheniye iz yacheiki [0][0] ckladuvaetcya s sootv. znacheniyem iz vtorogo massiva)
// znacheniye vusotu i shurinu ne mozhet byt`menshe 3 i bolshe 5

import java.util.Scanner;

public class LessonFiveTaskEight {
    public static void main(String[] args) {
        Scanner valueScanner = new Scanner(System.in);
        int height;
        int width;
        do {
            System.out.println("Enter the height: ");
            height = valueScanner.nextInt();
            System.out.println("Enter the width: ");
            width = valueScanner.nextInt();
            if (height < 3 || height > 5 || width < 3 || width > 5) {
                System.out.println("You must enter values from 3 to 5");
            }
        } while (height < 3 || height > 5 || width < 3 || width > 5);
        int[][] valueArrayOne = new int[height][width];
        int[][] valueArrayTwo = new int[height][width];
        int[][] valueArrayThree = new int[height][width];
        System.out.println("The first array:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                valueArrayOne[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(valueArrayOne[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The second array:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                valueArrayTwo[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(valueArrayTwo[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum of arrays:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                valueArrayThree[i][j] = valueArrayOne[i][j] + valueArrayTwo[i][j];
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(valueArrayThree[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
