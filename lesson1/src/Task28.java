import java.util.Scanner;

public class Task28 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //new scanner for data reading

        System.out.print("Enter radius of circle: ");    //prompt
        int radius = scanner.nextInt(); //initialize radius
        int diameter;   //declare diameter variable
        double circumference; //declare circumference variable
        double area;     //declare area variable
        double pi = 3.14159; //initialize pi variable

        diameter = 2 * radius;          //calculate diameter
        circumference = 2 * pi * radius;    //calculate circumference
        area = pi * radius * radius;        //calculate area

        System.out.println("Diameter: " + diameter);        //output result for diameter
        System.out.println("Circumference: " + circumference);  //output result for circumference
        System.out.println("Area: " + area);        //output result for area

    }   //end main method
}
