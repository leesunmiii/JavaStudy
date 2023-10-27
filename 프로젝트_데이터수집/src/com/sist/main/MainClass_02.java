package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{	// 외부에서 가져오면 connect
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			// 데이터 하나면 element 여러개면 elements
			Elements title=doc.select("div.section_ranking strong.tit_item a");
			Elements poster=doc.select("div.section_ranking div.poster_movie img");
			Elements grade=doc.select("div.section_ranking span.txt_tag");
			Elements score=doc.select("div.section_ranking span.txt_grade");
			Elements rev=doc.select("div.section_ranking span.txt_append span.text_num");
			
			/*
			 * <a href="/moviedb/main?movieId=171140" 
			 * ------------------------------------속성부분 가져오고 싶으면 attr("href")
			 * class="link_txt" data-tiara-layer="moviename">
			 * 그대들은 어떻게 살 것인가 => 이거 가져오고 싶을 때는 text
			 * </a>
			 * 
			 */
			for(int i=0;i<title.size();i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(poster.get(i).attr("src"));
				System.out.println(grade.get(i).text());
				System.out.println(score.get(i).text());
				System.out.println(rev.get(i).text());
				System.out.println(title.get(i).attr("href"));
			}
			
			
		}catch(Exception ex) {}
		
	}

}
