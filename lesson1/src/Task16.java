import java.util.Scanner;

public class Task16 {
    //main method
    public static void main(String[] args) {
        //new scanner
        Scanner scanner = new Scanner(System.in);

        //initialize variables
        System.out.print("Enter number 1: ");
        int Num1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int Num2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int Num3 = scanner.nextInt();
        System.out.print("Enter number 4: ");
        int Num4 = scanner.nextInt();
        System.out.print("Enter number 5: ");
        int Num5 = scanner.nextInt();

        //cicles for output
        for (int i = 0; i < Num1; i++)
            System.out.print("*");
        System.out.println();
        for (int i = 0; i < Num2; i++)
            System.out.print("*");
        System.out.println();
        for (int i = 0; i < Num3; i++)
            System.out.print("*");
        System.out.println();
        for (int i = 0; i < Num4; i++)
            System.out.print("*");
        System.out.println();
        for (int i = 0; i < Num5; i++)
            System.out.print("*");
        System.out.println();
    }
}
