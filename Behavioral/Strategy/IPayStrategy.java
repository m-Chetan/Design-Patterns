package Behavioral.Strategy;

public interface IPayStrategy {
    boolean pay(int amount);
    void collectPaymentDetails();
}
