package laptops;

public class Laptop {
    String brand;
    boolean isTurnedOn = false;
    String welcomePhrase;
    int butteryAmount;

    public Laptop(String brand, boolean isTurnedOn, String welcomePhrase, int butteryAmount) {
        this.brand = brand;
        this.isTurnedOn = isTurnedOn;
        this.welcomePhrase = welcomePhrase;
        this.butteryAmount = butteryAmount;
    }

    public void getBrand() {
        System.out.println("Brand: " + brand);
    }

    public void getIsTurnedOn() {
        System.out.println("IsTurnedOn: " + isTurnedOn);
    }

    public void getWelcomePhrase() {
        System.out.println("Welcome Phrase: " + welcomePhrase);
    }

    public void getButteryAmount() {
        System.out.println("Buttery amount: " + butteryAmount);
    }

    public void TurnOn() {
        if (!isTurnedOn) {
            isTurnedOn = true;
            System.out.println(welcomePhrase);
        } else {
            System.out.println("Your laptop is already on");
        }
    }

    public void decreaseButteryAmount() {
        butteryAmount -= 5;
        System.out.println("Buttery amount: " + butteryAmount);
        if (butteryAmount < 10 && butteryAmount > 0) {
            System.out.println("Warning! Less than 10% charge left");
        } else if (butteryAmount == 0) {
            isTurnedOn = false;
            System.out.println("Laptop turned off");
        }
    }
}
