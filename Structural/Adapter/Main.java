package Structural.Adapter;

import Structural.Adapter.adapter.WeightMachineAdapter;
import Structural.Adapter.adapter.WeightMachineImp;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineImp();
        
        double getWeightInKg = weightMachineAdapter.getWeightInKg();

        System.out.println(getWeightInKg + " kg");

    }
}
