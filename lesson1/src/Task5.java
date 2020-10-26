import java.util.Random;

public class Task5 {
    //main method
    public static void main(String[] args) {
        Random rand = new Random();         //new object of Random class

        //declare string arrays
        String[] article = {"the", "a", "one", "some", "any"};      //articles
        String[] noun = {"boy", "girl", "dog", "town", "car"};      //nouns
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};    //verbs
        String[] preposition = {"to", "from", "over", "under", "on"};       //prepositions

        //cycle for sentences construction
        for (int i = 0; i < 20; i++) {
            int X = rand.nextInt(5);        //declare variable X with random index from arrays
            //declare Str variable in which we unify words
            String Str = Character.toUpperCase(article[X].charAt(0)) + article[X].substring(1);

            //section for sentences creation
            X = rand.nextInt(5);
            Str += " " + noun[X];
            X = rand.nextInt(5);
            Str += " " + verb[X];
            X = rand.nextInt(5);
            Str += " " + preposition[X];
            X = rand.nextInt(5);
            Str += " " + article[X];
            X = rand.nextInt(5);
            Str += " " + noun[X] + ".";
            System.out.println(Str);    //display sentence
        }
    }
}