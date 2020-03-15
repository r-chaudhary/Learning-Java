/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to Write a File. 
 */
import java.util.Scanner;
import java.io.*;

public class FileWrite {
    public static void main(String args[]) throws IOException {
        String s1,s2,s3;
        Scanner st=new Scanner(System.in);
        System.out.print("Enter Name:");
        s1=st.nextLine();
        System.out.print("Enter Phone:");
        s2=st.nextLine();
        System.out.print("Enter Address:");
        s3=st.nextLine();
        OutputStream fos = new FileOutputStream("FileWrite.txt");
        byte b1[]=s1.getBytes();
        fos.write(b1);
        System.out.println();
        byte b2[]=s2.getBytes();
        fos.write(b2);
        System.out.println();
        byte b3[]=s3.getBytes();
        fos.write(b3);
        System.out.println();
        fos.close();
        System.out.println("File Created");
    }
}

// Output
// Enter Name:Rahul
// Enter Phone:987456321
// Enter Address:ABCD



// File Created