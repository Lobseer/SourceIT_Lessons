package Homework8Racing;

/**
 * Created by lobseer on 02.11.2016.
 */
public class Truck extends Car {
    private Car[] insideCars;
    protected int carsAmount=0;
    protected int maxCarsAmount;

    public Truck(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize, int maxCarsAmount) {
        super(brand, weight, wheelsAmount, drivePower, maxSpeed, tankSize);
        this.maxCarsAmount = maxCarsAmount;
        insideCars = new Car[maxCarsAmount];
    }

    public void putCar(Car car) {
        if(carsAmount<maxCarsAmount) {
            insideCars[carsAmount++]=car;
        } else {
            System.out.println("not space enough\n");
        }
    }
}
