package com.sist.main2;

		interface Check
		{
			public void display(); //구현하는 내용이 다른 경우
			public default void add() {
				System.out.println("추가");
			};
			static void add2() {
				System.out.println("111");
			};
		}
		class D implements Check
		{ 
			public void display()
			{
				System.out.println("D...");
			}
			public void add() {
				System.out.println("삭제");
			};
			public void add1() {
				System.out.println("222");
			};
		}
		class E implements Check
		{ 
			public void display()
			{
				System.out.println("E...");
			}
		}
		class F implements Check
		{ 
			public void display()
			{
				System.out.println("F...");
			}
		}
	public class Interface_think {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Check c=new D();
			c.display();
			c.add();
			
			c=new E();
			c.display();
			c.add();
			
			c=new F();
			c.display();
		}
		
		}
