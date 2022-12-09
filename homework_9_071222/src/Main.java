import myMathMethods.MyMath;
import strings.TakeString;

public class Main {
    public static void main(String[] args) {
        System.out.println("********Task1********");
        Weather weather1 = new Weather("windy", 5);
        Immutable immutable1 = new Immutable(15, "winter", weather1);
        weather1.setNameWeather("snowy");
        weather1.setWindSpeed(1);
        System.out.println(weather1.getWindSpeed());
        System.out.println(weather1.getNameWeather());
        System.out.println();
        System.out.println(immutable1.getWeather().getWindSpeed());
        System.out.println(immutable1.getWeather().getNameWeather());
        System.out.println(immutable1.getTemperature());
        System.out.println(immutable1.getSeason());
        System.out.println();
        System.out.println("********Task2********");
        MyMath math1 = new MyMath();
        System.out.println(math1.sum(2, 3));
        System.out.println(math1.sum(2.5d, 3.6666d));
        System.out.println(math1.subtraction(2, 3));
        System.out.println(math1.subtraction(2.5d, 3.6666d));
        System.out.println(math1.multiplication(2, 3));
        System.out.println(math1.multiplication(2.5d, 3.6666d));
        System.out.println(math1.division(2, 3));
        System.out.println(math1.division(2.5d, 3.6666d));
        System.out.println(math1.maxValue(2, 3));
        System.out.println(math1.minValue(2, 3));
        System.out.println(math1.maxValue(2.5d, 3.6666d));
        System.out.println(math1.minValue(2.5d, 3.6666d));
        System.out.println(math1.powValue(2, 3));
        System.out.println(math1.percentValue(400.555d, 10.5d));
        System.out.println(math1.sqrtValue(16));
        System.out.println();
        System.out.println("********Task3********");
        TakeString takeString1 = new TakeString();
        System.out.println(takeString1.numberVowels("Hello World and HI PEOPLE"));
        takeString1.centralElement("Hello World and HI PEOPLE");
        String[] string = {"Hello", "World",  "and",  "HI",  "PEOPLE"};
        System.out.println(takeString1.minElement(string));
        System.out.println(takeString1.reverseSting("Hello World and HI PEOPLE"));
    }
}