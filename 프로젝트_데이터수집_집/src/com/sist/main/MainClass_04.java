package com.sist.main;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Document doc=Jsoup.connect("https://www.bonif.co.kr/menu/list?brdCd=BF102").get();
        	Elements link=doc.select("a.goods-detail-view");
        	
        	
        	//for(int i=0;i<link.size();i++)
        	for(int i=0;i<=96;i++)
        	{
        		System.out.println("=============");
        		String subLink="https://www.bonif.co.kr/menu/"+link.get(i).attr("href");
        		System.out.println(subLink);
        		Document doc2=Jsoup.connect(subLink).get();
        		
        		
        		Elements poster=doc.select("div.goods-thumb img");
        		Elements title=doc.select("div.goods-name p.nm");
            	Elements money=doc.select("div.goods-name p.price");
            	
            	Elements sub_poster=doc2.select("div.goods-detail-box img");
            	Elements sub_title=doc2.select("p.goods-name");
            	Elements sub_title2=doc2.select("p.goods-txt");
            	Elements sub_explain=doc2.select("div.goods-summary");
            	Elements sub_money=doc2.select("div.goods-price-box");
            	
            	
            	
        	   try
        	   {
        		 System.out.println("메인포스터 :"+poster.get(i).attr("src"));  
        		 System.out.println("메인 타이틀 :"+title.get(i).text());
        		 System.out.println("메인 가격 :"+money.get(i).text());
        		 System.out.println("-------------");
        		 
        		 System.out.println("상세 포스터 :"+sub_poster.get(i).attr("src"));
        		 System.out.println("상세 타이틀 :"+sub_title.get(i).text());
        		 System.out.println("서브 타이틀 :"+sub_title2.get(i).text());
        		 System.out.println("상세 설명 :"+sub_explain.get(i).text());
        		 System.out.println("상세 가격 :"+sub_money.get(i).text());
        		 
        	   }catch(Exception ex) 
        	   {
        		   ex.printStackTrace();
        	   }
//        	   // 메모장 안에 내용
//        	   String msg=(i+1)+" | "+title.get(i).text()+" | "+money.get(i).text()+" | "+poster.get(i).attr("src")+" | "+subLink+"\n";
//        		
//        	   // 메모장 생성
//        	   FileWriter fw=new FileWriter("c:\\java_data\\bonjuk.txt",true);
//        		fw.write(msg);
//        		fw.close();
        	}
        	
        }catch(Exception ex) {}
	}

}