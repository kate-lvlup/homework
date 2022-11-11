// napisat' class kotoruy vuvodit v console symmy vseh absoljutnuh znacheniu masiva

class LessonFourTaskOne {
    public static void main(String[] args) {
        int[] valueArray;
        valueArray = new int[10];
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = (int)(Math.random() * 200 - 100);
            System.out.println("Array element [" + i + "]: " + valueArray[i]);
        }
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = Math.abs(valueArray[i]);
            System.out.println("ABS Array element [" + i + "]: " + valueArray[i]);
        }
        int valueSumMath = 0;
        for (int i = 0; i < valueArray.length; i++) {
            valueSumMath = Math.addExact(valueSumMath, valueArray[i]);
        }
        System.out.println("Sum of array values using Math library: " + valueSumMath);
    }
}