import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElimination {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //new scanner
        String[] names = new String[10];        //declare new array with 10 elements

        //cycle for add names in array
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter First Name: ");
            names[i] = input.nextLine();
        }

        //initialize list with array's elements
        List<String> list = Arrays.asList(names);

        System.out.print("Initial list: ");   //prompt
        System.out.print(list);                 //display list
        System.out.println();


        System.out.print("List with removed duplicates: ");   //prompt

        //calling removeDuplicates method
        removeDuplicates(list);

        searchForName(list);

    }   //end main method

    //method removeDuplicates
    private static void removeDuplicates(Collection<String> values) {

        //create a HashSet
        Set<String> set = new HashSet<>(values);

        //display list without duplicates
        for (String value : set) {
            System.out.printf("%s ", value);
        }

        System.out.println();

    }

    //method searchForName
    public static void searchForName(Collection<String> names) {

        String someName;    //declare new variable for search name

        //create HashSet
        Set<String> set = new HashSet<>(names);
        Scanner input = new Scanner(System.in);         //new scanner

        System.out.println("Input the name for search: ");       //prompt
        someName = input.nextLine();                        //read the name


        //check if set contain or not the name
        if (set.contains(someName)) {
            System.out.println("Set contains name: " + someName);   //prompt
        } else {
            System.out.println("Set doesn't contain this name: " + someName);   //prompt
        }
    }
}