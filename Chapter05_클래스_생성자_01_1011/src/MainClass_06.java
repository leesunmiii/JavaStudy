class B
{
	int a=10;
	void B() { // 생성자(X), 일반 메소드   ====> 출력 : b.B();
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	
	/*
	 *  	생성자 => 초기화가 필요한데, 명시적 초기화가 불가능할 때 사용
	 *  			예) 제어문 / 파일읽기
	 *  		 => 시작과 동시에 처리 => 가장 먼저 호출
	 *  		    --------------
	 *  				  |
	 *  			  예) 자동 로그인, 윈도우 화면 설정(계산기디자인..), 서버연결, 데이터베이스 연결
	 */
	
	
//	B(){ // 생성자
//		System.out.println("B클래스의 디폴트 생성자 호출");
//	}
}
public class MainClass_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// B(); // 이렇게 호출하면 오류남
		//new B(); // 생성자 호출할 때는 반드시 new를 붙여야함 => new 생성자()
		//new B().a=100;
	//---------와
//		B b=new B();
//		b.a=100;
//		System.out.println(new B().a);
	//					  ------- 얘는 다른것 => new가 붙으면 다른 메모리라는 것	
		
//		B b=new B();
//		b.a=100;
//		=> 위에 두 줄을 한줄로 바꿔서 쓸 수 있슴 => new B().a=1000;
//		System.out.println(b.a);
		
		B b=new B();
	}

}
