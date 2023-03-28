package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad = 0;

        do {
            System.out.println("Enter a radius: ");
            if (input.hasNextDouble()) {
                rad = input.nextDouble();
            } else {
                System.out.println("ERROR!!!!");
                java.lang.System.exit(0);
            }
        } while (rad <= 0);
        // part1 double area = Math.PI * rad * rad;
        // part2
        double area = Circle.getArea(rad);

        System.out.println("The area of a circle of radius " + rad + " is: " + area);
    }
}
