// napisat` class kotoruy vuvodit v consol` vse elementy comandnoy stroki, a esli ih net vuvodit
// soobwenie chto ih kolichestvo ravno 0.

public class LessonFiveTaskFour {
    public static void main(String[] valueArray) {
        if (valueArray.length > 0) {
            for (int i = 0; i < valueArray.length; i++) {
                System.out.println("Array element [" + i + "]: " + valueArray[i]);
            }
        } else {
            System.out.println("The number of command line items is zero!");
        }
    }
}
