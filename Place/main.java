package Place;

import Vehicle.*;

public class main {
    public static void main(String[] args) {
        Airport airport=new Airport();
        Parking parking=new Parking();
        Car car1=new Car("BMW", FuelType.Gasoline, BodyType.Sedan);
        Car car2=new Car("Porsche",FuelType.WhiteGasoline,BodyType.Suv);
        Airplane airplane1=new Airplane("IranAir",FuelType.Diesel, Status.Boarding);
        Airplane airplane2=new Airplane("QeshmAir",FuelType.Diesel,Status.Delayed);
        Helicopter helicopter1=new Helicopter("G7",FuelType.Gasoline);
        Helicopter helicopter2=new Helicopter("M2",FuelType.WhiteGasoline);
    }
}
