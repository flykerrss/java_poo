import java.util.Scanner;
public class Task30 {
    //main method
    public static void main(String[] args) {
        //new scanner for data reading
        Scanner scanner = new Scanner(System.in);
        //initialize variables
        int d1, d2, d3, d4, d5;
        int number;
        //prompt
        System.out.println("Enter a five-digit number:");

        //read number
        number = scanner.nextInt();

        //make changes
        d1 = number / 10000;
        number = number % 10000;
        d2 = number / 1000;
        number = number % 1000;
        d3 = number / 100;
        number = number % 100;
        d4 = number / 10;
        number = number % 10;
        d5 = number;
        //output result
        System.out.printf("%d   %d   %d   %d   %d", d1, d2, d3, d4, d5);
    }
}
