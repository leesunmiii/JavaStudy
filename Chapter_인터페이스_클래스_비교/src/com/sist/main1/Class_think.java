package com.sist.main1;

		interface II
		{
			public void display();
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
	public class Class_think {
		
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