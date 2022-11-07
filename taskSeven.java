// napisat' class kotoruy vuvodit v consol' tri randomno sgenerirovanuh chisla bol'she 0 i men'she 100

class taskSeven {
    public static void main(String[] args) {
        int numOne = (int) (1 + Math.random()*99);
        int numTwo = (int) (1 + Math.random()*99);
        int numThree = (int) (1 + Math.random()*99);
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(numThree);
    }
}