package Vehicle;

public abstract class Vehicle {
    private String brandName;
    private FuelType fuelType;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void Start(){
        System.out.println("Starting!");
    }
    public void Move(){
        System.out.println("Moving.");
    }

    public Vehicle(String brandName, FuelType fuelType) {
        this.brandName = brandName;
        this.fuelType = fuelType;
    }
}
