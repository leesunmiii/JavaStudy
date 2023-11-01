package com.sist.manager;
import java.util.*;

import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;

import java.io.*;
public class FoodManager {
   private static ArrayList<FoodCategoryVO>
        cList=new ArrayList<FoodCategoryVO>();
  private static ArrayList<FoodHouseVO>
  		fList=new ArrayList<FoodHouseVO>();
   /*
    *         Throwable 
    *         ---------
    *            |
    *     -------------------------------
    *     |                             |
    *    Error                     Exception 
    *                                  |
    *                ---------------------------------
    *                |                               |
    *              CheckedException       UnCheckedException
    *              ----------------      -------------------
    *              컴파일시에 예외처리 확인      예외처리 확인(X)
    *              ------------------    -------------------
    *               java.io                  java.lang
    *               java.net                 java.util
    *               java.sql
    *      목적 : 에러를 사전에 방지 
    *            에러시 정상 수행을 할 수 있게 만든다 
    */
   // 초기화 블록 => static 변수가 있는 경우에 주로 사용 
   // 자동 수행이 된다 , 상속은 안된다 
   static
   {
	  
	   FileReader fr=null;
//	   ObjectOutputStream ois=null;
//	   FileOutputStream fis=null;
	   try
	   {
		   // 정상 수행 문장 
		   fr=new FileReader("c:\\java_data\\bonjuk.txt");
		   String data="";
		   int i=0;
		   while((i=fr.read())!=-1)//-1 (EOF)
		   {
			   data+=(char)i;
		   }
		   fr.close();
		   
		   String[] cates=data.split("\n"); //한줄씩 나눠서 cates 배열에 저장
		   for(String s:cates)
		   {
			   StringTokenizer st=new StringTokenizer(s,"|");
			   
			   FoodCategoryVO vo=new FoodCategoryVO();
			   vo.setCno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
			   vo.setTitle(st.nextToken());
			   vo.setSubject(st.nextToken());
			   vo.setPoster(st.nextToken());
			   cList.add(vo);
		   }
		   
//		   fis=new FileOutputStream("c:\\java_data\\bonjuk.txt");
//		   ois=new ObjectOutputStream(fis);
//		   ois.writeObject(cList);
		   
	   }catch(Exception ex)
	   {
		   // 에러 확인후 복구
		   ex.printStackTrace();
	   }
	   finally
	   {
		   // 무조건 수행하는 문장 => 파일 닫기 , 서버 닫기
		   try
		   {
			  // fis.close();
			   //ois.close();
		   }catch(Exception ex) {}
	   }
	   
	/* 
	 *  // 본죽 파일에서 직렬화된 객체를 읽어서 cList에 저장========================
	 * FileInputStream fis=null;
	   ObjectInputStream ois=null;
	   try
	   {
	    	// bonjuk 파일에서 직렬화된 객체 읽어온다
		   fis=new FileInputStream("c:\\java_data\\bonjuk.txt");
		   ois=new ObjectInputStream(fis);
		   
		  // cList에 저장
		   cList=(ArrayList<FoodCategoryVO>)ois.readObject();
		   
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fis.close();
			   ois.close();
		   }catch(Exception ex) {}
		   // ============================
	   }*/
	   
   }
   
 /*
  * 
  	public static void main(String[] args) {
	   FoodManager fm=new FoodManager();
	   System.out.println("저장 완료!!");
	   for(FoodCategoryVO vo:cList)
	   {
		   System.out.println(vo.getCno());
		   System.out.println(vo.getTitle());
		   System.out.println(vo.getSubject());
		   System.out.println(vo.getPoster());
		   System.out.println("==============================");
	   }
   }*/
   
   public ArrayList<FoodCategoryVO> foodCategoryData(int no)
   {
	   ArrayList<FoodCategoryVO> list= new ArrayList<FoodCategoryVO>();
	   int start=0;
	   int end=0;
	   if(no==1)
	   {
		   start=0;
		   end=10;
	   }
	   else if(no==2)
	   {
		   start=11;
		   end=15;
	   }
	   else if(no==3)
	   {
		   start=16;
		   end=27;
	   }
	   else if(no==4)
	   {
		   start=28;
		   end=32;
	   }
	   else if(no==5)
	   {
		   start=33;
		   end=38;
	   }
	   else if(no==6)
	   {
		   start=39;
		   end=42;
	   }
	   else if(no==7)
	   {
		   start=43;
		   end=52;
	   }
	   else if(no==8)
	   {
		   start=53;
		   end=62;
	   }
	   else if(no==9)
	   {
		   start=63;
		   end=69;
	   }
	   for(int i=start;i<=end;i++)
	   {
		   list.add(cList.get(i));
	   }
	   return list;
   }
   
   
   public FoodCategoryVO categoryInfoData(String title)
   {
	   FoodCategoryVO vo=new FoodCategoryVO();
	   for(FoodCategoryVO fvo:cList)
	   {
		   if(fvo.getTitle().equals(title))
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   public ArrayList<FoodHouseVO> foodHouseListData(int cno)
   {
	   ArrayList<FoodHouseVO> list=
			   new ArrayList<FoodHouseVO>();
	   for(FoodHouseVO fvo:fList)
	   {
		   if(fvo.getCno()==cno)
		   {
			   list.add(fvo);
		   }
	   }
	   return list;
   }
   public FoodHouseVO foodInfoData(int fno)
   {
	   FoodHouseVO vo=new FoodHouseVO();
	   for(FoodHouseVO fvo:fList)
	   {
		   if(fvo.getCno()==fno)
		   {
			   vo=fvo;
			   break;
		   }
	   }
	   return vo;
   }
   public ArrayList<FoodHouseVO> foodFindData(String title)
   {
	   ArrayList<FoodHouseVO> list=
			   new ArrayList<FoodHouseVO>();
	   for(FoodHouseVO fvo:fList)
	   {
		   if(fvo.getTitle().contains(title))
		   {
			   list.add(fvo);
		   }
	   }
	   return list;
   }
}