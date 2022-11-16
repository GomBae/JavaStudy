package com.sist.main;
interface Printable {
    String toner=""; //(상수라서 값을 지정해줘야함)
    abstract void print();
}
public class test implements Printable {
    public static void main(String[] args) {
//        new Printable();
        new test();
    }

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
    
}

