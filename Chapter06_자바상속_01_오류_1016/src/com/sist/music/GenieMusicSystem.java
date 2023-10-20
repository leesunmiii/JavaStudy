package com.sist.music;
import java.util.*;
import java.sql.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusicSystem {
	protected Music[] musics=new Music[50]; // 여기에 {} 블록 열고 초기값을 채울 수 없음, 클래스 영역에서는 제어문 불가능
	protected String title="지니뮤직 Top50";
	
	// => 생성자, 초기화 블록...  둘 중 하나 골라야함
	{
		// => 이건 초기화 블록
		// 외부에서 데이터를 읽어온더 => 값을 초기화
		// ------------ 크롤링, 파일에서 읽어온다, 오라클에서 가져온다 ... => 구현 => 명시적 초기화 불가능
		/*
		 * 		 초기화 블록
		 * 		=> 인스턴스 블록 : {} => 인스턴스 변수, static 변수 사용
		 * 		=> 정적 블록 (static) : static{} : static 변수만 초기화가 가능
		 * 		=> -------------------------------- 자동 인식 ( 호출하는 것이 아니다)
		 * 		=> 상속의 예외 조건
		 * 		try ~ catch => 프로그램의 비정상 종료 방지
		 * 					=> 에러를 사전에 방지
		 * 		try
		 * 		{
		 * 			// 정상적으로 수행하는 문장
		 * 			// 지금까지 코딩했던 모든 문장
		 * 		}catch(Exception ex){에러시 처리}
		 * 		=> 에러를 무시하고 다음 문장을 수행한다
		 * 		network, 파일, 오라클 연동 ==> 예외처리를 반드시 한다
		 * 		=> 수정이 가능한에러만 가능하다
		 * 		ex)	메모리 부족 (은 불가능 X),
		 * 
		 *  		에러(처리 불가능) / 예외처리 (처리 가능)
		 *  		이클립스 오류		10/0
		 *  		메모리 부족		사이트 주소 오타
		 */
		try
		{
			// java.util.Date date=new java.util.Date();
			// Date
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// HTML을 저장하는 공간, HTML을 읽어서 데이터 추출
			// 데이터 저장 => HTML, JSON, XML => 데이터 추출 방식이 다르다
			/*
			 * 	HTML => tag/attribute <> </> <a/> => Markup lang
			 * 			<a class="aaa"><a/>
			 * 			--			   ----
			 * 	태그를 읽는 방법
			 * 	Element => Tag
			 * 	같은 태그 여러개를 읽는 경우 : Elements
			 * 
			 * 	==> 구분자	    찾는법
			 * 		id ==> 태그명#ID명 => 중복이 없는 경우
			 * 		class ==> 태그명.클래스명 =>  중복이 있는 경우
			 * 	<table id="aaa"> => table#aaa
			 * 	<table class ="bbb"> table.bbb
			 * 
			 * 		String[] arr={"aaa","bbb","ccc","ddd"}
			 * 		arr[i]
			 */
			// 노래제목
			Elements title=doc.select("table.list-wrap td.info a.title");
			// 가수명
			Elements singer=doc.select("table.list-wrap td.info a.artist");
			// 앨범
			Elements album=doc.select("table.list-wrap td.info a.albumtitle");
			
//			for(int i=0;i<50;i++)
//			{
//				musics[i]=new Music();
//				musics[i].setMno(i+1);
//				musics[i].setTitle(title.get(i).text());
//				musics[i].setSinger(singer.get(i).text());
//				musics[i].setAlbum(album.get(i).text());
//				
//			}
		}catch(Exception ex) {}
	}
	public Music[] musicAllData()
	{
		return musics;
	}
	//제목으로 찾기
//	public Music[] musicTitleFindData(String title)
	{
		int count=0;
		for(Music mm:musics)
		{
//		if(mm.getTitle().contains(title))
		{
			count++;
		}
	}
	Music[] music=new Music[count];
	//배열 (고정) => 가변형 [컬렉션]
	int i=0;
	for(Music mm:musics)
	{
//		if(mm.getTitle().contains(title))
		{
			music[i]=mm;
			i++;
		}
	}
	
}
	//가수명 찾기
	public Music[] musicSingerFindData(String singer)
	{
		int count=0;
		for(Music mm:musics)
		{
//			if(mm.getSinger().contains(singer))
			{
				count++;
			}
		}
//		return mn
		Music[] music=new Music[count];// 배열의 단점= 고정(갯수
		int i=0;
		for(Music m:musics)
		{
//			if(m.getSinger().contains(singer))
			{
				music[i]=m;
				i++;
			}
			
		}
		return music;
		
	}
	//상세보기
//	public Music musicDetailData(int mno)
//	{
//		return musics[mno-1];
//	}
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("가수명 입력:");
//		GenieMusicSystem gm=new GenieMusicSystem();
//		Music[] music=gm.musicSingerFindData(Singer);
//		System.out.println("검색 결과:"+music.length+"건");
//		for(Music m:music)
//		{
//			System.out.println(m.getMno()+"."+m.getTitle());
//		}
//	}
}

