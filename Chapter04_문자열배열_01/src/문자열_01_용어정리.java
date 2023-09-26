/*
 * 	자바 => 문자열(웹, 윈도우) => 가장 많이 사용되는 데이터형
 * 				--------- 대부분 문자열을 가지고 있다 
 * 
 * 	문자열 사용법
 * 	----------
 * 	=> 데이터형
 * 	   String : 일반 데이터형, 클래스형으로 사용이 가능
 * 				----------
 * 					|
 * 				String name="홍길동";
 * 				String name=new String("박문수")
 * 				** 문자열의 저장 갯수는 제한이 없다
 * 		String => 클래스형으로 만들어져 있다
 * 		------ char[]
 * 		"Hello Java"
 * 		 0123456789  ==> 배열형식 ==> 0번부터 //문자열번호 (0번부터 시작하는거 중요)
 * 						 오라클은 1번부터 시작
 * 						 MySQL은 0번부터 시작
 * 		=> {'H','e','l','l','o',' ','J','a','v','a'}
 * 			String은 메소드 기능을 가지고있다
 * 			***	라이브러리 (변경해서 사용할 수 없다)
 * 				=> 왜냐면 final class이기 때문
 * 				java.lang에 있는 대부분의 클래스는 final
 * 				---------	String, Math, System...
 * 			---------------------------
 * 			변환기능
 * 			 toUpperCase() : 대문자 변환
 * 			 toLowercase() : 소문자 변환
 * 			 *****valueOf() : 모든 데이터형을 String으로 변경
 * 					int a=10;
 * 					valueOf(a)==> "10"
 * 					valueOf(a)+100==> "10100"
 * 			제어기능
 * 				substring() : 문자 자르기
 * 			변경기능
 * 				trim() : 공백 제거(좌우의 공백만 제거) // trim을 주면 로그인할 때 아이디에 스페이스바 누르고 로그인 눌러도 아이디입력하라함
 * 				replace() : 문자, 문자열 변경
 * 				replaceAll() : 변경
 * 				split() : 분리 //문자를 잘라서 배열에 저장
 * 			찾기기능
 * 				indexOf() ==> 위치 (앞에서)
 * 				lastIndexOf() ==> 위치 (뒤에서)
 * 				"Hello Java"
 * 			결합기능
 * 			concat() ==> 대신에 + 연산자 사용함.  문자열 결합
 * 			비교
 * 			equals() : 같은 문자열 (로그인, 아이디 찾기에 사용됨)
 * 			contains() : 문자열 포함여부 (검색할 때 사용)
 * 			startsWith() : 시작 문자열이 같은 경우 ==> Cookie 제어할 때 사용
 * 			endsWith() : 끝 문자열이 같은 경우
 * 			기타
 * 			charAt()  문자중의 한개의 char 얻는다
 * 			 toCharArrays() => char[]
 * 			기타	
 */
import java.util.Arrays;

public class 문자열_01_용어정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기능처리 => 메소드 : 기능 처리한 후에 반드시 결과값을 보내준다.
		// 결과값 : 리턴형
		// double Math.random()
		// Math.random()
		// String => char[] toCharArray

//		String s="Hello Java";
//		System.out.println(s);
//		char[] c=s.toCharArray(); // .toCharArray() => 문자열을 char[] 문자형 배열로 바꿔주는 메소드
//		System.out.println(Arrays.toString(c));
		
		char[] arr=new char [10];
		// 초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		
		//System.out.println(Arrays.toString(arr));
		//String s= String.valueOf(arr);
		//System.out.println(s);
		
		// char[] => String : valueOf
		// String => char[] : toCharArray
		// charAt() => char
		
		/*
		 * 		Hello Java
		 * 		0123456789
		 * 
		 * 		charAt(4) => 'o'
		 * 		
		 */
		
		String s="Hello Java"; // String에는 ""쓰는거 잘 기억
		for(int i=0;i<10;i++)
		{
			char c=s.charAt(i);
			System.out.println("c="+c);
		}
	}

}
