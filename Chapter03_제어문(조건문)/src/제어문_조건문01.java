
public class 제어문_조건문01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언 => 데이터관리 => 저장(메모리) => 한개의 데이터 저장
		// 프로그램의 시작 => 데이터 저장(변수선언), 연산자, 제어문 => 기초/필수
		// 데이터형 변수명
		int a=15;
		// 3의 배수, 5의 배수, 7의배수
		if(a%3==0) //a가 3의 배수인가?
		{
			System.out.println(a+"는 (은) 3의 배수입니다");
		}
		if(a%5==0) //a가 5의 배수인가?
		{
			System.out.println(a+"는 (은) 5의 배수입니다");
		}
		if(a%7==0) //a가 7의 배수인가?
		{
			System.out.println(a+"는 (은) 7의 배수입니다");
		}
	}

}
