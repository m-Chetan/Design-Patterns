package Behavioral.State;

public class DispenseState implements State{
    @Override
    public void clickOnInsert(VendingMachine vendingMachine) {}

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Dispense State");
        vendingMachine.setMachineState(new IdleState());
    }

    @Override
    public int getChange(VendingMachine vendingMachine) {
        return 0;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin) {
        
    }

    @Override
    public int refund(VendingMachine vendingMachine) {
        return 0;
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        
    }
}
