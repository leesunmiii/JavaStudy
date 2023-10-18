package com.sist.main2;
class Object
{
	public void display() {};
	
}
class A extends Object
{ 
	public void display()
	{
		System.out.println("A...");
	}
}
class B extends Object
{ 
	public void display()
	{
		System.out.println("B...");
	}
}
class C extends Object
{ 
	public void display()
	{
		System.out.println("C...");
	}
}
//interface I
//{
//	public void display();
//}
//class A implements I
//{ 
//	public void display()
//	{
//		System.out.println("A...");
//	}
//}
//class B implements I
//{ 
//	public void display()
//	{
//		System.out.println("A...");
//	}
//}
//class C implements I
//{ 
//	public void display()
//	{
//		System.out.println("A...");
//	}
//}
public class Interface_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=new A();
		o.display();
		
		Object o1=new B();
		o1.display();
		
		Object o2=new C();
		o2.display();
	}

}
