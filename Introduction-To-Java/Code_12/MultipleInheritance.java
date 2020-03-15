/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to Implement Multiple Inheritance.
 */

import java.util.Scanner;

interface StudentInfo {
    void getDetail();
}
interface Marks {
    int sportswt = 50;
    void getMarks();
}
class Student implements StudentInfo, Marks {
    String name;
    int rollno, python, java, maths, total;
    Scanner sc = new Scanner(System.in);
    public void getDetail() {
        System.out.print("Enter Student Name : ");
        name = sc.nextLine();
        System.out.print("Enter Student Rollno : ");
        rollno = sc.nextInt();
    }
    public void getMarks() {
        System.out.println("---- Enter Marks ----");
        System.out.print("Enter Java Marks : ");
        java = sc.nextInt();
        System.out.print("Enter Pyhton Marks : ");
        python = sc.nextInt();
        System.out.print("Enter Maths Marks : ");
        maths = sc.nextInt();
    }
    void display() {
        total += java + maths + python + sportswt;
        System.out.println("---- Display Result ----");
        System.out.println("Student Name : "+name);
        System.out.println("Student Rollno : "+rollno);
        System.out.println("Average Marks : "+(total/4));
    }
}
public class MultipleInheritance {
   public static void main(String args[]) {
      Student stu = new Student();
      stu.getDetail();
      stu.getMarks();
      stu.display();
   }
}

// Output
// Enter Student Name : Rahul
// Enter Student Rollno : 19
// ---- Enter Marks ----
// Enter Java Marks : 99
// Enter Pyhton Marks : 99
// Enter Maths Marks : 99
// ---- Display Result ----
// Student Name : Rahul
// Student Rollno : 19
// Average Marks : 86