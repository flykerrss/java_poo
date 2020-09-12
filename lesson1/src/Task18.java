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

        int NewBalance = BeginingBalance + Charges - Credits;
        System.out.printf("Customer new balance: %d\n", NewBalance);

        //check if new balance eceeds the customer's credit limit
        if (NewBalance > CreditLimit)
            System.out.println("Credit limit exceed");
    }   //end main method
}   //end class
