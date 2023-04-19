package chapter5;

public class Test {
	// インスタンスメンバとstaticメンバの違い
	int instanceVal = 100;
	static int staticVal = 200;
	void methodA() {
		System.out.println("methodA(): " + instanceVal);
	}
	
	static void methodB() {
		System.out.println("methodB(): " + staticVal);
	}
	
	// staticメンバのクラス内でのアクセス
	int methodC() {
		return instanceVal;  // インスタンスメソッド→インスタンス変数のためOK
	}
	
	int methodD() {
		return staticVal;  // インスタンスメソッド→static変数のため OK
	}
	
//	static methodE() {
//		return instanceVal;  staticメソッド→インスタンス変数のためNG
//	}
	
	static int methodE() {
		return staticVal;  // staticメソッド→static変数のためOK
	}
	
	static int methodF() {
		Test obj = new Test();		// staticメソッド内で自クラスをインスタンス化し、
		return obj.instanceVal; 	//  変数obj.インスタンス変数でアクセスしているためOK
	}
	
	
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
	
	
	// 可変長引数
	public void method(String s, int... a) {
		System.out.println(s + "サイズ" + a.length);
		for(int i : a) {
			System.out.println(" 第2引数の値 :" + i);
		}
	}
	
	
	
	
}
