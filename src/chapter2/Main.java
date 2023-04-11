package chapter2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// if文
		int num1 = 5;
		if(num1 < 10) {
			System.out.println("num1の値は10未満です");
		}
		
		// if-else文
		int num2 = 20;
		if(num2 < 10) {
			System.out.println("num2の値は10未満です");
		} else {
			System.out.println("num2の値は10以上です。");
		}
		System.out.println("if-else文の後の処理");
		
		// else if 文
		char c = 'p';
		if(c == 'a') {
			System.out.println("cの値はaです");
		} else if(c == 'b') {
			System.out.println("cの値はbです");
		} else {
			System.out.println("cの値はaでもbでもありません。");
			System.out.println("cの値はcです");
		}
	}

}
