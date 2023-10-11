import java.util.*;
class A
{
	static int[] arr=new int[5]; //static 있으면 메모리가 하나여서 System.out.println(Arrays.toString(b.arr));와 System.out.println(Arrays.toString(a.arr)); 값이 같아짐
	// 클래스 영역에는 선언만 가능하다
	// 여기서 코딩 못할 때 쓰는게 생성자 블록 (밑에꺼)A() {}
	A() {
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class MainClass_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A(); // arr=> 저장
		System.out.println(Arrays.toString(a.arr));
		
		A b=new A(); //arr A랑은 다른 따로 저장
		System.out.println(Arrays.toString(b.arr));
		System.out.println(Arrays.toString(a.arr));
	}

}
