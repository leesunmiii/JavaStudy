
public class 문자열_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java!!";
		System.out.println(s.length()); // 문자 갯수 => 공백 포함
		//s. => 이 문자 안에 (Hello Java)
		if(s.startsWith("Hello")) //서제스트=자동완성기=검색할 때 검색창 밑에 뜨게하는
		{
			System.out.println("포함됨");
		}
	}

}
