package Behavioral.State;

public class IdleState implements State{

    @Override
    public void clickOnInsert(VendingMachine vendingMachine) {
        System.out.println("Idle State");
        vendingMachine.setMachineState(new MoneyState());
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
        
    }
    
}
