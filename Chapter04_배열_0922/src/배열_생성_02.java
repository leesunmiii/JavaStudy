// 3명의 학생 => 국어, 영어, 수학 => 총점, 평균
import java.util.Scanner;
public class 배열_생성_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번째 학생 국어 점수:");
		kor1=scan.nextInt();
		
		System.out.print("첫번째 학생 영어 점수:");
		eng1=scan.nextInt();
		
		System.out.print("첫번째 학생 수학 점수:");
		math1=scan.nextInt();
		
		System.out.print("두번째 학생 국어 점수:");
		kor2=scan.nextInt();
		
		System.out.print("두번째 학생 영어 점수:");
		eng2=scan.nextInt();
		
		System.out.print("두번째 학생 수학 점수:");
		math2=scan.nextInt();
		
		System.out.print("세번째 학생 국어 점수:");
		kor3=scan.nextInt();
		
		System.out.print("세번째 학생 영어 점수:");
		eng3=scan.nextInt();
		
		System.out.print("세번째 학생 수학 점수:");
		math3=scan.nextInt();
		
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor1,eng1,math1,total1,total1/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor2,eng2,math2,total2,total2/3.0);
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor3,eng3,math3,total3,total3/3.0);
		
	}

}
