package com.sist.main2;

	interface I
	{
		public void display(); //구현하는 내용이 다른 경우
	}
	class A implements I
	{ 
		public void display()
		{
			System.out.println("A...");
		}
	}
	class B implements I
	{ 
		public void display()
		{
			System.out.println("B...");
		}
	}
	class C implements I
	{ 
		public void display()
		{
			System.out.println("C...");
		}
	}
public class Interface_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i=new A();
		i.display();
		
		i=new B();
		i.display();
		
		i=new C();
		i.display();
	}

}
