import java.util.Scanner;

public class Task14 {
    //main method
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);     //new scanner

        //some arrays for test
        System.out.printf("%d%n", Product(2, 4, 3, 5));
        System.out.printf("%d%n", Product(2, 4, 3, 5, 3));
        System.out.printf("%d%n", Product(2, 4, 3, 5, 1, 1, 2));
    }

    //Product method
    public static int Product(int... tmpArray) {     //we use (...) because the arrays have different length
        int product = 1;        //product variable initialisation
        for (int value : tmpArray) {
            product *= value;   //product formula
        }
        return product;     //return product value
    }
}