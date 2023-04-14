package Behavioral.NullObject;

public class Car implements Vehicle {

    @Override
    public int getSeatCapacity() {
        return 5;
    }

    @Override
    public int getTankCapacity() {
        return 30;
    }
    
}
