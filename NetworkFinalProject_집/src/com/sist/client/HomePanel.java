package com.sist.client;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sist.common.ImageChange;
import com.sist.manager.FoodManager;
import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;

public class HomePanel extends JPanel implements ActionListener{
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9; // 버튼 9개 추가
   PosterCard[] pcs=new PosterCard[12];
   FoodManager fm=new FoodManager();
   JPanel pan=new JPanel(); // 사진 들어가는 패널
   public HomePanel()
   {
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,9,10,10)); // p : 메뉴 들어가는 패널, 1열에 9개씩 간격은 10만큼
	   b1=new JButton("프리미엄보양죽");
	  // b1.setFont(new Font("SansSerif", Font.PLAIN, 12));
	   b1.setPreferredSize(new Dimension(300,45));
	   b2=new JButton("보양죽");
	   b2.setPreferredSize(new Dimension(300,45));
	   b3=new JButton("영양죽");
	   b3.setPreferredSize(new Dimension(300,45));
	   b4=new JButton("별미죽");
	   b4.setPreferredSize(new Dimension(300,45));
	   b5=new JButton("전통죽");
	   b5.setPreferredSize(new Dimension(300,45));
	   b6=new JButton("유아추천맞춤죽");
	   b6.setPreferredSize(new Dimension(300,45));
	   b7=new JButton("간편식");
	   b7.setPreferredSize(new Dimension(300,45));
	   b8=new JButton("반찬");
	   b8.setPreferredSize(new Dimension(300,45));
	   b9=new JButton("음료");
	   b9.setPreferredSize(new Dimension(300,45));
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9); // p에 메뉴추가
	   
	   pan.setLayout(new GridLayout(4,3,5,5)); // 사진 들어가는 패널
	   //pan.setBackground(Color.black);
	   // 배치 
	   setLayout(new BorderLayout());
	   add("North",p);
	   add("Center",pan);
	   
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   b4.addActionListener(this);
	   b5.addActionListener(this);
	   b6.addActionListener(this);
	   b7.addActionListener(this);
	   b8.addActionListener(this);
	   b9.addActionListener(this);
	   
   }
   public void cardPrint(ArrayList<FoodCategoryVO> list)
   {
	   int i=0;
	   for(FoodCategoryVO vo:list)
	   {
		  
		   pcs[i]=new PosterCard(vo);
		  
		  pan.add(pcs[i]); // ================================== 원본
		   i++;
	   }
	   
   }
   public void cardInit(ArrayList<FoodCategoryVO> list) // 초기화역할 => 화면의 상태를 초기상태로 리셋하기위해
   {
	   for(int i=0;i<list.size();i++)
	   {

		   pcs[i].poLa.setIcon(null);
		   pcs[i].tLa.setText("");
	   }
	   pan.removeAll();// 데이터 제거
	   pan.validate();// Panel 재배치 
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==b1)
		{
			ArrayList<FoodCategoryVO> list=fm.foodCategoryData(1);
//			FoodCategoryVO fvo=new FoodCategoryVO();
//			fvo.setPoster(null);
//			fvo.setTitle("fucking");
//			for(int j=0;j<1;j++)
//			{
//				   list.add(fvo);
//		    }
			cardInit(list);
			cardPrint(list);
			  
		}
		else if(e.getSource()==b2)
		{
			   ArrayList<FoodCategoryVO> list=fm.foodCategoryData(2);
			   FoodCategoryVO fvo=new FoodCategoryVO();
			   fvo.setPoster(null);
			   fvo.setTitle("fucking");
			   for(int j=0;j<6;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b3)
		{
			ArrayList<FoodCategoryVO> list=fm.foodCategoryData(3);
			cardInit(list);
			cardPrint(list);
		}
		
//		else if(e.getSource()==b3)
//		{
//			   ArrayList<FoodCategoryVO> list=fm.foodCategoryData(3);
//			   FoodCategoryVO fvo=new FoodCategoryVO();
//			   for(int j=0;j<12;j++)
//			   {
//				   list.add(fvo);
//			   }
//			cardInit(list);
//			cardPrint(list);
//		}
		
	
		
		else if(e.getSource()==b4)
		{
			   ArrayList<FoodCategoryVO> list=fm.foodCategoryData(4);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   
			   for(int j=0;j<5;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b5)
		{
			   ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(5);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   
			   for(int j=0;j<6;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b6)
		{
			   ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(6);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   
			   for(int j=0;j<4;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b7)
		{
			   ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(7);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   
			   for(int j=0;j<10;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b8)
		{
			   ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(8);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   
			   for(int j=0;j<10;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
		else if(e.getSource()==b9)
		{
			   ArrayList<FoodCategoryVO> list=
					fm.foodCategoryData(9);
			   
			   FoodCategoryVO fvo=
					   new FoodCategoryVO();
			   //fvo.setPoster("c:\\javaDev\\def.png");
			   
			   for(int j=0;j<7;j++)
			   {
				   list.add(fvo);
			   }
			cardInit(list);
			cardPrint(list);
		}
	}
	
	
//	public void foodPrint1(ArrayList<FoodHouseVO> list)
//    {
//		JTable table;
//	    DefaultTableModel model;
//	    String[] col={"","이미지","맛집정보"};
//   	 Object[][] row=new Object[0][3];
//	    model=new DefaultTableModel(row,col) {
//
//			@Override
//			public boolean isCellEditable(int row, int column) {
//				// TODO Auto-generated method stub
//				return false;
//				}
//			@Override
//			public Class<?> getColumnClass(int columnIndex) {
//				// TODO Auto-generated method stub
//				return getValueAt(0, columnIndex).getClass();
//			}
//	    };
//    }
//				
//public void foodPrint(ArrayList<FoodHouseVO> list)
//	{
//   	 try
//   	 {
//   		 for(int i=0;i<10;i++)
//   		 {
//   			 FoodHouseVO vo=list.get(i);
//   			 URL url=new URL(vo.getPoster());
//   			 Image image=ImageChange.getImage(new ImageIcon(url), 120, 150);
//   			 String data="<html>"+vo.getTitle()+"&nbsp;"
//   			            +"<span style=\"color:orange\">"
//   					    +vo.getTitle_explain()+"</span><br>"
//   					    +vo.getPrice()+"<br>"
//   					    +vo.getExplain()+"<br>"
//   					    +"</html>";
//   			 Object[] obj={vo.getCno(),new ImageIcon(image),data};
//   			 model.addRow(obj);
//   			 
//   		 }
//   	 }catch(Exception ex){ex.printStackTrace();}
//    }
//
//
//	public void mouseClicked(MouseEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource()==pan)
//		{
//			if(e.getClickCount()==2)
//			{
////				int row=table.getSelectedRow();
////				String fno=model.getValueAt(row, 0).toString();
//				//System.out.println("선택 번호:"+fno);
//				//FoodHouseVO vo=fm.foodInfoData(Integer.parseInt(fno));
//				cp.fdp.foodPrint(vo);
//				cp.card.show(cp, "fdetail");
//			}
//		}
//	}
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void actionPerformed1(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource()==b)
//		{
//			cp.card.show(cp, "home");
//		}
//	}
}