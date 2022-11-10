// napisat' class kotoruy vuvodit v console massiv chisel yvelichennuh v 2 raza, dlya resheniya ispol'zovat' biblioteky Math

class LessonFourTaskEight {
    public static void main(String[] args) {
        int[] valueArray;
        valueArray = new int[10];
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = (int) (1 + Math.random() * 9);
            System.out.println("Array element [" + i + "]: " + valueArray[i]);
        }
        System.out.println();
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = (int) (Math.scalb(valueArray[i], 1));
            System.out.println("Increased Array element in 2 times [" + i + "]: " + valueArray[i]);
        }
    }
}