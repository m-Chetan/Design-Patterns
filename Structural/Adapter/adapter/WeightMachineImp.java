package Structural.Adapter.adapter;

import Structural.Adapter.adaptee.HumanWeightMachine;
import Structural.Adapter.adaptee.WeightMachine;

public class WeightMachineImp implements WeightMachineAdapter {
    WeightMachine weightMachine;

    public WeightMachineImp(){
        this.weightMachine = new HumanWeightMachine();
    }

    @Override
    public double getWeightInKg() {
        double weightInKg = weightMachine.getWeightInPound() * 0.45;
        return weightInKg;
    }
    
}
