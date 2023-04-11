package chapter2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// if文のネスト(入れ子)
		int a = 10;
		if(a > 0) {
			System.out.println("aは正の値です");
			if(a % 2 == 0) {
				System.out.println("aは偶数です");
			}
		}else {
			if(a == 0) {
				System.out.println("aは0です");
			}else {
				System.out.println("aは負の値です");
			}
		}
		
	}

}
