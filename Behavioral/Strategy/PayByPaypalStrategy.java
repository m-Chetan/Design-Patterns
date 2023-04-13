package Behavioral.Strategy;

import java.util.Scanner;

public class PayByPaypalStrategy implements IPayStrategy{
    private String email;
    private String password;

    Scanner sc = new Scanner(System.in);

    @Override
    public void collectPaymentDetails() {
        System.out.print("Enter email: ");
        email = sc.next();
        sc.nextLine();

        System.out.print("Enter Password: ");;
        password = sc.next();
        System.out.println(email + "logged in successfully");
    }

    @Override
    public boolean pay(int amount) {
        System.out.println(amount + " Payment by Paypal successful");
        return true;
    }

}

