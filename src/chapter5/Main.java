package chapter5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ConstructorPractice cp = new ConstructorPractice(100);
		System.out.println("IDは" + cp.getId());
		cp.setId(200);
		System.out.println("IDは" + cp.getId());
	}

}
