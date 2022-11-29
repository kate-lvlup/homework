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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void startStopEngine() {
        if (isEngineStarted) {
            isEngineStarted = false;
            System.out.println("Car engine is stopped");
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
