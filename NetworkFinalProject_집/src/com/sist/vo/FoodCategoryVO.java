package com.sist.vo;

import java.io.Serializable;

/*
 *   1|얼큰한 칼국수 맛집 베스트 20곳|"한국인 맞춤 얼큰칼칼 칼국수 다모여!"|https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rpvuj1tpaueafi4l.jpg?fit=around|600:400&crop=600:400;*,*&output-format=jpg&output-quality=80
	 1|자연송이쇠고기죽|땅에서 나는 보약 자연송이와 소고기로 끓여낸 보양 한 그릇|https://cdn.bonif.co.kr/cmdt/BF102_thum_10000277.jpg|16,000원|MY메뉴 원산지정보|땅에서 나는 보약 자연송이와 영양 가득 소고기가 만나 더욱 건강하고 든든한 프리미엄 보양죽 ※ 현미죽 변경 시 안내 현미죽은 최적의 풍미를 살린 레시피로 기존 죽 대비 제공량에 다소 차이가 있습니다.
 */
public class FoodCategoryVO implements Serializable{
    private int cno;
    private String title;
    private String subject;
    private String poster;
	
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	   
   
}