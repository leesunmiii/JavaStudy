// 1~10 => 짝수만 출력
public class 제어문_반복문_02_for_while_do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== for ====");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.println(i+" ");
		}
		System.out.println("\n==== while ====");
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
			}
			i++;
		}
		System.out.println("\n==== do~while ====");
		i=1;
		do {
			if(i%2==0)
			{
				System.out.println(i+" ");
		    }
			i++;
		}while(i<=10);
		// 반복문 안에 조건문 형태가 제일 많음
	}

}
