package Behavioral.State;

public class SelectProductState implements State{
    @Override
    public void clickOnInsert(VendingMachine vendingMachine) {
        
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        
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
        System.out.println("Select Product state");
        vendingMachine.setMachineState(new DispenseState());
    }
}
