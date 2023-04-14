package Behavioral.NullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("CAR");

        System.out.println(vehicle.getSeatCapacity());
        System.out.println(vehicle.getTankCapacity());
    }
}
