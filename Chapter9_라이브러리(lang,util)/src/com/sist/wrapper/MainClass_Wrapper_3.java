package com.sist.wrapper;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainClass_Wrapper_3 extends JFrame implements ActionListener{

	JTextField tf1,tf2;
	Button b;
	public MainClass_Wrapper_3() {
		tf1=new JTextField(10);
		tf2=new JTextField(10);
		b=new Button("결과");
		JPanel p=new JPanel();
		p.add(tf1);
		p.add(tf2);
		p.add(b);
		add("Center",p);
		
		setSize(300,200);
		setVisible(true);
		
		b.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass_Wrapper_3();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			String num1=tf1.getText();
			String num2=tf2.getText();
			JOptionPane.showMessageDialog(this, "계산 결과 : "+(Integer.parseInt(num1)+Integer.parseInt(num2)));
		}
		
	}

}
