package Vehicle;

public class Airplane extends Vehicle implements Fly{
    private Status status;

    public Airplane(String brandName, FuelType fuelType, Status status) {
        super(brandName, fuelType);
        this.status = status;
    }

    public void Fly(){
        System.out.println("Flying!");
    }
}
