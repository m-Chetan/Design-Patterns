package Behavioral.Strategy;

public class PayByCreditStrategy implements IPayStrategy{
   

    @Override
    public void collectPaymentDetails() {
        System.out.println("Credit Card details");
        
    }

    @Override
    public boolean pay(int amount) {
        System.out.println(amount + "Payment by Credit successful");
        return false;
    }
    
}
