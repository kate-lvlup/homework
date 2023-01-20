//Task5
//    Создать текстовый файл, заполнить несколько строк произвольным текстом,
//    вывести строки на екран в обратном порядке.
//    Со звездочкой - вывести и строки и символы в обратном порядке.
//    Для реализации лучше всего создать отдельный класс на два метода

import java.io.*;

public class ViceVersa {
    public static void createFile() {
        File file = new File("TextFileTask5.txt");
        BufferedWriter bufferedWriter = null;
        try {
            file.createNewFile();
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("First line\n");
            bufferedWriter.write("Second line\n");
            bufferedWriter.write("Third line\n");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

    public static void printStrings() {
        File file = new File("TextFileTask5.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String string = null;
            while (true) {
                int i;
                if ((i = bufferedReader.read()) == -1) {
                    break;
                } else {
                    string = String.valueOf(stringBuilder.append((char) i));
                }
            }
            String[] arrString = string.split("\n");
            for (int i = arrString.length - 1; i >= 0; i--) {
                char[] arrString2 = arrString[i].toCharArray();
                for (int j = arrString2.length - 1; j >= 0; j--) {
                    System.out.print(arrString2[j]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
}
