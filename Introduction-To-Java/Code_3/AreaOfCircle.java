/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to calculate Area and Perimeter of a Circle. 
 */

import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI*(radius*radius);
        System.out.println("Area of circle is: "+area);
        double circumference = 2*Math.PI*radius;
        System.out.println("Circumference is: "+circumference);
    }
}

// Output
// Enter radius: 50
// Area of circle is: 7853.981633974483
// Circumference is: 314.1592653589793