import java.util.Scanner;

public class 문자열_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍길동";
		System.out.println(name);
		char a='홍';
		char b='길';
		char c='동';
		System.out.println(a+""+b+c);
		String add="서울특별시 마포구 성미산로 198 1F";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어:");
		String findData=scan.next();
		System.out.println(findData);
	}

}
