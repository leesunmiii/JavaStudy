package com.sist.vo;

import java.io.Serializable;

/*
 *  1
 *  |자연송이쇠고기죽
 *  |땅에서 나는 보약 자연송이와 소고기로 끓여낸 보양 한 그릇
 *  |https://cdn.bonif.co.kr/cmdt/BF102_thum_10000277.jpg
 *  |16,000원
 *  |MY메뉴 원산지정보
 *  |땅에서 나는 보약 자연송이와 영양 가득 소고기가 만나 더욱 건강하고 든든한 프리미엄 보양죽 ※ 현미죽 변경 시 안내 현미죽은 최적의 풍미를 살린 레시피로 기존 죽 대비 제공량에 다소 차이가 있습니다.

 */
public class FoodHouseVO implements Serializable{
    private int Cno;
    private String title;
    private String title_explain;
    private String poster;
    private String price;
    private String mymenu;
    private String explain;
    
	public int getCno() {
		return Cno;
	}
	public void setCno(int fno) {
		this.Cno = Cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle_explain() {
		return title_explain;
	}
	public void setTitle_explain(String title_explain) {
		this.title_explain = title_explain;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMymenu() {
		return mymenu;
	}
	public void setMymenu(String mymenu) {
		this.mymenu = mymenu;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
    
   
    
	
   
   
}