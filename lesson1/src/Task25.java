import java.util.Scanner;

public class Task25 {
    //main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //new scanner for data reading
        System.out.print("Enter a number: ");     //prompt
        int number = scanner.nextInt();     //initialize number variable

        if (number % 2 == 0) //check if number is Even
            System.out.println("Even number"); //prompt for Even number
        else
            System.out.println("Odd number"); //else prompt for Odd number
    }//end main method
}
