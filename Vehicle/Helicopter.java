package Vehicle;

public class Helicopter extends Vehicle implements Fly{
    public Helicopter(String brandName, FuelType fuelType) {
        super(brandName, fuelType);
    }

    public void Fly(){
        System.out.println("Flying");
    }
    public void Vertical(){
        System.out.println("Vertical flying.");

    }
}
