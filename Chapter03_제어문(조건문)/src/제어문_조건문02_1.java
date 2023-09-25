//if~else
// 국어, 영어, 수학 => 평균, 총점 => 평균이 60점 이상 합격, 60 이하 불합격
import java.util.Scanner;

public class 제어문_조건문02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int kor, eng, math, total;
		double avg;
		// 초기화 => 명시적 초기화, 입력값 받아서 저장, 임의발생
		/*
		 * 			int a=10,  Scanner     , random()
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수:");
		kor=scan.nextInt();
		System.out.println("영어점수:");
		eng=scan.nextInt();
		System.out.println("수학점수:");
		math=scan.nextInt();
		//총점
		total=kor+eng+math;
		//평균
		avg=total/3.0;
		
		System.out.println("============ 결과값 ==============");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		if(avg>=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
		// 결과값 도출
		
	}

}
