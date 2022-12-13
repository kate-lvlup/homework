//3. написать в котором будет статический метод, который параметром принимает строку,
// а возвращает кол-во гласных, метод который принимает строку, возвращает ее центральный елемент,
// метод который принимает параметрам массив строк и возвращает самый короткий элемент,
// метод который принимает строку как параметр и возвращает строку задом на перед

package strings;

public class TakeString {

    public static int numberVowels(String string) {
        int number = 0;
        char[] charArray = string.toLowerCase().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 97 || charArray[i] == 101 || charArray[i] == 105
                    || charArray[i] == 111 || charArray[i] == 117 || charArray[i] == 121) {
                number++;
            }
        }
        return number;
    }

    public static void centralElement(String string) {
        char[] charArray = string.toCharArray();
        double number = Math.round(charArray.length / 2);
        int numberInt = (int) number;
        for (int i = 0; i < charArray.length; i++) {
            if (i == numberInt) {
                System.out.println(charArray[i]);
            }
        }
    }

    public static String minElement(String[] string) {
        int minEl = string[0].length();
        int number = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() < minEl) {
                minEl = string[i].length();
                number = i;
            }
        }
        return string[number];
    }

    public static String reverseSting(String string) {
        char[] charArray = string.toCharArray();
        String resultString = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultString += charArray[i];
        }
        return resultString;
    }

}
