//국어, 영어, 수학 점수를 입력받아서 => 총점, 평균, 학점
import java.util. Scanner;
public class 제어문_조건문03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math,total;
		double avg;
		char score=' '; //명시적인 초기화
		//입력값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수: ");
		kor=scan.nextInt();
		System.out.println("영어점수:");
		eng=scan.nextInt();
		System.out.println("수학점수:");
		math=scan.nextInt();
		
		//초기화
		total=kor+eng+math;
		avg=total/3.0;
		//학점 => 평군 => >=90 A >=80 B
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else
			score='F';
			
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);	
			
		}
		// 결과 값을 출력=> 제어문, 연산자 => DOS, 브라우저, 모바일
		
				
	}


