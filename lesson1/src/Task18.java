import java.util.Scanner;

public class Task18 {
    //main method
    public static void main(String[] args) {
        //scanner to obtain data
        Scanner scann = new Scanner(System.in);

        //input available facts
        System.out.println("Enter account number:");
        int AccountNumber = scann.nextInt();

        System.out.println("Enter begining balance:");
        int BeginingBalance = scann.nextInt();

        System.out.println("Enter charges:");
        int Charges = scann.nextInt();

        System.out.println("Enter credits:");
        int Credits = scann.nextInt();

        System.out.println("Enter credit limit:");
        int CreditLimit = scann.nextInt();

        //calculate new customer's balance
        int NewBalance = BeginingBalance + Charges - Credits;

        //check if new balance exceeds the customer's credit limit
        if (NewBalance *(-1) >= CreditLimit)
            System.out.printf("New customer's balance is: %d. Credit limit exceed", NewBalance);
        else
            System.out.printf("New customer's balance is: %d.", NewBalance);
    }   //end main method
}   //end class
