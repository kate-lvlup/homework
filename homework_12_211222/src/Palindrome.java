//Написать класс с методами проверки строки на полиндрома,
// методом получения символа по заданному индексу,
// методом проверки заданной последовательности в строке,
// методом проверки заканчивается ли строка на заданную последовательность,
// метод получения длины строки,
// метод заменяющий последовательность одних символов на другие,
// метод который возвращает наиболее часто повторяющийся символ в строке,
// метод удаляющий все повторяющиеся символы в строке.  В классе мейн с методом мейн выполнить проверку


import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    Scanner scanner = new Scanner(System.in);

    //    метод проверки строки на полиндрома
    public void validatePalindrome() {
        System.out.println("Enter text: ");
        String input = scanner.nextLine();
        input = input.toLowerCase().replaceAll("\\W", "");
        char[] charArray = input.toCharArray();
        int number = charArray.length / 2;
        char[] charArray1 = new char[number];
        char[] charArray2 = new char[number];
        for (int i = 0; i < number; i++) {
            charArray1[i] = charArray[i];
        }
        System.out.println();
        for (int i = charArray.length, j = 0; j < number; i--, j++) {
            charArray2[j] = charArray[i - 1];
        }
        System.out.println();
        boolean result = true;
        for (int i = 0; i < number; i++) {
            if (charArray1[i] == charArray2[i]) {
                result = true;
            } else {
                result = false;
            }
        }
        if (result) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }

    //    метод получения символа по заданному индексу
    public void getSymbol() {
        System.out.println("Enter text: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter index: ");
        int input2 = scanner.nextInt();
        char symbol = input1.charAt(input2);
        System.out.println(symbol);
    }

    //    метод проверки заданной последовательности в строке
    public void containString() {
        System.out.println("Enter text: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter search text: ");
        String input2 = scanner.nextLine();
        System.out.println(input1.contains(input2));
    }

    // метод проверки заканчивается ли строка на заданную последовательность
    public void containEndString() {
        System.out.println("Enter text: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter search text: ");
        String input2 = scanner.nextLine();
        System.out.println(input1.endsWith(input2));
    }

    // метод получения длины строки
    public void lengthString() {
        System.out.println("Enter text: ");
        String input1 = scanner.nextLine();
        System.out.println(input1.length());
    }

    // метод заменяющий последовательность одних символов на другие
    public void replaceString() {
        System.out.println("Enter text: ");
        String input1 = scanner.nextLine();
        System.out.println(input1.replace("Hello", "Bye"));
    }

    // метод который возвращает наиболее часто повторяющийся символ в строке
    public void repeatSymbol() {
        System.out.println("Enter text: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        String s = String.valueOf(charArray);
        for (int i = 0; i < charArray.length; i += (s.lastIndexOf(charArray[i]) - s.indexOf(charArray[i]) + 1)) {
            System.out.println(charArray[i] + "(" + (s.lastIndexOf(charArray[i]) - s.indexOf(charArray[i]) + 1) + ")");
        }
        int max = 0;
        int res = 0;
        for (int i = 0; i < charArray.length; i += (s.lastIndexOf(charArray[i]) - s.indexOf(charArray[i]) + 1)) {
            if (max < res) {
                max = res;
            }
            res = s.lastIndexOf(charArray[i]) - s.indexOf(charArray[i]) + 1;
        }
        System.out.println(max);
        for (int i = 0; i < charArray.length; i += (s.lastIndexOf(charArray[i]) - s.indexOf(charArray[i]) + 1)) {
            res = s.lastIndexOf(charArray[i]) - s.indexOf(charArray[i]) + 1;
            if (max == res) {
                System.out.println(charArray[i]);
            }
        }
    }

    // метод удаляющий все повторяющиеся символы в строке
    public void deleteRepeatSymbol() {
        System.out.println("Enter text: ");
        String input = scanner.nextLine();
        input = new StringBuilder(input).reverse().toString();
        input = input.replaceAll("(.)(?=.*\\1)", "");
        input = new StringBuilder(input).reverse().toString();
        System.out.println(input);
    }

}
