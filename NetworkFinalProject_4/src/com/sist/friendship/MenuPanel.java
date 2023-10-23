package com.sist.friendship;
//Home : 맛집 카테고리
//검색
//채팅
//오늘의 뉴스
//커뮤니티 => 파일 입출력
import javax.swing.*;
import java.awt.*;
public class MenuPanel extends JPanel {
	public JButton b1,b2,b3,b4,b5,b6;
	public MenuPanel()
	{
		b1=new JButton("HOME");
		b2=new JButton("맛집 검색");
		b3=new JButton("실시간 채팅");
		b4=new JButton("커뮤니티");
		b5=new JButton("뉴스 검색");
		b6=new JButton("종료");
		
		setLayout(new GridLayout(6, 1,5,5)); //앞에 숫자 두 개는 5줄에 버튼 1개씩 배치한다는뜻 //뒤에 숫자 두 개는 버튼들 사이 간격 
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
	}

}
