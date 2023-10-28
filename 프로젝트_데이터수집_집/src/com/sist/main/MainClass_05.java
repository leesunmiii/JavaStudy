package com.sist.main;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	
        	Document doc=Jsoup.connect("https://www.bonif.co.kr/menu/list?brdCd=BF102").get();
        	Elements link=doc.select("a.goods-detail-view");
        	
        	
        	for(int i=0;i<link.size();i++)
        		
        	{
        		System.out.println("=============");
        		String subLink="https://www.bonif.co.kr/menu/"+link.get(i).attr("href");
        		System.out.println(subLink);
        		Document doc2=Jsoup.connect(subLink).get();
        		
        		Elements sub_poster=doc2.select("div.goods-detail-box img");
            	Elements sub_title=doc2.select("p.goods-name");
            	Elements sub_explain=doc2.select("p.goods-txt");
            	Elements sub_money=doc2.select("div.goods-price-box");
            	
            	System.out.println("서브포스터 :"+sub_poster.get(i).attr("src"));
            	System.out.println("서브 타이틀 :"+sub_title.get(i).text());
            	System.out.println("서브 설명 :"+sub_explain.get(i).text());
            	System.out.println("서브 가격 :"+sub_money.get(i).text());
        	}
        }catch(Exception ex) {}
	} 
}