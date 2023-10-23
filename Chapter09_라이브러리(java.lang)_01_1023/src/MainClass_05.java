/*
 * 
 		메모리 사용법
 		----------
 			= 같은 메모리 사용 : 얕은 복사 ==> 대입
 			= 새로운 메모리 제작 : 깊은 복사 ==> clone (prototype)
 */
class Student
{
	int hakbun;
	String name;
}
public class MainClass_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 얕은 복사 : 매개변수로 주소를 보내서 메소드에 제어할 때 많이 사용
		// Call By Reference
		// 윈도우
		Student s=new Student(); 
		s.hakbun=1;
		s.name="홍길동";
		
		Student s1=s; // 주소가 같으면 같은 변수를 제어한다
		s1.hakbun=2;
		s1.name="심청이";
		
		System.out.println(s.name);
		System.out.println(s.hakbun);
		
	}

}
