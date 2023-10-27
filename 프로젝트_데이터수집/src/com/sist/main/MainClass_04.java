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
        	//Elements link=doc.select("div.section_ranking strong.tit_item a");
        	
        	for(int i=0;i<link.size();i++)
        	{
        		String subLink="https://www.bonif.co.kr/menu/"+link.get(i).attr("href");
        		System.out.println(subLink);
        		Document doc2=Jsoup.connect(subLink).get();
        		
        		Elements title=doc.select("div.goods-name p.nm");
            	Elements money=doc.select("div.goods-name p.price");
            	Elements poster=doc.select("div.goods-thumb img");
        	   try
        	   {
        		 System.out.println(title.get(i).text());
        		 System.out.println(money.get(i).text());
        		 System.out.println(poster.get(i).attr("src"));
        		 
        	   }catch(Exception ex) 
        	   {
        		   
        	   }
        	   // 메모장 안에 내용
        	   String msg=(i+1)+" | "+title.get(i).text()+" | "+money.get(i).text()+" | "+poster.get(i).attr("src")+" | "+subLink+"\n";
        		
        	   // 메모장 생성
        	   FileWriter fw=new FileWriter("c:\\java_data\\bonjuk.txt",true);
        		fw.write(msg);
        		fw.close();
        	}
        	
        }catch(Exception ex) {}
	}

}