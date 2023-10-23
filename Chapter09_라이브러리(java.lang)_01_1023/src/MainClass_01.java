/*
 		java.lang
 		java.util
 		java.io		
 		java.text
 		java.net
 		java.sql
 		--------------클래스 / 메소드
 		java.lang => import를 생략할 수 있다
 		=> 기본이 되는 클래스의 집합
 		=> ***Object : 모든 클래스의 상위 클래스
 					라이브러리 / 사용자정의 클래스를 만들 때 항상 상속을 받아야한ㄴ
 				= toString() : 객체를 문자열화 => 생략이 가능
 					=> 객체 주소 출력
 					class A
 					A a=new A();
 					System.out.println(a)
 					Syste.out.println(a.toString())
 										---------- 생략된 것
 				= finalize() : 소멸자 : 메모리 해제시 호출
 				= clone() : 복제 => 메모리 복제 => 새로운 객체 생성
 		=> ***String / StringBuffer
 			StringBuffer : 문자열 결합시 최적화
 				  -------  임시 저장 장치
 				  -------  append()
 			String : 문자열 관리
 			------
 				equals : 문자열이 같은지 확인
 				length : 문자 갯수
 				contains() : 포함 문자
 				startsWith() : 시작 문자열
 				endsWith() : 끝 문자열
 				substring() : 문자열을 자른다
 				indexOf() : 문자 위치 찾기
 				lastIndexOf() : 문자 위치 찾기
 				valueOf() : 모든 데이터형을 문자열로 변환
 				split() : 문자열 분해
 				
 		=> System
 			=> println(), print
 			=> gc() : 메모리 해제
 			=> exit() : 프로그램 종료
 		=> Math : 수학
 			=> random() : 임의의 수 발생
 			=> ceil() : 올림 => 총페이지
 		=> Math
 		=> ***Wrapper : 모든 데이터형을 관리하기 쉽게 클래스화 시켜주는
 		 				=> 데이터형 변경 (제니릭스는 클래스만 가능)
 		 				<int> => <Integer>
 						int => Integer => parseInt() : 문자열 정수형 변경
 						double => Double => parseInt()
 						boolean => Boolean => parseBoolean()
 						byte => Byte
 						=> 변환
 							=> if(a.equals("1"))
 								int a=1; ==> 42억
 * 
 */
public class MainClass_01 /*extends Object (눈에 보이지않지만 모든 클래스는 오브젝트 상속받고있다) */{
	private String name;
	private int age;
	// 입력을 받아서 초기화
	public MainClass_01 (String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	// 가장 많이 재정의되는 메소드 : 멤버변수값을 출력
	// 메모리 주소 => 싱글턴 검색 (메모리 주소가 동일)
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+",나이:"+age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// toString => 객체를 문자열화
		// 생략가능
		MainClass_01 m=new MainClass_01("홍길동",20);
		System.out.println(m);
		System.out.println(m.toString());
		

	}

}
