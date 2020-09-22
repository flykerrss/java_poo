import java.util.Scanner;

public class Task33 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //new scanner for data reading

        System.out.print("Enter your weight in kg: ");  //prompt
        double weight = scanner.nextDouble();   //initialize weight variable
        System.out.print("Enter your height in meters: ");  //prompt
        double height = scanner.nextDouble();   //initialize height variable

        double BMI = weight/(height*height);    //calculate BMI index

        System.out.println("Usser BMI - " + BMI);   //print user BMI
        //print BMI VALUES
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
    }   //end main method
}
