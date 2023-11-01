package com.sist.client;
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;
import java.awt.*;
import java.util.*;
import com.sist.vo.*;
import com.sist.common.ImageChange;
import com.sist.manager.*;
public class FoodDetailPanel extends JPanel implements ActionListener{
      JLabel posterLa;
      JLabel titleLa,scoreLa;
      JLabel addressLa,phoneLa,typeLa;
      JLabel timeLa,parkingLa,priceLa;
      JLabel menuLa;
      JButton b;
      ControllPanel cp;
      JLabel la1,la2,la3,la4,la5,la6,la7;
      
      public FoodDetailPanel(ControllPanel cp)
      {
    	  this.cp=cp;
    	  posterLa=new JLabel();
    	  titleLa=new JLabel();
    	  scoreLa=new JLabel();
    	  addressLa=new JLabel();
    	  phoneLa=new JLabel();
    	  typeLa=new JLabel();
    	  timeLa=new JLabel();
    	  parkingLa=new JLabel();
    	  priceLa=new JLabel();
    	  menuLa=new JLabel();
    	  
    	  b=new JButton("목록");
    	  la1=new JLabel("주소");
    	  la2=new JLabel("전화");
    	  la3=new JLabel("음식종류");
    	  la4=new JLabel("가격대");
    	  la5=new JLabel("주차");
    	  la6=new JLabel("영업시간");
    	  la7=new JLabel("메뉴");
    	  
    	  // 배치 
    	  setLayout(null);
    	  posterLa.setBounds(10, 15, 300, 375);
    	  add(posterLa);
    	  
    	  titleLa.setBounds(320, 15, 300, 35);
    	  scoreLa.setBounds(630, 15, 40, 35);
    	  
    	  add(titleLa);add(scoreLa);
    	  
    	  la1.setBounds(320, 60, 70, 35);
    	  addressLa.setBounds(395, 60, 400, 35);
    	  add(la1);add(addressLa);
    	  // 전화
    	  la2.setBounds(320, 100, 70, 35);
    	  phoneLa.setBounds(395, 100, 400, 35);
    	  add(la2);add(phoneLa);
    	  
    	  la3.setBounds(320, 140, 70, 35);
    	  typeLa.setBounds(395, 140, 400, 35);
    	  add(la3);add(typeLa);
    	  
    	  la4.setBounds(320, 180, 70, 35);
    	  priceLa.setBounds(395, 180, 400, 35);
    	  add(la4);add(priceLa);
    	  
    	  la5.setBounds(320, 220, 70, 35);
    	  parkingLa.setBounds(395, 220, 400, 35);
    	  add(la5);add(parkingLa);
    	  
    	  la6.setBounds(320, 260, 70, 35);
    	  timeLa.setBounds(395,260, 400, 35);
    	  add(la6);add(timeLa);
    	  
    	  la7.setBounds(320, 300, 70, 35);
    	  menuLa.setBounds(395, 300, 400, 35);
    	  add(la7);add(menuLa);
    	  
    	  b.setBounds(320, 340, 100, 35);
    	  add(b);
    	  
    	  b.addActionListener(this);
    	  
      }
      public void foodPrint(FoodHouseVO vo)
      {
    	  try
    	  {
    		  titleLa.setText("<html><h1><font color=\"blue\">"+vo.getTitle()+"</font></h1></html>");
    		  scoreLa.setText("<html><h1><font color=\"orange\">"+String.valueOf(vo.getTitle_explain())+"</font></h1></html>");
    		  priceLa.setText(vo.getPrice());
    		  phoneLa.setText(vo.getExplain());
    		  
    	
    		  
    		  URL url=new URL(vo.getPoster());
    		  Image image=ImageChange.getImage(new ImageIcon(url), 300, 500);
    		  posterLa.setIcon(new ImageIcon(image));
    	  }catch(Exception ex) {}
      }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b)
		{
			cp.card.show(cp, "catefood");
		}
	}
      
      
}