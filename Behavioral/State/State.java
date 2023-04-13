package Behavioral.State;

public interface State {
    void clickOnInsert(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine, int coin);
    void selectProduct(VendingMachine vendingMachine, int productId);
    void dispense(VendingMachine vendingMachine);
    int getChange(VendingMachine vendingMachine);
    int refund(VendingMachine vendingMachine);

}
