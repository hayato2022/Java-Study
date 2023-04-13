package chapter3;

public class DoWhilePractise {
	/*
	 * do-while文
	 * while文と同様に指定された条件が成立する(true)間、繰り返し処理を行う
	 * 構文
	 * do{
	 * 	 処理式;
	 * }while(条件式);
	 */
	
	public void doWhile() {
		int num = 0;
		do {
			System.out.print(num + " ");
			num++;
		}while(num < 5);
	}
	
}
