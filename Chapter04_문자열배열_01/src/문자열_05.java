/*
 * 	split(문자별로 나눌 때 사용) => String[]
 */
public class 문자열_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String actor="하정우,임시완,배성우,김상호";
//		String[] movie=actor.split(",");
//		System.out.println(movie[0]);
//		
//		String actor="하정우|임시완|배성우|김상호";
//		String[] movie=actor.split("\\|");
//	
//		System.out.println(movie[0]);
		String name=" Hello Java ";
		System.out.println(name.trim()); // 입력 시
		// 좌우에 있는 공백 제거
		// replace => 원하는 문자를 변경
		String s7="Hello Java";
		System.out.println(s7.replace('a','b'));
		System.out.println(s7=s7.replace("Java","Oracle"));
		System.out.println(s7);
		
		// 문자열 결합
		String msg="나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		if(msg.length()>20)
		{
			//msg=msg.substring(0,20)+"...";
			msg=msg.substring(0,20).concat("...");
			
		}
		System.out.println(msg);

	}
}
