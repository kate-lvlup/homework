// napisat' class kotoruy vuvodit v console massiv sostoyashiu iz 2-h elementov. 1-u: kolichestvo vseh pozitivnuh znacheniu massiva, 2-u: symma vseh otricatel'nuh. Massiv vvoditsya s consoli.

class LessonFourTaskNine {
    public static void main(String[] args) {
        int[] valueArray;
        valueArray = new int[10];
        System.out.println();
        System.out.println("Random Array with ten elements:");
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = (int)(Math.random() * 200 - 100);
            System.out.println("Array element [" + i + "]: " + valueArray[i]);
        }
        int positiveSum = 0;
        int negativeCalc = 0;
        for (int i = 0; i < valueArray.length; i++) {
            if (valueArray[i] >= 0) {
                positiveSum++;
            } else {
               negativeCalc =  Math.addExact(negativeCalc, valueArray[i]);
            }
        }
        System.out.println();
        System.out.println("New Array with two elements:");
        int[] valueArrayTwoElements;
        valueArrayTwoElements = new int[2];
        valueArrayTwoElements[0] = positiveSum;
        valueArrayTwoElements[1] = negativeCalc;
        for (int i = 0; i < valueArrayTwoElements.length; i++) {
            System.out.println("Array element [" + i + "]: " + valueArrayTwoElements[i]);
        }
    }
}