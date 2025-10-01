/*
Write a program that creates a user interface to perform integer divisions. The user enters two
numbers in the text fields, Number1 and Number2. The division of Number1 and Number2 is
displayed in the Result field when the Divide button is clicked. If Number1 or Number2 were
not an integer, the program would throw a NumberFormatException. If Number2 were Zero,
the program would throw an Arithmetic Exception Display the exception in a message
dialog box.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ZeroException extends Exception {
	ZeroException(){
		System.out.println("Number 2 cannot be Zero");
	}
}

class slip30_2 extends JFrame implements ActionListener {

	JTextField t1,t2,r1;
	JButton b1;

	slip30_2(){
		setLayout(new FlowLayout());
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		r1 = new JTextField(10);
		b1 = new JButton("Divide");
		b1.addActionListener(this);
		add(t1);
		add(t2);
		add(r1);
		add(b1);
		setVisible(true);
		setSize(200,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == "Divide"){
			try {
				int num1 = Integer.parseInt(t1.getText());
				int num2 = Integer.parseInt(t2.getText());
				
				if(num2 == 0)
						throw new ZeroException();
						
				r1.setText(Integer.toString(num1 / num2));
			} catch (ZeroException ze){
						System.out.println("Zero exception occured");	
			} catch (NumberFormatException ne){
				System.out.println("Number exception occured");				
			}
		}
	}

	public static void main(String args[]){
		new slip30_2();
	}
}
