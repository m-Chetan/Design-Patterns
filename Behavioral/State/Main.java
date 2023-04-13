package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        
        State state = vendingMachine.getMachineState();
        state.clickOnInsert(vendingMachine);

        state.dispense(vendingMachine);

    }
}
