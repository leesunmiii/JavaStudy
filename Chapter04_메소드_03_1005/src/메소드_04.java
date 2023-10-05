// 로또 => 6개 정수 중복없이 추출 (1~45) => 출력
//        -------------                ---
public class 메소드_04 {
	static int[] getRand(int count)
	{
		int[] lotto=new int[count];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) //중복확인
			{
				if(lotto[i]==lotto[j])
				{
					i--; // 같은 위치에 난수를 발생시키려고.. 2번째에서 중복되면 다시 2번째 입력하라는 뜻
					break;
				}
			}
		}
		return lotto;
	}
	static void print(int[] lotto)
	{
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=getRand(6);
		print(lotto);
//		int[] lotto=new int[6];
//		for(int i=0;i<lotto.length;i++)
//		{
//			lotto[i]=(int)(Math.random()*45)+1;
//			for(int j=0;j<i;j++) //중복확인
//			{
//				if(lotto[i]==lotto[j])
//				{
//					i--; // 같은 위치에 난수를 발생시키려고.. 2번째에서 중복되면 다시 2번째 입력하라는 뜻
//					break;
//				}
//			}
//		}
//		for(int i:lotto)
//		{
//			System.out.print(i+" ");
//		}
//	}

	}
}
