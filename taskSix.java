// napisat' class kotoruy vuvodit v consol' bol'shee iz treh zadanuh chisel

class taskSix {
    public static void main(String[] args) {
        int valueOne = 7;
        int valueTwo = 5;
        int valueThree = 10;
        if (valueOne > valueTwo && valueOne > valueThree) {
            System.out.println("largest number: " + valueOne);
        } else if (valueTwo > valueThree) {
            System.out.println("largest number: " + valueTwo);
        } else {
            System.out.println("largest number: " + valueThree);
        }
    }
}