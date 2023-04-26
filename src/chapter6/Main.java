package chapter6;
import chapter6.inter.MyClass;
import chapter6.inter.MyInter2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Sales s = new Sales(); // サブクラスをインスタンス化
//		// サブクラスで定義したメソッドの呼び出し
//		System.out.println("clientName: " + s.getClientName());
//		// スーパークラスで定義したメソッドの呼び出し
//		System.out.println("id: " + s.getId());
//		
//		System.out.println("----------------------------------------");
//		
//		// オーバーライド
//		SuperA obj1 = new SuperA();
//		obj1.print("Java"); 
//		SubA obj2 =  new SubA();
//		obj2.print("Java");
//		// staticメンバの再定義
//		obj2.methodA();
//		obj2.methodB();
//		
//		System.out.println("----------------------------------------");
		
		// thisを介したコンストラクタの呼び出し
//		Foo f1 = new Foo();
//		Foo f2 = new Foo("Hey");
//		Foo f3 = new Foo("Bye", 200);
		
//		// superを介してメソッドを呼び出す
//		SubA obj = new SubA();
//		obj.methodB();
		
		// 継承関係にあるクラスのコンストラクタの動作
//		SubA obj1 = new SubA();
//		SubA obj2 = new SubA(10);
		
		
		// インターフェースと実装クラスの定義
		MyClass obj = new MyClass();
		System.out.println("methodA:" + obj.methodA(10));
		System.out.println("methodC:" + obj.methodC(10, 20));
		obj.methodB();  // デフォルトメソッドの呼び出し
		MyInter2.methodD();  // staticメソッドの呼び出し
		 
	}

}
