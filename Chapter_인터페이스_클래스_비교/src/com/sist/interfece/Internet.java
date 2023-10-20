package com.sist.interfece;

interface Animal {
    public static final String name = "동물";
    
    public abstract void move();
    public abstract void eat();
    public abstract void bark();
}
class Dog implements Animal{
    
    @Override
    public void move() {
        System.out.println("슥슥~~");
    }
    
    @Override
    public void bark() {
        System.out.println("멍멍!");
    }

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}

public class Internet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
