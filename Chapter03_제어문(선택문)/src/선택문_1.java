// 성적
import java.util.Scanner;
// 3개의 정수 => 평균, 총점, 학점
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math,total,avg1;
		double avg2;
		char score=' ';
		// switch => 실수는 사용할 수 없다 => 정수, 문자, 문자열만 가능
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 입력:");
		kor=scan.nextInt();
		
		System.out.println("영어 입력:");
		eng=scan.nextInt();
		
		System.out.println("수학 입력:");
		math=scan.nextInt();
		
		total=(kor+eng+math);
		avg2=total/3;
		
		avg1=(int)(avg2/10);
		// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
		// break가 없으면 10 => score='F'
		
		switch(avg1)
		{
		case 10: // if(avg1==10 || avg1==9) score='A'
		case 9:
			score='A';
			break; // 종료 명령
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default: // 나머지
			score='F';
			
		}
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg2);
		System.out.println("학점:"+score+"학점");
	}

}
