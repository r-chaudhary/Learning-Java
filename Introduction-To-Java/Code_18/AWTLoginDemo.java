/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to design an AWT program to demonstrate Login Application.
 */

import java.awt.*;
import java.awt.event.*;

public class AWTLoginDemo extends Frame implements ActionListener	{
    TextField nameField,passField,resultField;
    Label lab1,lab2,lab3;
    Button b1,b2;
    public AWTLoginDemo() {
        setLayout(new GridLayout(4,2));
        setBackground(Color.green);
        nameField=new TextField(15);
        passField=new TextField(15);
        resultField=new TextField(15);
        b1=new Button("Result");
        b2=new Button("Clear");
        lab1=new Label("Enter user name");
        lab2=new Label("Enter password");
        lab3=new Label("Display Result");
        passField.addActionListener(this);
        passField.setEchoChar('*');
        resultField.setEditable(false);
        add(lab1);
        add(nameField);
        add(lab2);
        add(passField);
        add(lab3);
        add(resultField);
        add(b1);
        add(b2);
        setTitle("user name & password validation");
        setSize(300,300);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }	
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b1)) {
                String str1=nameField.getText();
                String str2=passField.getText();
                if(str1.equals("Rahul") && str2.equals("rahul.cool"))	{
                    resultField.setText("VALID");
                }
                else {
                    resultField.setText("INVALID, TRY AGAIN");
                }
        }
        if(e.getSource()==b2) {
            nameField.setText("");
            passField.setText("");
            resultField.setText("");
        }
    }
    public static void main(String args[]) {
            new AWTLoginDemo();
    }
}