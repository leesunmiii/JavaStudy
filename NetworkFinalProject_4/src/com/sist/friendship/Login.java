package com.sist.friendship;
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame{ // JFrame = 단독으로 띄운다는 뜻
	JLabel la1,la2,la3;
	JTextField tf1;
	JTextField tf2;
	JRadioButton rb1, rb2;
	JButton b1,b2;
	
	public Login()
	{
		la1=new JLabel("아이디"); // <label>
		la2=new JLabel("이름");
		la3=new JLabel("성별");
		
		tf1=new JTextField(); // <input type=text>
		tf2=new JTextField();
		
		rb1=new JRadioButton("남자");// <input type=radio>
		rb2=new JRadioButton("여자");
		rb1.setSelected(true);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2); // 그룹 => html에서 그룹 설정을 한다 그룹만 가능, 배치는 불가능
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		JPanel p=new JPanel(); //데이터를 묶을 땐 패널 이용
		p.add(b1);
		p.add(b2);
		////////////////////여기까지 멤버변수의 초기화한 것
		
		// 배치
		setLayout(null); // JFrame => BorderLayout, BorderLayout을 쓰지않고 우리가 직접 배치하려면 null값을 입력하면 됨
		// 사용자 지정, 사용자 배치 => <link href="a.css">
		
		la1.setBounds(10, 15, 60, 30);
		tf1.setBounds(75, 15, 150, 30);
		
		la2.setBounds(10, 50, 60, 30);
		tf2.setBounds(75, 50, 150, 30);
		
		la3.setBounds(10, 85, 60, 30);
		rb1.setBounds(75, 85, 70, 30);
		rb2.setBounds(150, 85, 70, 30);
		
		p.setBounds(10, 125, 215, 35);
		
		//추가
		add(la1); add(tf1);
		add(la2); add(tf2);
		add(la3); add(rb1); add(rb2);
		add(p);
		
		setSize(255,200);
		setVisible(true);
		
	}
	/*public static void main(String[] args) {
		new Login();*/
	}
	

