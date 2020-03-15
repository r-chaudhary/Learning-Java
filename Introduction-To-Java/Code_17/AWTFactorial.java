/*
 * Author : Rahul Chaudhary
 * Email : r.chaudhary@outlook.in
 * 
 * File Description:
 *      Java program to design an AWT program to point factorial for an input value.
 */

import java.awt.*;
import java.awt.event.*;

public class AWTFactorial extends Frame implements ActionListener	{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2;
    public AWTFactorial() {
        t1=new TextField(3);
        t2=new TextField(10);
        b1=new Button("Factorial");
        b2=new Button("Clear");
        l1=new Label("Enter number:");
        l2=new Label("Result");
        setLayout(new GridLayout(3,2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        setSize(200,200);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                        System.exit(0);
                }
        });
    }
	
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            long num,fact,i;
            String result;
            fact=1;
            num=Integer.parseInt(t1.getText());
            for(i=1;i<=num;i++) {
                    fact=fact*i;
            }
            result=String.valueOf(fact);
            t2.setText(result);
        }
        else {
            t1.setText("");
            t2.setText("");
        }
    }
    public static void main(String[] args) {
		new AWTFactorial();
    }
}
