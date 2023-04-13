package chapter3;

public class WhilePractise {
	/*
	while文　
	指定された条件が成立する(true)間、繰り返し処理を行う
	*/
	public void whilePractice() {
		int num = 0;
		while(num < 5) {  // numの値が5未満の間以下を繰り返す
			System.out.print(num + " ");
			num++;  // numの値に1を加算
		}
	}
}
