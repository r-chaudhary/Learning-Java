/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to Implement Single Level Inheritance. 
 */

import java.util.Scanner;

class Room {
    int length, breadth;
    Room(int x,int y) {
            length = x;
            breadth = y;
    }
    int area() {
            return length*breadth ;
    }
}
class Bedroom extends Room {
    int height;
    Bedroom(int x,int y,int z) {
            super(x,y);
            height = z;
    }
    int volume() {
            return length*breadth*height;
    }
}
class SingleLevelInheritance {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length ,breadth, height: ");
        int len = sc.nextInt();
        int bre = sc.nextInt();
        int hei = sc.nextInt();
        Bedroom room=new Bedroom(len,bre,hei);
        int area = room.area();
        int volume = room.volume();
        System.out.println("Area of room: "+area);
        System.out.println("Volume of room: "+volume);
    }
}

// Output
// Enter length ,breadth, height: 10
// 20
// 30
// Area of room: 200
// Volume of room: 6000