package chapter2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// switch文
		// 使用例１
		int num1 = 2;
		switch(num1) {
			case 1:
				System.out.println("numの値は1です");
				break;
			case 2:
				System.out.println("numの値は2です");
				
			default:
				System.out.println("これはdefaultです");
		
		}
		
		// 使用例2
		int num2 = 1;
		switch(num2) {
			case 1:
			case 2:
				System.out.println("1または2");
				break;
			case 3:
			case 4:
				System.out.println("3または4");
				break;
				
			default:
				System.out.println("これはdefaultです");
		
		}
		
		// 使用例3
		int num3 = 0;
		int a = 10;
		final int B = 20;
		switch(num3) {
//			case a:  「変数」を使用しているためコンパイルエラー
//				System.out.println("case a: の実行");
			case B:
				System.out.println("case B: の実行");
				break;
			case 30:
				System.out.println("case c: の実行");
				break;
		}
		
		String s1 = "A";
		final String s2 = "B";
		final String[] s3 = {"C"};
		switch("B") {
//			case s1:  「変数」を使用しているためコンパイルエラー
//				System.out.println("case s1: の実行");
			case s2:
				System.out.println("case s2: の実行");
				break;
//			case s3[0]: 
//				System.out.println("case s3[0]: の実行");
				//  配列名宣言時にfinalを付与しているため、配列全体の参照先は固定になるが、
				//  そこに格納された要素自体は変更が可能のため、コンパイルエラーになる
		}
		
	}

}
