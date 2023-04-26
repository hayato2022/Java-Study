package chapter6;
import java.util.ArrayList;
import java.util.HashSet;

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
		
//		// オーバーライド時に呼び出されるメンバ
//		Super obj = new SubB();
//		System.out.println(obj.x);
//		System.out.println(obj.y);
//		obj.methodA();
//		obj.methodB();
		
		// コレクション
		// Listインターフェースの実装
		// Listはサイズ変更可能な配列のようなもの
		// ArrayListの利用
		ArrayList<Integer> list = new ArrayList<>(); 
		// ArrayList<Integer>と記述していることにより、Integerオブジェクトのみを格納できるArrayListオブジェクトとなる
		Integer i1 = 10;
		int i2 = 2;
		Integer i3 = i1;
		list.add(i1);
		list.add(i2); // intデータはBoxingによりIntegerに変換
		list.add(i3); // 重複要素
		list.add(1, 5); // インデックス1番目に5を追加
		// list.add("abc"); String型を代入しようとしているためコンパイルエラーになる
		System.out.println("size: " + list.size()); // size()メソッドで格納されている要素数を返す
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " "); // データの取り出しにはget()メソッドを使用
		}
		System.out.println(); // 改行
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		
		
		// Setインターフェースの実装
		// データ構造体に要素の重複を許したくない場合に、Setインターフェースの実装クラスを利用する
		// HashSetの利用
		String[] ary = {"CCC", "AAA", "BBB"};
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(ary[0]);
		hashSet.add(ary[1]);
		hashSet.add(ary[2]);
		hashSet.add(ary[0]); // 重複している要素のため格納しない
		hashSet.add(ary[1]); // 同↑
		System.out.println("HashSet size: " + hashSet.size());
		for(String s : hashSet) {
			System.out.print(s + " ");
		}
	}

}
