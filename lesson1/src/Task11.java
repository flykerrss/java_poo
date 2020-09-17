import java.util.Scanner;

public class Task11 {

    // main method
    public static void main(String[] args) {
        int NumofValues;    //variable for number of values
        Scanner scanner = new Scanner(System.in);   //scanner for input values

        System.out.print("Enter number of values: ");   //prompt
        NumofValues = scanner.nextInt();    //read value from user
        int Minimum = NumofValues;  //initialize variable for minimum value

        //cicle to find the minimum
        for (int i = 0; i < NumofValues; i++) {
            int Value = scanner.nextInt();  //read values from user
            if (Value < Minimum)       //check if entered value is smaller
                Minimum = Value;        //write the minimum value in Minimum variable
        }

        System.out.println("Minimum value is: " + Minimum); //prompt

    }

}
