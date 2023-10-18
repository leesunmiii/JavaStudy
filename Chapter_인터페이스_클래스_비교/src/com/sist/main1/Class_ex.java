package com.sist.main1;

	class I
	{
		public void display() {};
	}
	class A extends I
	{ 
		public void display()
		{
			System.out.println("A...");
		}
	}
	class B extends I
	{ 
		public void display()
		{
			System.out.println("B...");
		}
	}
	class C extends I
	{ 
		public void display()
		{
			System.out.println("C...");
		}
	}
public class Class_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i=new A();
		i.display();
		
		I i1=new B();
		i1.display();
		
		I i2=new C();
		i2.display();
	}

}
