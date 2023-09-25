import java.util.*; // *은 클래스를 2개 이상 사용한다는 것
public class 배열_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		System.out.println("일 입력:");
		int day=scan.nextInt();
		//API
		Calendar cal=Calendar.getInstance();
		// 메모리 할당=> 싱글턴 (한개만 생성)
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1); //month가 0부터 시작하기 때문에 month-1 해야함
		cal.set(Calendar.DATE,day);
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week-1]+"요일입니다");
		//System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다");
		//하고싶으면 22번줄에 char[] strWeek= {' ','일','월','화','수','목','금','토'}; 해야함
	}

}
