import java.util.*;

public class Task7 {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        //create new scanner for sentence read
        System.out.println("Enter an English sentence to convert it into Pig-Latin:");  //prompt
        String[] tokens = scanner.nextLine().split(" ");    //split sentence in words

        //cycle for coding words
        for (String token : tokens)
            printPigLatinWord(token);
    }

    //printPigLatinWord method
    public static void printPigLatinWord(String S) {
        String Latin = S.substring(1);  //set word to start with letter index 1
        Latin += Character.toLowerCase(S.charAt(0)) + "ay ";    //add next letters and first with ay at end
        System.out.print(Latin);    //print word
    }
}