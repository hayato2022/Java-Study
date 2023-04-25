package chapter6;
import chapter6.Extends.Sales;
import chapter6.override.SubA;
import chapter6.override.SuperA;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sales s = new Sales(); // サブクラスをインスタンス化
		// サブクラスで定義したメソッドの呼び出し
		System.out.println("clientName: " + s.getClientName());
		// スーパークラスで定義したメソッドの呼び出し
		System.out.println("id: " + s.getId());
		
		System.out.println("----------------------------------------");
		
		// オーバーライド
		SuperA obj1 = new SuperA();
		obj1.print("Java"); 
		SubA obj2 =  new SubA();
		obj2.print("Java");
	}

}
