/*
 *	변수 : 변수명 => 소문자로 시작한다
 *		  식별자 (명명규칙)
 *		  1. 알파벳이나 한글로 시작한다
 *			---- 대소문자 구분
 *			Abc abc ABC
 *  	
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte _byte=127;
		int _int=20000;
		long _long=20000; //20000L
		float _float=10.5f;
		double _double=100; //100.0
		char _char=65; // 'A'가 나오는 유는 자바 자체에서 char=65 값을 A로 설정해놓아서
		boolean _boolean=true;
		
		System.out.println("_byte:"+_byte);
		// + (산술) + (문자열 결합)
		System.out.println("_int:"+_int);
		System.out.println("_long:"+_long);
		System.out.println("_float:"+_float);
		System.out.println("_double:"+_double);
		System.out.println("_char:"+_char);
		System.out.println("_boolean:"+_boolean);
	}

}
