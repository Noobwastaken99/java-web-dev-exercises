package org.launchcode.java.studios.countingcharacters;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer max = 30;
        HashMap<String, Integer> finished = new HashMap<>();
        ArrayList<Character> chr = new ArrayList<>();
        int[] num = new int[max];

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to " +
                "be zero to start with. So if you move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
                "it’s pretty straightforward from there.";
        char[] charactersInString = quote.toLowerCase().toCharArray();

        //hashmap to store char and num of mentions
        //maybe array lists for char and int

        for (char c : charactersInString) {
            //System.out.println(c);
            //int spot = chr.indexOf(c);
            //int count = 0;
            if (!chr.contains(c)) {
                chr.add(c);
                num[chr.indexOf(c)] = 1;
                //count += 1;
            } else {
//                System.out.println(chr.indexOf(c));
//                num[chr.indexOf(c)] += 1;
            }
        }
        System.out.println(chr);
        System.out.println(num);

        for (int i=0; i < chr.size(); i++) {
            String[] chrArray = new String[chr.size()];
            //chr.toArray(chrArray); issue
            //finished.put(chrArray[i], num[i]);
        }

        //System.out.println(finished);
    }
}
