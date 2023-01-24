import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//Task1
//    Получить список всех файлов и папок по указанному пути.
//    (строка которой задается путь передается в параметры метода)
public class MethodsImplementation {
    public static void getDirectoriesFiles(String string) {
        File file = new File(string);
        File[] arrFiles = file.listFiles();
        for (File element : arrFiles) {
            System.out.println(element.getName());
        }
    }


//Task2
//    Создать текстовый файл и заполнить несколько строк произвольным текстом,
//    Результат считать и вывести на екран. создать два метода, один для чтения, другой для ввода.
//    Имя файла и текст вводить из консоли.

    public static void createTextFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("File " + fileName + " is created");
    }

    public static void writeIntoTextFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))
        ) {
            System.out.print("How many lines do you want to fill?: ");
            int numberRows = scanner.nextInt();
            System.out.println("Fill in the file: ");
            Scanner scanner1 = new Scanner(System.in);
            String[] arrString = new String[numberRows];
            for (int i = 0; i < arrString.length; i++) {
                arrString[i] = scanner1.nextLine();
            }
            StringBuilder stringBuilder = new StringBuilder();
            String lines = null;
            for (int i = 0; i < arrString.length; i++) {
                lines = String.valueOf(stringBuilder.append(arrString[i] + '\n'));
            }
            bufferedWriter.write(lines);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void readTextFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))
        ) {
            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                int i;
                if ((i = bufferedReader.read()) == -1) {
                    break;
                } else {
                    stringBuilder.append((char) i);
                }
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            System.out.println(e);
        }
    }


//Task3
//    Создать текстовый файл произвольного содержания,
//    считать его и вывести на екран кол-во символов в файле,
//    кол-во слов в файле.(Два значения)

    public static void countSymbolsAndFiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))
        ) {
            bufferedWriter.write("First line\n");
            bufferedWriter.write("Second line\n");
            bufferedWriter.write("Third line\n");
        } catch (IOException e) {
            System.out.println(e);
        }
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))
        ) {
            int count = 0;
            StringBuilder stringBuilder = new StringBuilder();
            line = null;
            while (true) {
                int i;
                if ((i = bufferedReader.read()) == -1) {
                    break;
                } else {
                    line = String.valueOf(stringBuilder.append((char) i));
                    count++;
                }
            }
            System.out.println("Characters: " + count);
        } catch (IOException e) {
            System.out.println(e);
        }
        String newLine = line.replace("\n", " ");
        String[] arrString = newLine.split(" ");
        int words = 0;
        for (String element : arrString) {
            words++;
        }
        System.out.println("Words: " + words);
    }


    //Task4
//    Создать текстовый файл произвольного содержания и переименовать его
    public static void renameFile() {
        File file = new File("TestFile.txt");
        try {
            file.createNewFile();
            System.out.println(file + " is created");
        } catch (IOException e) {
            System.out.println(e);
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("First line\n");
            bufferedWriter.write("Second line\n");
            bufferedWriter.write("Third line\n");
        } catch (IOException e) {
            System.out.println(e);
        }
        file.renameTo(new File("NewNameFile.txt"));
    }


    //Task6
//    Создать текстовый файл, но с условием, что при достижении 12ого символа запись будет производиться с новой строки,
//    потом считать содержимое файла и вывести на екран.
//    Пользователь вводит текст из консоли
    public static void newLineTransition() {
        File file = new File("TextFileTask6.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))
        ) {
            file.createNewFile();
            System.out.println(file + " is created");
            System.out.println("Enter the text:");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            char[] arrChar = line.toCharArray();
            String[] arrString = new String[arrChar.length];
            for (int i = 0; i < arrString.length; i++) {
                arrString[i] = String.valueOf(arrChar[i]);
            }
            for (int i = 0; i < arrString.length; i = i + 12) {
                if (i == 0) {
                    i = i + 11;
                    arrString[i] = arrString[i] + "\n";
                } else {
                    arrString[i] = arrString[i] + "\n";
                }
            }
            String line2 = String.join("", arrString);
            bufferedWriter.write(line2);
        } catch (IOException e) {
            System.out.println(e);
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                int i;
                if ((i = bufferedReader.read()) == -1) {
                    break;
                } else {
                    stringBuilder.append((char) i);
                }
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //Task7
//    Создать текстовый файл с именем original.txt,
//    который будет содержать строку "HellO from text filE",
//    далее необходимо перезаписать содержимое этого файла в новый файл с именем originalCOPY.txt,
//    удалив все гласные из строки.
    public static void copyFile() {
        File file = new File("original.txt");
        String line = "";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))
        ) {
            file.createNewFile();
            bufferedWriter.write("HellO from text filE");
        } catch (IOException e) {
            System.out.println(e);
        }
        File fileCopy = new File("originalCOPY.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileCopy))
        ) {
            int i;
            do {
                i = bufferedReader.read();
                if (i != -1) {
                    line += (char) i;
                }
            } while (i != -1);
            System.out.println(line);
            String newline = line.replaceAll("[aeiouAEIOU]", "");
            bufferedWriter2.write(newline);
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    //Task8
//    Реализовать метод который сравнивает содержание двух файлов,
//    если они идентичны - вывести на экран, если нет - вывести на екран
    public static void compareTextFiles() {
        File file1 = new File("firstTestFile.txt");
        File file2 = new File("secondTestFile.txt");
        File file3 = new File("thirdTestFile.txt");

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
             BufferedReader bufferedReader3 = new BufferedReader(new FileReader(file3));
        ) {
            int i;
            int j;
            int k;
            String line1 = "";
            String line2 = "";
            String line3 = "";
            do {
                i = bufferedReader1.read();
                if (i != -1) {
                    line1 += (char) i;
                }
            } while (i != -1);
            do {
                j = bufferedReader2.read();
                if (j != -1) {
                    line2 += (char) j;
                }
            } while (j != -1);
            do {
                k = bufferedReader3.read();
                if (k != -1) {
                    line3 += (char) k;
                }
            } while (k != -1);
            if (line1.equals(line2)) {
                System.out.println("The contents of file 'firstTestFile' and file 'secondTestFile' are the same");
            } else {
                System.out.println("The contents of file 'firstTestFile' and file 'secondTestFile' do not match");
            }
            if (line1.equals(line3)) {
                System.out.println("The contents of file 'firstTestFile' and file 'thirdTestFile' are the same");
            } else {
                System.out.println("The contents of file 'firstTestFile' and file 'thirdTestFile' do not match");
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static void compareFiles() {
        File file1 = new File("1.png");
        File file2 = new File("2.png");
        File file3 = new File("3.png");
        try (BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(file1));
             BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
             BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(file3))
        ) {
            int i;
            int j;
            int k;
            byte[] arrBytes1 = bufferedInputStream1.readAllBytes();
            byte[] arrBytes2 = bufferedInputStream2.readAllBytes();
            byte[] arrBytes3 = bufferedInputStream3.readAllBytes();
            if (Arrays.equals(arrBytes1, arrBytes2)) {
                System.out.println("The contents of file '1' and file '2' are the same");
            } else {
                System.out.println("The contents of file '1' and file '2' do not match");
            }
            if (Arrays.equals(arrBytes1, arrBytes3)) {
                System.out.println("The contents of file '1' and file '3' are the same");
            } else {
                System.out.println("The contents of file '1' and file '3' do not match");
            }
        } catch (IOException e) {
            System.out.println("File is not found");
        }
    }
}
