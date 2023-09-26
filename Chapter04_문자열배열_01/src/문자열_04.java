/*
 * 
 */
// substring() => 문자를 자른다
/*
 * 		"Hello Java"
 * 		 0123456789
 * 
 * 		substring(6) => 6번부터 마지막까지 => Java
 * 		substring(0,5) => 맨마지막번호 제외 => 0~4번까지 => Hello
 */
public class 문자열_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		String s1=s.substring(0,5);
		String s2=s.substring(6);
		String s3=s.substring(0,10);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String address="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
		String s5=address.substring(0,21);
		System.out.println(s5);
		String addr=address.substring(0,address.indexOf("지번"));
		String addre=address.substring(address.indexOf("지번")+3);
		String addres=address.substring(address.indexOf("신사"),address.indexOf("동")+1);
		System.out.println(addr);
		System.out.println(addre);
		System.out.println(addres);
		// 선생님이 하신것
//		int a=address.lastIndexOf(" ");
//		String addres2=address.substring(a-3,a);
//		System.out.println(addres2);
		String ext="Hello.Java.java";
		String a=ext.substring(ext.lastIndexOf(".")+1);
		System.out.println(a);
		
	}

}
