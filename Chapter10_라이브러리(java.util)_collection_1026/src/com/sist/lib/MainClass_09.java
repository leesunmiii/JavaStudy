package com.sist.lib;
import java.util.*;
interface I
{
	public void display();
}
class A implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A:display() Call...");
		
	}
	
}
class B implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("B:display() Call...");
		
	}
	
}
class C implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("C:display() Call...");
		
	}
	
}
class D implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("D:display() Call...");
		
	}
	
}
class Container
{
	private Map<String,I> map=new HashMap<String,I>();
	public Container()
	{	// 스프링이 작업하는 방식 : 싱글턴 (하나의 메모리로 작업) 관련된 클래스를 모아서 getBean을 통해 가져옴
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D());
	}
	public I getBean(String key)
	{
		return map.get(key);
	}
}
public class MainClass_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		I i=c.getBean("a"); 
		i.display();
		
		System.out.println("i="+i);
		i=c.getBean("b");
		i.display();
		
		System.out.println("i="+i);
	}

}
