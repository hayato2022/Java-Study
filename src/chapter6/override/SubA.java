package chapter6.override;

// サブクラス
public class SubA extends SuperA {
	public void print(String s) {
		s = "渡された文字列は " + s + "です";
		System.out.println("SubA: " + s);
	}
//	void method() {
//		スーパークラスでは、public修飾子を指定しているがサブクラスでは指定していない
//		そのため、公開範囲が狭い扱いになりコンパイルエラーになる
//	}
}
