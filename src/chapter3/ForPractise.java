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
	
	/*
	 * 拡張for文
	 * 拡張for文は、配列やコレクションの全要素を順番に取り出して処理をする場合に使用され、
	 * for文に比べて簡素化されている
	 * 構文
	 * for(変数宣言 : 参照変数名) {
	 *  処理文;
	 *  }
	 */
	public void expansionFor() {
		char[] array = {'a', 'b', 'c', 'd', 'e'};
		// 配列arrayの全要素を順番に取り出し、出力する
		for(char c : array) {
			System.out.print(c + " ");
		}
	}
	
	/*
	 * 制御文のネスト
	 */
	public void nest() {
		// 外側の制御文 for文
		for(int i = 1; i < 10; i++) {
			// 内側の制御文 if文
			if((i % 4) == 0) {
				System.out.println(i + "は4の倍数です");
			}
		}
	}
	
	
}
