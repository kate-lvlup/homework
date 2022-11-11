// napisat' class kotoruy vuvodit v console symmy vseh elementov massiva vozveddennuh v kvadrat

class LessonFourTaskFour {
    public static void main(String[] args) {
        int[] valueArray;
        valueArray = new int[10];
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = (int)(1 + Math.random() * 9);
            System.out.println("Array element [" + i + "]: " + valueArray[i]);
        }
        int valueSum = 0;
        for (int i = 0; i < valueArray.length; i++) {
            valueSum += Math.pow(valueArray[i], 2);
            System.out.println(valueSum);
        }
        System.out.println("Sum of array elements to the second power: " + valueSum);
    }
}