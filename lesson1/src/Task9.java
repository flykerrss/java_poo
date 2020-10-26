import java.util.*;

public class Task9 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //create new scanner
        System.out.println("Input a sentence:");    //prompt
        String[] tokens = scanner.nextLine().split(" ");    //split sentence in words
        int Len = tokens.length;  //variable Len with value numbers of words

        for (int i = Len - 1; i >= 0; i--)  //cycle for reverse words
            System.out.print(tokens[i] + " ");  //display words
    }
}