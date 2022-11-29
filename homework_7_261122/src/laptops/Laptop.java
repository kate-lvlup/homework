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

    public String getBrand() {
        return brand;
    }

    public boolean getIsTurnedOn() {
        return isTurnedOn;
    }

    public String getWelcomePhrase() {
        return welcomePhrase;
    }

    public int getButteryAmount() {
        return butteryAmount;
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
