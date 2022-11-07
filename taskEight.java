// napisat' class kotoruy vuvodit v consol' vek iz polychenou datu (naprimer 873 god - eto 9-u vek, a 1701 god - eto 18-u vek)

class taskEight {
    public static void main(String[] args) {
        int valueYear = (int) (1 + Math.random() * 2023);
        System.out.println("Year: " + valueYear);
        int valueCentury = (valueYear / 100) + 1;
        System.out.println("Century: " + valueCentury);
    }
}