package chapter3;

public class Label {
	/*
	 * 繰り返し文の先頭にラベルを指定することで、そのラベルに対応した繰り返し文を制御できる
	 * ラベル名は、識別子に規則に従って任意の名前を指定する
	 * ラベルの最後には「:」コロンを付ける
	 */
	public void labelPractise() {
		loop1:  // ラベルloop1を指定
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				System.out.println("x = " + x + "y = " + y);
				if(x == 1 && y == 1) {
					System.out.println("break文の実行");
					break loop1;
				}
			}
		}
		System.out.println("----------------------------------");
		loop2: // ラベルloop2を指定
			for(int x = 0; x < 3; x++) {
				for(int y = 0; y < 3; y++) {
					System.out.println("x = " + x + "y = " + y);
					if(x == 1 && y == 1) {
						System.out.println("continue文の実行");
						continue loop2; // ラベルloop2にcontinue
					}
				}
			}
	}
}
