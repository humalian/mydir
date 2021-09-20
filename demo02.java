package 第二章编程练习题;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius*radius*Math.PI;
        double volume = area*length;
        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", volume);
    }
}
