package com.se;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i1 = 100;
		Integer obj = i1; // Boxing
		int i2 = obj; // Unboxing
		method(i2);
		
 	}
	static void method(Integer obj) {
		int i = obj + 100;
		System.out.println(i);
	}

}
