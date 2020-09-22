import java.util.Scanner;

public class Task24 {
    //main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   //new scanner for data reading

        System.out.print("Enter a number: ");   //prompt
        int number = scanner.nextInt();     //initialize variable number and read first number

        int maximum = number;       //initialize maximum
        int minimum = number;       //initialize minimum

        for (int i = 0; i < 4; i++) {       //for cycle for data reading and min/max checking
            System.out.print("Enter next number: ");    //prompt
            number = scanner.nextInt(); //read new

            if (number < minimum)   //check if entered number is smaller than minimum
                minimum = number;   //in case of true, minimum = new number

            if (number > maximum)   //check if entered number is bigger than maximum
                maximum = number;   //in case of true, maximum = new number
        }

        System.out.println("Minimum number: " + minimum);   //output result for minimum
        System.out.println("Maximum number: " + maximum);    //output result for maximum
    } //end main method
}
