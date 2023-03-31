package org.launchcode.java.studios.countingcharacters;
import java.util.*;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> finished = new HashMap<>();
        ArrayList<Character> chr = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to " +
                "be zero to start with. So if you move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";

        System.out.println("Would you like to enter your own string yes or no?");
        String maybe = input.nextLine();
        System.out.println(maybe);
        if (Objects.equals(maybe, "yes")) {
            System.out.println("Enter your string:");
            quote = input.nextLine();
        }
        char[] charactersInString = filter(quote).toLowerCase().toCharArray();
        Arrays.sort(charactersInString);

        for (char c : charactersInString) {
            int spot = chr.indexOf(c);
            int count = 0;
            if (!chr.contains(c)) {
                chr.add(c);
                num.add(1);
            } else {
                count = num.get(spot) + 1;
                num.set(spot, count);
            }
        }

        for (int i=0; i < chr.size(); i++) {
            finished.put(chr.get(i), num.get(i));
        }

        System.out.println(finished);

    }
    public static String filter(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^A-Za-z0-9]", "");
    }
}
