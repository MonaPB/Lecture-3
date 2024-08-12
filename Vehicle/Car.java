package Vehicle;

public class Car extends Vehicle{
    private BodyType bodyType;

    public Car(String brandName, FuelType fuelType, BodyType bodyType) {
        super(brandName, fuelType);
        this.bodyType = bodyType;
    }
}
