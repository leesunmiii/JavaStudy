import java.util.*;
/*
 * 		int aaa(int a, int b)
 * 		{
 * 			reurn a+b;
 * 		}
 * 		
 * 		int a,b //멤버변수 : 값이 사라지지않는 변수
 * 		void aaa()
 * 		{
 * 
 * 		}
 */    
class Student{
	// heap => 프로그램 종료시까지 메모리 유지 => 다른 클래스에서 사용가능
	String name; //null
	int kor,eng,math; // 0,0,0 => 저장되는 위치 heap
	// 매개변수 / 지역변수 =>stack
	Student(String name, int kor, int eng, int math) //가로안에 변수들은 Student 쓰고 사라지는 매개변수(?)
	{
		//매개변수 / 지역변수 => 메소드 안에서만 사용가능 => 사용 후 자동 메모리 해제. 삭제됨
		this.name=name; // 자신의 객체를 나타내는게 this
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
		//지역변수, 매개변수를 찾고 없으면 => 멤버변수에서 찾는다
		
	}
	
	
}
public class MainClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std=new Student[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<std.length;i++)
		{
			System.out.println((i+1)+"번째 이름 입력:");
			String name=scan.next();
			
			System.out.print((i+1)+"번째 국어 입력:");
			int kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 입력:");
			int eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 입력:");
			int math=scan.nextInt();
			
			std[i]=new Student(name, kor, eng, math);
		}
//		ArrayList<Student> list=new ArrayList<Student>();
//		list.add(new Student("", 0, 0, 0));
		
		//출력
		for(int i=0;i<std.length;i++)
		{
			System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n",std[i].name,std[i].kor,std[i].eng,std[i].math,
					(std[i].kor+std[i].eng+std[i].math),(std[i].kor+std[i].eng+std[i].math)/3.0);
		}
	}

}
