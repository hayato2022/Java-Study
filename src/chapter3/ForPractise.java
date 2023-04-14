package chapter3;

public class ForPractise {
	/*
	 * for文
	 * for文では()内に繰り返し回数を示すカウント変数や
	 * カウント変数の更新なども記述する
	 * 構文
	 * for(式１; 式2; 式3){
	 * 		処理文;
	 * }
	 */
	public void forPractise1() {
		for(int count = 0; count < 5; count++) {
			System.out.print(count + " "); 
		}
	}
	
	// 式1および式3を省略した例
	public void forPractise2() {
		int count1 = 0;
		for(; count1 < 5; count1++) {  // 式1を省略した例
			System.out.print(count1 + " ");
		}
		System.out.println(); // 改行
		
		for(int count2 = 0; count2 < 5;) {  // 式3を省略した例
			System.out.print(count2++ + " "); // 処理文内でカウント変数の更新
		}
	}
}
