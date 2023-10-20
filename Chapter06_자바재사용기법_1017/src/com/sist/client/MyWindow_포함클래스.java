package com.sist.client;
import javax.swing.*;
// 포함 클래스
public class MyWindow_포함클래스 {
	JFrame fr=new JFrame(); // 캡슐화(x)
	public MyWindow_포함클래스()
	{
		fr.setSize(800, 600);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyWindow_포함클래스();
	}

}
