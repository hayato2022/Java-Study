package chapter6.Abstract;

public class SubA extends SuperA {
	protected void methodA() {
		// 必須。抽象メソッドは必ず実装
	}
	// 以下でも可。アクセス修飾子は同じか公開範囲が広いものを使用
//	public void methodA() {
//		
//	}
	
	public void methodB() {
		// 任意。必要に応じて実装可能
	}
}
