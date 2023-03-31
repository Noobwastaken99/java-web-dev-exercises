package org.launchcode.java.studios.countingcharacters;
import java.io.IOException;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;

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
        Path fileName = Path.of("/Users/estherwingate/Desktop/GitHub/Java-practice/java-web-dev-exercises/text.rtf");

        System.out.println("Would you like to enter your own string? yes or no");
        String maybe = input.nextLine();
        if (Objects.equals(maybe, "yes")) {
            System.out.println("Enter your string:");
            quote = input.nextLine();
        } else {
            System.out.println("Would you like to file? yes or no");
            maybe = input.nextLine();
            if (Objects.equals(maybe, "yes")) {
                System.out.println("Enter your string:");
                try {
                    quote = Files.readString(fileName);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        char[] charactersInString = filter(quote).toLowerCase().toCharArray();
        Arrays.sort(charactersInString);

        for (char c : charactersInString) {
            int spot = chr.indexOf(c);
            int count;
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

        for(Map.Entry<Character, Integer> entry : finished.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        //System.out.println(finished);

    }
    public static String filter(String s) {
        if (s == null) {
            return null;
        }
        return s.replaceAll("[^A-Za-z0-9]", "");
    }
}
