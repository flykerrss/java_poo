import java.util.Scanner;

public class Task28 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //new scanner for data reading

        System.out.print("Enter radius of circle: ");    //prompt
        int radius = scanner.nextInt(); //initialize radius
        double pi = 3.14159; //initialize pi variable

        System.out.println("Diameter: " + 2 * radius);        //output result for diameter
        System.out.println("Circumference: " + 2 * pi * radius);  //output result for circumference
        System.out.println("Area: " + pi * radius * radius);        //output result for area

    }   //end main method
}
