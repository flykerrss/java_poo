import java.util.Scanner;

public class Task8 {

    //initialize variables
    private static final double standardFee = 2.00; //minimum fee (for 3 hours)
    private static final double hourFee = 0.50; //fee for each number of hours greater than 3
    private static final double maximumFee = 10.00; //maximum fee for 24hours
    private static double totalCharges = 0.0f; //total charges for the day

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //scanner for data reading

        double time;     //variable for time

        do {
            System.out.print("Enter number of hours: ");    //prompt
            time = scanner.nextInt();
            if (time > 0)     //check if number of hours is greater than 0
                System.out.printf("Charges: $%.2f%n", calculatecharges(time));  //output charges

        } while (time != 0);    //end of do-while cicle
        System.out.printf("Total charges for the day: $%.2f%n", totalCharges);  //output total charges

    }

    //calculate charges method
    public static double calculatecharges(double time) {
        if (time > 3.0) {   //check if number of hours is greater than 3
            double fee = standardFee + (hourFee * (time - 3));    //calculate fee

            totalCharges += Math.min(fee, maximumFee);  //calculate totalCharges
            return Math.min(fee, maximumFee);   //return fee from current car
        } else {    //else instructions
            totalCharges += standardFee; //calculate total charges
            return standardFee;      //return minimum fee
        }
    }   //end of main method
}
