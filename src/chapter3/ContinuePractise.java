package chapter3;

public class ContinuePractise {
	/*
	 * continue文
	 * 実行中の繰り返し処理を中断するのではなく、
	 * 繰り返し内の残りの処理をスキップして条件式に制御を映し、
	 * さらに。繰り返し処理を続けるときに使用する
	 * continue文は、while文やfor文などの繰り返し文内で使用できる
	 */
	
	// continue文の使用例
	public void continuePractise() {
		for(int i = 1; i < 10; i++) {
			if((i % 3) == 0) {
				System.out.println("処理をスキップします");
				continue;
			}
			System.out.println("i = " + i);
		}
		System.out.println("for文の後の処理");
	}
}
