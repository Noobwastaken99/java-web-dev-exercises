package exercises;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(list));

        ArrayList<String> words = new ArrayList<>(Arrays.asList("fives", "four", "two", "one", "MO", "A"));
        System.out.println("\n\nWhat is the length of word you want printed out?\nEnter 1-5: ");
        Integer num = input.nextInt();
        printFive(words, num);
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void printFive(ArrayList<String> arr, Integer length) {
        for (String w : arr) {
            if (w.length() == length) {
                System.out.println(w);
            }
        }
    }
}
