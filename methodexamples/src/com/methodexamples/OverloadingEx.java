package com.methodexamples;

public class OverloadingEx {
	public void show(int i, long l) {
		System.out.println("X");
	}

	public void show(long l, int i) {
		System.out.println("Y");
		
	}

	public static void main(String[] args) {
		OverloadingEx overloadObj = new OverloadingEx();
		overloadObj.show(10, 200L);
	}
}
