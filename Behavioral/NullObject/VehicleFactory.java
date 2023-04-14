package Behavioral.NullObject;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicle){
          if(vehicle.equals("CAR")){
            return new Car();
          }  
          return new NullObject();
    }
}
