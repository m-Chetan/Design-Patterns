package Behavioral.State;

public class MoneyState implements State{
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
        System.out.println("Money State");
        vendingMachine.setMachineState(new SelectProductState());

    }

    @Override
    public int refund(VendingMachine vendingMachine) {
        return 0;
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int productId) {
        
    }
}
