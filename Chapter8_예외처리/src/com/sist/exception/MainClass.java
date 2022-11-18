package com.sist.exception;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainClass extends JFrame implements ActionListener{

	private JTextArea ta; //포함클래스 (클래스 안에 다른 클래스를 포함)
	private JTextField tf;
	private JButton b1,b2;
	private int[] com=new int[3];
	private int[] user=new int[3];
	private int s,b;
	//시작과 동시에 배치
	public MainClass() {
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField(10);
		b1=new JButton("Start");
		b2=new JButton("Exit");
		add("Center",js);
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		add("South",p);
		
		//크기
		setSize(450,420);
		setVisible(true);
		
		//이벤트 등록
		b1.addActionListener(this);//버튼 클릭 ==>시스템에 의해서 자동 호출 (callback 함수)
		tf.addActionListener(this);//입력창 엔터
	}
	
	public void getRand() {
		for(int i=0;i<3;i++) {
			com[i]=(int)(Math.random()*9)+1; //1~9
			for(int j=0;j<i;j++) {
				if(com[j]==com[i]) {
					i--;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			getRand();
			JOptionPane.showMessageDialog(this, "게임 시작");
		}
		else if(e.getSource()==tf) {
			//입력한 값을 읽어온다
			String input=tf.getText();
			//정수형으로 변경
			try {
				int m=Integer.parseInt(input);
			}catch(Exception ex) {
				//복구
				JOptionPane.showMessageDialog(this, "세자리 정수만 입력하시오");
				tf.setText("");
				tf.requestFocus();
				return;
			}
		}
	}

}
