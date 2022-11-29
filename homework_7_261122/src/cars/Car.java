package cars;

public class Car {
    int maxSpeed;
    int fuelAmount;
    int productionYear;
    double price;
    String brand;
    int currentSpeed;
    boolean isEngineStarted = false;

    public Car(int maxSpeed, int fuelAmount, int productionYear, double price, String brand) {
        this.maxSpeed = maxSpeed;
        this.fuelAmount = fuelAmount;
        this.productionYear = productionYear;
        this.price = price;
        this.brand = brand;
    }

    public void getMaxSpeed() {
        System.out.println("Max speed: " + maxSpeed);
    }

    public void getFuelAmount() {
        System.out.println("Fuel amount: " + fuelAmount);
    }

    public void getProductionYear() {
        System.out.println("Production year: " + productionYear);
    }

    public void getPrice() {
        System.out.println("Price: " + price);
    }

    public void getBrand() {
        System.out.println("Brand: " + brand);
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void getCurrentSpeed() {
        System.out.println("Current speed: " + currentSpeed);
    }

    public void getIsEngineStarted() {
        System.out.println("Is Engine Started: " + isEngineStarted);
    }

    public void startStopEngine() {
        if (isEngineStarted) {
            isEngineStarted = false;
            currentSpeed = 0;
            System.out.println("Car engine is stopped and current speed is 0");
        } else {
            isEngineStarted = true;
            System.out.println("Car engine is started");
        }
    }

    public void increaseAccelerating() {
        currentSpeed += 10;
        System.out.println("The current speed increased by 10 km and is: " + currentSpeed);
    }

    public void decreaseAccelerating() {
        currentSpeed -= 10;
        System.out.println("The current speed decreased by 10 km and is: " + currentSpeed);
    }

    public void startBeeping() {
        System.out.println("The car is beeping");
    }
}
