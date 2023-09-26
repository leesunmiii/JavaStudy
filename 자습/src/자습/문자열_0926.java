
package 자습;
import java.util.Arrays;
public class 문자열_0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== toCharArray() ====");
		String a="Hello Java";
		System.out.println(a);
		char[] c=a.toCharArray();
		System.out.println(Arrays.toString(c));
		
		System.out.println("\n==== valueOf() ====");
		char[] arr= {'A','B','C','D'};
		
		System.out.println(Arrays.toString(arr));
		String s= String.valueOf(arr);
		System.out.println(s);
		
	}

}
