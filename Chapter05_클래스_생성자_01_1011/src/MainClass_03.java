class Member
	// 우선순위는 명시적 초기화
{	//초기화할 때 1번 순위
	int mno=1;
	String id="admin";
	String pwd="1234";
	String name="홍길동";
	//안보이지만 Member(){} 있는 상태
	{	// 2번 순위
		mno=3;
		id="park";
		pwd="5678";
		name="심청이";
		// 파일 읽어서 값 대입하는 경우 주로 사용
	}
	//3번 순위 //일반적으로 초기화 블록과 생성자는 같이 사용하지않음. 
	//			제어문을 사용할 때는 명시적 초기화 못쓰니까 그 때 초기화블록과 생성자 사용함. 주로 초기화블록 보다는 생성자 사용함
	Member(){ // 생성자 블록
		mno=2;
		id="hong";
		pwd="4321";
		name="박문수";
}
}
public class MainClass_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(); //메모리 저장 => 생성자 호출
		System.out.println("번호:"+m1.mno);
		System.out.println("ID:"+m1.id);
		System.out.println("PWD:"+m1.pwd);
		System.out.println("Name:"+m1.name);
		System.out.println("=======================");
		Member m2=new Member();
		System.out.println("번호:"+m2.mno);
		System.out.println("ID:"+m2.id);
		System.out.println("PWD:"+m2.pwd);
		System.out.println("Name:"+m2.name);
		
	}

}
