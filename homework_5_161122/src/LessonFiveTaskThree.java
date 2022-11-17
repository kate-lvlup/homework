// napisat` class kotoruy vuvodit v consol` summu chisel elementov massiva s plavayuschei tochkoy.
// Chisla mogut byt` otricatelnymi ili ne celumi. Esli dlina massiva ravna nulyu, vy dolzhny vernut` 0.
// Dlina massiva i znachenie elementov zadayetcya rondomno.

public class LessonFiveTaskThree {
    public static void main(String[] args) {
        double[] valueArray = new double[(int) (Math.random() * 10)];
        if (valueArray.length == 0) {
            System.out.println("Array length: " + 0);
        } else {
            for (int i = 0; i < valueArray.length; i++) {
                valueArray[i] = Math.random() * 20 - 10;
                System.out.println("Array element [" + i + "]: " + valueArray[i]);
            }
            double valueSum = 0;
            for (int i = 0; i < valueArray.length; i++) {
                valueSum += valueArray[i];
            }
            System.out.println("Sum of all array elements: " + valueSum);
        }
    }
}
