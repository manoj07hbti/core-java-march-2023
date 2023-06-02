package oops.abstraction;

public abstract class Vehicle {

    String engineNumber;



    int power;
    double price;
    public Vehicle() {
    }
    public Vehicle(String engineNumber, int power, double price) {
        this.engineNumber = engineNumber;
        this.power = power;
        this.price = price;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInformation(Vehicle vehicle){

        System.out.println("Vehicle information Engine number is :"+vehicle.getEngineNumber() +" Power: "+vehicle.getPower()+" Price: "+vehicle.getPrice());

    }

    public abstract void servicing();

    public abstract void pricing();

}
