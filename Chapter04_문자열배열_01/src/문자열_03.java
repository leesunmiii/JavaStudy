/*
 * 			String toUppercase() => 대문자 변환
 * 			String toLowercase() => 소문자 변환
 */
public class 문자열_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Java";
		//msg=msg.toUpperCase(); // msg.toUpperCase();만 하면 안바뀜 msg=msg.toUpperCase(); 저장을 해야 바뀜
		System.out.println(msg.toUpperCase());// msg 원본은 그대로 유지함. 저장을 안했기때문
		//msg=msg.toLowerCase();
		System.out.println(msg);
		// 처리 => 다시 저장하지 않는 경우에는 원본을 유지한다.
		// 대문자로 변환하는 것은 가끔
		// 오라클에서 대소문자 구분
	}

}
