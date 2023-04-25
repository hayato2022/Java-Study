package chapter6;
import chapter6.This.Foo;

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
		Foo f1 = new Foo();
		Foo f2 = new Foo("Hey");
		Foo f3 = new Foo("Bye", 200);
	}

}
