import java.util.Arrays;

public class 배열_03_깊은복사2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] arr2=arr.clone();
		//            -------- arr의 메모리에 있는 모든 내용을 copy해서 새로운 메모리에 저장
		//깊은 복사
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr);
		System.out.println(arr2);
		// arr의 값을 바꿨을 때
		arr[0]=100;
		arr[1]=200;
		arr[3]=300;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		// arr2 clone을 다시 했을 때
		arr2=arr.clone();
		System.out.println(Arrays.toString(arr2));
		// clone => prototype
		
	}

}
