// napisat' class kotoruy vuvodit v consol' summy, raznost', proizvedenie, rezyl'tat deleniya, ostatok ot deleniya i procent pervogo ot vtorogo chisla

class TaskTwo {
    public static void main(String[] args) {
        double valueOne = 155d;
        double valueTwo = 50d;
        double valueSum = valueOne + valueTwo;
        double valueSubtraction = valueOne - valueTwo;
        double valueMultiplication = valueOne * valueTwo;
        double valueDivision = valueOne / valueTwo;
        double valueModulo = valueOne % valueTwo;
        double valuePercent = (valueOne / valueTwo) * 100;
        System.out.println("sum: " + valueSum);
        System.out.println("subtraction: " + valueSubtraction);
        System.out.println("multiplication: " + valueMultiplication);
        System.out.println("division: " + valueDivision);
        System.out.println("modulo: " + valueModulo);
        System.out.println("percent: " + valuePercent);
    }
}