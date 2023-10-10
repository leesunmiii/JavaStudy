//	 변수 => 초기화
/*
 * 		1. 명시적 초기화
 * 		2. 초기화 블록
 * 		3. 생성자
 * 
 * 		=> class의 블록 : 선언만 가능, 구현 불가
 * 								   --- 메소드 호출
 * 								   --- 연산처리
 * 								   --- 제어문 처리
 * 								   --- 파일 읽기
 * 								   --- 키보드 입력값
 * 								   --- 변수값 변경
 */
class Student{
//	int a;
//	a=10; // 불가능
	int a=10; // 가능 // 선언과 동시에 초기화 => 명시적 초기화 (1)
	{
		a=100; // 초기화 블록 => 자동 처리
		// 쓰이는 곳 : 자동 로그인, 크롤링해서 데이터 저장할 때
	}
}

public class MainClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
