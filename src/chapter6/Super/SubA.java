package chapter6.Super;

public class SubA extends SuperA {
	// superを介してコンストラクタを呼び出す
	public SubA() {
		System.out.println("SubA()");
	}
	
	public SubA(int a) {
		super(a); // 明示的に指定しないと引数の持たないコンストラクタ、super()が呼び出される
		System.out.println("SubA(int a)");
	}
	
	public void methodA() {
		num += 500;
	}
	public void methodB() {
		methodA(); // 4行目のメソッドの呼び出し
		print(); // スーパークラスのメソッドの呼び出し
		super.methodA(); // スーパークラスのmethodA()を呼び出し
		print(); // スーパークラスのメソッドの呼び出し
	}
}
