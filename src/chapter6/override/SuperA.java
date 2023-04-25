package chapter6.override;

// スーパークラス
public class SuperA {
	public void print(String s) {
		System.out.println("SuperA print: " + s);
	}
	
	public void method() {
		
	}
	
	public void methodA() {
		System.out.println("SuperA:methodA()");
	}
	
	public static void methodB() {
		System.out.println("SuperA:methodB()");
	}
}
