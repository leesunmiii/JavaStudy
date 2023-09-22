/*
 * 
 * 		제어문 : 프로그램을 제어 => 반복수행, 선택한 부분만 출력
 * 				사용자 요청 처리
 * 		for : 반복횟수 ㅇ => 화면 UI
 * 				=> 웹 프로그램(Front)
 * 				형식)     1     2     4
 * 					for(초기값;조건식;증가식)
 * 					{       3
 * 						반복수행문장
 * 					}
 * 				순서 : 1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 - ... (2 : false면 종료)
 * 				초기값 => 조건검색 => true => 반복문장 수행 => 초기값 증가 => 조건검색 => ...
 * 								  false => 종료
 * 				------------------------------------------------------------------
 * 		2차 for (중첩조건문)
 * 				=> 알고리즘 (정보처리)
 * 				   정렬, 검색 ...
 * 				형식)
 * 				  		 1     2     7
 * 					for(초기값;조건식;증가식)
 * 					{   
 * 						------------------------
 * 						      3    4    6
 * 						for(초기값;조건식;증가식)
 * 						{         5
 * 							한줄에 출력 내용
 * 						}
 * 						-----------------------
 * 					}
 * 
 * 		while : 반복횟수가 없는 경우 => 서버 프로그램(Back)
 *  			=> 크롤링(외부에서 데이터 긁어올때), 데이터베이스, 파일읽기
 *  			=> 선조건 (수행을 못할수도 있다)
 *  			형식)
 *  				초기값  ------------1
 *  				while(조건식)-------2 => true/false
 *  				{
 *  					반복수행문장 -----3
 *  					증가식  --------4		
 *  				}
 *  				while true => 무한루프
 *  	do~while : 무조건 한 번 이상 수행  ____74p
 *  				=> 웹 (사용빈도 거의 없다)
 *  				=> 후조건 (한번은 반드시 수행)
 *  				형식)
 *  					초기값 -----------1
 *  					do{
 *  						반복수행문장----2
 *  						증가식 --------3
 *  					  }while(조건식); => 증가된 값을 조건 검색
 *  
 *  					int i=1;
 *  					do{
 *  						system.out.println(i); 1,2...10
 *  						i++; i=2, i=3...i=10,i=11
 *  					   }while(i<=10);	
 *  			
 */
public class 제어문_반복문_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== for ===");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println("\n==== while ====");
		int i=1;
		while(i<=10)
		{
			System.out.println(i+" ");
			i++;
		}
		System.out.println("\n==== do~while ====");
		i=1;
		do {	
			System.out.println(i+" ");
			i++;
		}while(i<=10);
	}
	

}
