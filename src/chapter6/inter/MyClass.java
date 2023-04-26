package chapter6.inter;

public class MyClass implements MyInter, MyInter2 {
	public double methodA(int num) {
		return num * 0.3;
	}
	
	public int methodC(int val1, int val2) {
		return val1 + val2;
	}
}
