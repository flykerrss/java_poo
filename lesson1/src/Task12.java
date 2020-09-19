import java.util.Scanner;

public class Task12 {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner for data reading

        int array[] = {0, 0, 0, 0, 0};  //initialize array

        for (int i = 0; i < 5; i++) {       //cycle for numbers reading
            System.out.print("Enter number: ");     //prompt
            int num = scanner.nextInt();
            boolean Founded = false;    //boolean variable for founded duplicates
            int j = 0;      //initialize j

            while (array[j] != 0) {     //while cycle for array and number comparison
                if (array[j] == num) {      //check if number is duplicate
                    Founded = true;     //set founded as true if it is duplicate
                }
                j++;        //increment j
            }

            if (Founded == true) {      //check if founded variable is true
                System.out.println("Duplicate");        //prompt
                for (int k = 0; k < 5; k++)         //output our array without duplicate
                    if (array[k] != 0)
                        System.out.print(array[k] + " ");
            } else {        //in case of non duplicate
                array[j] = num;     //add number in array
                for (int k = 0; k < 5; k++)     //output array with new number
                    if (array[k] != 0)
                        System.out.print(array[k] + " ");
            }
            System.out.println();
        }
    }
}
