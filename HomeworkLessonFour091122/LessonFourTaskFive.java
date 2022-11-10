// napisat' class kotoruy vuvodit v console naimen'shuu element massiva

class LessonFourTaskFive {
    public static void main(String[] args) {
        int[] valueArray;
        valueArray = new int[10];
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = (int) (1 + Math.random() * 9);
            System.out.println("Array element [" + i + "]: " + valueArray[i]);
        }
        int valueSum = 0;
        int valueMin = valueArray[0];
        for (int i = 0; i < valueArray.length; i++) {
            if (valueMin > valueArray[i]) {
                valueMin = valueArray[i];
            }
        }
        System.out.println("Min value: " + valueMin);
    }
}