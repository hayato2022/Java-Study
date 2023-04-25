package chapter6.Super;

public class SuperA {
	int num;
	
	// コンストラクタ
	public SuperA() {
		System.out.println("SuperA()");
	}
	public SuperA(int a) {
		System.out.println("SuperA(int a)");
	}
	
	public void methodA() {
		num += 100;
	}
	public void print() {
		System.out.println("numの値: " + num);
	}
}
