package exercises;
import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String trip = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
                "\nnothing to do: once or twice she had peeped into the book her sister was reading, but it had no " +
                "\npictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "\nor conversation?'";

        System.out.println(trip + "\n\nWhat is a word in the first sentence of Alice’s Adventures in Wonderland?");
        String word = input.nextLine();

        trip = trip.toLowerCase();
        word = word.toLowerCase();

        System.out.println(trip.contains(word));
        //Part 5
        Integer index = trip.indexOf(word);
        Integer length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedTrip = trip.replace(word, "");
        System.out.println(modifiedTrip);
    }
}
