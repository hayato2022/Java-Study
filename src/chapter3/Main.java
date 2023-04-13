package chapter3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		WhilePractise wp = new WhilePractise();
		wp.whilePractice();
		
		System.out.println("  ");		
		
		DoWhilePractise dw = new DoWhilePractise();
		dw.doWhile();
		System.out.println("  ");
		
		// while文とdo-while文の違い
		// while文の場合
		int count = 5;
		while(count != 5 && count > 0) {
			System.out.println("while  : count = " + count);
			count--;
		}
		
		// do-while文の場合
		count = 5;
		do {
			System.out.println("do-while  : count = " + count);
			count--;
		} while (count != 5 && count > 0);
	}

}
