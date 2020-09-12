import java.util.Scanner;
public class Task16
{
    // main method
    public static void main(String[] args)
    {
        // Scanner to obtain integers
        Scanner input=new Scanner(System.in);

        // Variables
        int num1;	// first number
        int num2;	// second number

        System.out.print("Enter first number: ");
        num1 = input.nextInt();	// first number input

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();	// second number input

        if(num1 > num2)     //check if num1 is larger
            System.out.printf("%d is larger", num1);

        else if(num2 > num1)       //check if num2 is larger
            System.out.printf("%d is larger", num2);
        else        // print that numbers are equal
            System.out.println("These numbers are equal");

    }	// end method main

}   // end class