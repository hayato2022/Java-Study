package chapter3;

public class BreakPractise {
	/*
	 * break文
	 * 実行中の繰り返し処理を中断して抜け出すときに使用する
	 * ループから抜け出した後は、その繰り返し処理の次の実行文に制御が移る
	 */
	public void breakPractise() {
		for(int i = 0; ; i++) {  // 式2が省略されていうので無限ループ
			if(i == 3) {
				break;
			}
			System.out.println("i = " + i);
		}
		System.out.println("for文の後の処理");
	}
	
}
