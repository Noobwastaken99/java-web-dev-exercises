package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator flavorComparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();
        flavors.sort(flavorComparator);
        cones.sort(coneComparator);

        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        System.out.println("----------------------------");

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        for(Cone cone : cones) {
            System.out.println(cone.getName()+": "+cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
