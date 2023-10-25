package com.sist.student;
	//학생 한명에 대한 데이터를 모아서 한번에 관리
	// 학생이라는 데이터형을 제작
	// 데이터 은닉화 => 읽기/쓰기 기능 추가 ==> 객체지향의 3대 특성 중 캡슐화
public class Student {
	
	private int hakbun;
	private String name;
	private int kor,eng,math;
	
	//캡슐화 코딩 : private 일 때 getter setter 사용
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	// 생성자 오버로딩 => 한 개의 메소드로 여러개 기능 설정
	public Student()
	{
		
	}
	// 생성자 마우스 우클릭 - Source - Constructor using Field
	public Student(int hakbun, String name, int kor, int eng, int math) {
		super();
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
}
