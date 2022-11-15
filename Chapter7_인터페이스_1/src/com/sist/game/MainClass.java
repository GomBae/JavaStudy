package com.sist.game;
interface 동물{
	void eat(); //public abstract void eat()
	void run();
	
	default void aaa() {//default 를 설정하면 필요하면 구현하고 필요하지 않으면 구현할 필요 없게 만든다
		
	}
	
}
class 말 implements 동물{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
