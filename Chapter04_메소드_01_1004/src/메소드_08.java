/*
 * 		increment()  => num : 1
 * 		increment()	=>  num : 1 
 * 		increment()	=>  num : 1
 */
public class 메소드_08 {
	static void increment()
	{
		int num=1; // 지역변수 ( 메소드 안에서만 사용)
		System.out.println(num);
		num++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment();
		increment();
		increment();
	}

}
