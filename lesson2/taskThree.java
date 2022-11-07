// napisat' class kotoruy vuvodit v consol' rezyl'tat konvertacii gradysov po cel'siju v farengeytu (1 °C × 9/5) + 32 = 33,8 °F

class taskThree {
    public static void main(String[] args) {
        double valueCelsius = 36d;
        double valueFahrenheit = (valueCelsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + valueFahrenheit);
    }
}