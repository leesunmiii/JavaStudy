/*
 * 산술연산자
 * 정수 3개 입력을 받아서 총점, 평균
 */
import java.util.Scanner; // Scanner클래스를 가지고 온다
// java.util = 폴더 (패키지)
// c => include
// c# => using
// 자바 스크립트, 파이썬 => import

public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng, math;
		int total;
		double avg;
		// 변수 선언 (메모리 저장하는 공간만 만든다)
		// 메모리 공간에 값을 첨부 => 변수의 초기화
		Scanner scan=new Scanner(System.in);
		//system.in = 키보드 입력값
		//system.in에서 받은 입력값을 Scanner에 저장
		System.out.println("국어,영어,수학 점수 입력(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		// 활용할 수 있다
		// 연산처리 ==> 
		total=kor+eng+math;
		avg=total/3.0;
		// 결과 출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f",avg);
		System.out.println();
		System.out.println(avg>=90 && avg<100?"A학점":"");
		System.out.println(avg>=80 && avg<90?"B학점":"");
		System.out.println(avg>=70 && avg<80?"C학점":"");
		System.out.println(avg>=60 && avg<70?"D학점":"");
		System.out.println(avg<60?"F학점":"");
		
	}

}
