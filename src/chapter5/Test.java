package chapter5;

public class Test {
	// メソッドのオーバーロード
	public void myPrint() {
		System.out.println("myPrint()");
	}
	
	public void myPrint(String s) {
		System.out.println("myPrint(String s): " + s);
	}
	
	public void myPrint(int a) {
		System.out.println("myPrint(int a): " + a);
	}
	
	public void myPrint(int a, int b) {
		System.out.println("myPrint(int a, int b): " + a + " " + b);
	}
}
