package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double rad = input.nextDouble();
        // part1 double area = Math.PI * rad * rad;
        // part2
        double area = Circle.getArea(rad);

        System.out.println("The area of a circle of radius " + rad + " is: " + area);
    }
}
