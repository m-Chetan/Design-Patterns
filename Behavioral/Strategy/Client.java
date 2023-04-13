package Behavioral.Strategy;

import java.util.Scanner;

//Client code
public class Client {
    public static void main(String[] args) {
        IPayStrategy strategy;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Paypal \n2.Credit Card");
        int paymentMode = sc.nextInt();

        if(paymentMode == 1){
            strategy = new PayByPaypalStrategy();
            strategy.collectPaymentDetails();
            strategy.pay(100);
        }
        else{
            strategy = new PayByCreditStrategy();
            strategy.collectPaymentDetails();
            strategy.pay(100);
        }
        

        
    }
}
