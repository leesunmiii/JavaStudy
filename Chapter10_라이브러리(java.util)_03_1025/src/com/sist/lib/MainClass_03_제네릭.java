package com.sist.lib;
/*
 * 		338page => 제네릭
 * 			제네릭 : 데이터형을 통일화할 때 사용 (기존에 설정된 데이터를 변경)
 * 					=> 기본형은 사용할 수 없고 클래스형만 사용이 가능
 * 					   ------------------------------------
 * 						=> Wrapper를 이용해서 기본형을 사용할 수 있게 만든다
  				사용방법
  					<클래스형> => 자바에서는 컬렉션 => Object로 설정이 되어있다
  												 ------ 지정된 클래스형으로 변경
  					<T> => type (클래스형)
  					<E> => element (요소)
  					<K> => key
  					<V> => value
  					---- 임시변수
  					
  					List<E>
  					Vector<E>
 					Set<E>
 					Map<K,V>
 					
 					장점 =>  소스가 간결해진다 => 형변환이 필요없다
 					단점 => 무조건 지정된 데이터형만 첨부해야한다
 					ArrayList => Object 여서 모든 데이터 넣을 수 있다
 					ArrayList<String>	=> 모든 데이터가 String
 					ArrayList<Integer> =>  모든 데이터가 int
 					ArrayList<int> => 오류
 					ArrayList<Music> => 가능, => 사용자 정의 클래스도 가능
 					=> 저장된 데이터는 같은 데이터형을 사용해야 편리하다
 * 
 */
class Data<T>
{
	private T t; // T가 없는 경우는 자동으로 Object 설정됨
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT()
	{
		return t;
	}
}
public class MainClass_03_제네릭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data=new Data();
		Data<String> d=new Data<String>();
		
	}

}
