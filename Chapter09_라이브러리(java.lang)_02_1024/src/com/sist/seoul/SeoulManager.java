package com.sist.seoul;

import java.io.FileReader;
import java.util.StringTokenizer;

import com.sist.music.Music;


public class SeoulManager {
	Seoul[] seouls= new Seoul[273];
	
	public SeoulManager()
	{
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\seoul_location.txt"); // FileNotFoundException
			int i=0;
			String seoul_data="";
			while((i=fr.read())!=-1) //-1 EOF 파일 끝까지 읽어라
			{
				seoul_data+=(char)i;
			}
		
			String[] mds=seoul_data.split("\n");
			i=0;
			for(String s:mds)
			{
				try
				{
				StringTokenizer st=new StringTokenizer(s,"|");
				seouls[i]=new Seoul();
				// 문자열 => 정수형으로 변경 Integer.parseInt()
				// token (단어) => String st.nextToken()
				seouls[i].setRank(Integer.parseInt(st.nextToken()));
				seouls[i].setName(st.nextToken());
				seouls[i].setExplain(st.nextToken());
				seouls[i].setLocation(st.nextToken());
				i++;
				}catch(Exception ex) {}
			}
		}catch(Exception ex) 
		{
			// 에러 확인
			ex.printStackTrace();
		}
		finally
		{
			// 파일 닫기
		try 
		{
			fr.close();
		} catch (Exception ex) {}
	}
		
	}
	 public Seoul[] SeoulAllData()
	  {
		  return seouls;
	  }
}
