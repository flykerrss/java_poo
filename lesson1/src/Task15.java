import java.util.Scanner;
public class Task15
{
    // main method
    public static void main(String[] args)
    {
        // Scanner to obtain integers
        Scanner input=new Scanner(System.in);

        // Variables
        int num1;	// first number
        int num2;	// second number
        int sum;	// sum of numbers
        int product;	// product of numbers
        int difference;	// difference of numbers
        float quotient;	// quotient of numbers

        System.out.print("Enter first number: ");
        num1 = input.nextInt();	// first number input

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();	// second number input

        sum	= num1 + num2;	// sum numbers
        product	= num1 * num2;	// multiply numbers
        difference = num1 - num2;	// difference of numbers
        quotient = (float)num1 / (float)num2;	// divide numbers

        // display results
        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Product is %d\n", product);
        System.out.printf("Difference is %d\n", difference);
        System.out.printf("Quotient is %.3f\n", quotient);

    }	// end method main

}   // end class