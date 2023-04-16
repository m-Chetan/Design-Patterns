package Structural.Adapter.adaptee;

public class HumanWeightMachine implements WeightMachine {

    @Override
    public double getWeightInPound() {
        double weight = 100;
        System.out.println(weight + " pound");
        return weight;
    }
    
}
