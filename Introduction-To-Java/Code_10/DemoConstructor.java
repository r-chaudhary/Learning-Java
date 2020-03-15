/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java Program Design a Class that demonstrates the use of Constructor.
 */

import java.util.Scanner;

public class DemoConstructor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int len = sc.nextInt();
        System.out.print("Enter Breadth : ");
        int bre = sc.nextInt();
        Rectangle r = new Rectangle(len,bre);
        System.out.println("Area of Rectangle : "+r.rectArea());
    }
}
class Rectangle {
    int length, breadth;
    Rectangle(int x, int y){
        length = x;
        breadth = y;
    }
    int rectArea(){
        return length*breadth;
    }
}

// Output
// Enter Length : 5
// Enter Breadth : 5
// Area of Rectangle : 25