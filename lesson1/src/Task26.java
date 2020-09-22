import java.util.Scanner;

public class Task26 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //new scanner for data reading

        System.out.print("Enter first number: ");   //prompt
        int number1 = scanner.nextInt();    //initialize first number
        System.out.print("Enter second number: ");  //prompt
        int number2 = scanner.nextInt();    //initialize second number

        if (number2 % number1 == 0)  //check if first number is a multiple of second
            System.out.println("First number is a multiple of second"); //prompt for true
        else
            System.out.println("First number isn't a multiple of second");  //prompt for else

    } //end main method
}
