// napisat' class kotoruy vuvodit v console symmy vseh absoljutnuh znacheniu masiva

class LessonFourTaskOne {
    public static void main(String[] args) {
        int[] valueArray;
        valueArray = new int[10];
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = (int) (1 + Math.random() * 9);
            System.out.println("Array element [" + i + "]: " + valueArray[i]);
        }
        int valueSum = 0;
        for (int i = 0; i < valueArray.length; i++) {
            valueSum = valueSum + valueArray[i];
        }
        System.out.println("Sum of array values: " + valueSum);
        int valueSumMath = 0;
        for (int i = 0; i < valueArray.length; i++) {
            valueSumMath = Math.addExact(valueSumMath, valueArray[i]);
        }
        System.out.println("Sum of array values using Math library: " + valueSumMath);
    }
}