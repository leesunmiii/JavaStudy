
public class 복합대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=27;
		a<<=3;
		System.out.println("a="+a);
		a=27;
		a>>=3;
		System.out.println("a="+a);
		// a=33;  ==> 왼쪽으로 2이동, 오른쪽으로 2이동
		a=33;
		a<<=2;
		System.out.println(a);
		a=33;
		a>>=2;
		System.out.println(a);
	}

}
