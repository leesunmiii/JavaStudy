
public class 제어문_반복문_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 웹에서는 2차 for문은 사용하지 않는다
		// 코테에서 많이 나옴 =>sort, 중복없는 난수 발생...
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println("i="+i+",j="+j);
			}
			System.out.println();
		}
	}

}
