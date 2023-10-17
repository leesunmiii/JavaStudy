class Test{
	static double PI=3.14;
	int left, right;
	
	public void a(int left, int right){
		this.left=left;
		this.right=right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println(this.left*this.right/2);
	}
}
public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test(10,20);
		t.sum();
		t.avg();
		
	}

}
