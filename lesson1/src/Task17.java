import java.util.Scanner;

public class Task17 {
    // main method
    public static void main(String[] args) {
        // Scanner to obtain data
        Scanner scann = new Scanner(System.in);
        double total = 0.0; //total miles/gallons
        int entries = 1;    //control

        // start while cicle for data input
        while (entries != 0) {
            System.out.println("Enter your data:");

            // input miles
            System.out.print("Miles: ");
            int miles = scann.nextInt();

            //input gallons
            System.out.print("Gallons: ");
            int gallons = scann.nextInt();

            //calculate and output miles/gallons
            double miles_p_gallons = (double) miles / (double) gallons;
            System.out.printf("Current miles/gallons: %f\n", miles_p_gallons);

            //calculate and output total miles/gallons
            total += miles_p_gallons;
            System.out.printf("Total miles/gallons: %f\n", total);

            //question if driver want to input more data
            System.out.println("More data?");
            System.out.println("Input 1 if yes, or 0 if no");
            entries = scann.nextInt();

        }   //end while cicle

    }    // end method main

}   // end class