import java.util.Scanner;

public class Task32 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //new scanner for data reading
        int negative = 0, zero = 0, positive = 0;   //initialize counter variables
        for (int i = 0; i < 5; i++) {       //for cycle for data reading and checking
            System.out.print("Enter number: ");     //prompt
            int number = scanner.nextInt();     //variable for numbers
            if (number == 0)    //check if number is equal with 0
                zero++;     //increment zero counter
            else if (number < 0)    //check if number < 0
                negative++;     //increment negative counter
            else positive++;    //else increment positive counter
        }
        //print results

        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
        System.out.println("Positive: " + positive);
    }
}
