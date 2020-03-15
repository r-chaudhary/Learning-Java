/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to Read a File. 
 */

import java.io.*;

public class FileRead {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("TextFile.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null) {
                System.out.println(s);
        }
        fr.close();
    }
}

// Output
// Hello
// My name is Rahul
// I'm Learning Java
// Cool