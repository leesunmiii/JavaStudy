package com.sist.lib;
import java.util.*;
/*
 * 		List 계열의 클래스
 * 			= 순서가 있다 (인덱스)
 * 			= 데이터를 중복해서 저장할 수 있다
 * 
 		ArrayList
 		=> 단방향 포인터(인덱스라고 하는것)를 가지고 있다
 			=> 조회하기 편하다 (성능이 좋다)
 		=> 검색이 빠르다, 데이터 추가시에 뒤에 추가하면 속도가 빠르다
 		=> 단점 : 수정, 중간에 추가, 삭제하면 속도가 느리다
 				 -------------------------------- 웹에서는 사용안하기 때문에 ArrayList를 많이 사용한다
 		= 수정, 삭제가 없는 프로그램에서 주로 이용
 		  ---------------------- 데이터베이스에서 주로 만들어진다
 		  	=> ArrayList는 주로 데이터를 모아서 (브라우저, 윈도우에) 전송하는 역할을 수행

 		LinkedList
 			= 양방향 포인터를 가지고 있다
 			= 수정, 삭제, 추가가 많은 경우에 주로 사용
 				=> 윈도우 (애플리케이션)
 			= 단점 : 검색속도가 느리다 => 웹에서 사용 안하려한다

 		Vector
 		=> 단방향 (ArrayList와 동일)
 		=> 동기 => 채팅, 서버연결, 사용자 정보를 저장
 		   ---- 비동기로 해서 속도를 빠르게 한 것 : ArrayList(Vector를 보완)
 * 
 */
public class MainClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vec=new Vector<Integer>();
		/*
		 * 앞으로 아래처럼 쓰는게 더 편하다. 인터페이스로 제어하는게 더 편하다
		  List<String> list = new Vector<String>()
		  List<String> list = new ArrayList<String>()
		  List<String> list = new LinkedList<String>()
		  
		 */
		// 데이터 추가 => add(Object) 였는데 Integer로 설정해서 integer로 바뀜
		// Wrapper => 기본형과 동일하게 사용이 된다
		// int =10; Integer i=10; => 오토박싱
		
 		vec.add(Integer.valueOf(10)); // 0
 		//      ---------------- 원래 정석은 이렇게 써야하는데 불편해서 허용
		vec.add(20); // 1
		vec.add(30); // 2 
		vec.add(40); // 3
		vec.add(50); // 4
		vec.addElement(60);
		
		// Vector만이 가지고있는 것 => addElement: 추가
		//elementAt(index)
		//removeElementAt(index)
		
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		// 삭제 : remove(int index) => 자동으로 인덱스 변경
		vec.remove(0);
		System.out.println("===== 삭제 =====");
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		// 수정 : set(index, 데이터)
		System.out.println("===== 수정 =====");
		vec.set(0, 1000);
		for(int i=0;i<vec.size();i++)
		{
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		// 데이터 갯수 확인 : size
		System.out.println("===== 데이터 갯수 확인 =====");
		System.out.println(vec.size());
		
		System.out.println("===== 전체 삭제 =====");
		vec.clear();
		System.out.println("총 갯수:" +vec.size());
		
		
		if(vec.isEmpty())
		{
			System.out.println("접속자가 없습니다!!");
		}
		else
		{
			System.out.println("접속자가 있습니다!!");
		}
	}

}
