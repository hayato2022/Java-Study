package chapter6;
import chapter6.override.SubB;
import chapter6.override.Super;

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
//		MyClass obj = new MyClass();
//		System.out.println("methodA:" + obj.methodA(10));
//		System.out.println("methodC:" + obj.methodC(10, 20));
//		obj.methodB();  // デフォルトメソッドの呼び出し
//		MyInter2.methodD();  // staticメソッドの呼び出し
				
		// 参照型の暗黙型変換
		// 抽象クラスとそのクラスを継承したサブクラス
//		// スーパークラスの変数にサブクラスのオブジェクトを代入
//		Super1 obj = new MyClass();
//		obj.method(10, 20); // スーパークラスのメソッドの呼び出しOK
//		obj.print();  // サブクラスのメソッドの呼び出しOK
		
		/*
		 * instanceof演算子
		 * instanceof演算子は、ある特定のオブジェクトが特定の型を持つがどうかを
		 * 判定し、結果をboolean値で返す
		 * 参照変数名 instanceof クラス名またはインターフェース名
		 */
//		C obj = new C();
//		System.out.println(obj instanceof A);
//		System.out.println(obj instanceof B);
//		System.out.println(obj instanceof C);
//		System.out.println(obj instanceof D);
		
		// オーバーライド時に呼び出されるメンバ
		Super obj = new SubB();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.methodA();
		obj.methodB();
	}

}
