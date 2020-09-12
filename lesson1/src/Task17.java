import java.util.Scanner;
public class Task17
{
    // main method
    public static void main(String[] args)
    {
        // Scanner to obtain integers
        Scanner input=new Scanner(System.in);

        // Variables
        int num1;	// first number
        int num2;	// second number
        int num3;   //third number
        int sum;	// sum of numbers
        int product;	// product of numbers
        int difference;	// difference of numbers
        int average;	// average of numbers
        int smallest;   //smallest number
        int largest;    //largest number

        System.out.print("Enter first number: ");
        num1 = input.nextInt();	// first number input

        smallest = num1;
        largest = num1;

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();	// second number input

        if(num1 > num2) {
            smallest = num2;
            largest = num1;
        }

        System.out.print("Enter third integer: ");
        num3 = input.nextInt();	// third number input

        if(smallest > num3)
            smallest = num3;

        if(largest < num3)
            largest = num3;

        sum	= num1 + num2 + num3;	// sum numbers
        product	= num1 * num2 * num3;	// multiply numbers
        difference = num1 - num2 - num3;	// difference of numbers
        average = (num1 + num2 + num3) / 3;	// divide numbers

        // display results
        System.out.printf("Sum is %d\n", sum);
        System.out.printf("Product is %d\n", product);
        System.out.printf("Difference is %d\n", difference);
        System.out.printf("Average is %d\n", average);
        System.out.printf("Smallest is %d\n", smallest);
        System.out.printf("Largest is %d\n", largest);

    }	// end method main

}   // end class