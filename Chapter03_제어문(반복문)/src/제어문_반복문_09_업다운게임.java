/*
 * 
 * 	updown 게임
 * ---------------
 * 		컴퓨터 난수 발생 : 1~100
 * 		---------------------
 * 		=> 힌트
 * 		   ---
 * 			=> 정답이 나올 때까지 반복
 *        	   --------------------- 무한루프
 *        		for(;;) == while(true)
 *        	
 *        
 */
import java.util.Scanner;
// import java.lang.* => 프로그램에서 많이 사용해서 시스템에서 자동으로 추가되어있슴
//메소드는 return 값이 있어야하는데 지금은 생략하고있슴
public class 제어문_반복문_09_업다운게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생
		int com=(int)(Math.random()*100)+1;
		//종료 => break, System.exit(0)
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;) //무한루프
		{
			System.out.print("1~100사이의 값 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다");
				continue; //처음으로 돌아가는
			}
			count++;
			//hint
			if(com>user)
			{
				System.out.println("높은 정수 입력(UP)");
				
			}
			else if(com<user)
			{
				System.out.println("낮은 정수 입력(DOWN)");
			}
			else //정답
			{
				System.out.println("Game Over!!");
				System.out.println("입력횟수:"+count);
				System.exit(0);
			}
		}
		
	}

}
