package chapter5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		ConstructorPractice cp = new ConstructorPractice(100);
//		System.out.println("IDは" + cp.getId());
//		cp.setId(200);
//		System.out.println("IDは" + cp.getId());
		
		// メソッドのオーバーロード
		Test t = new Test();
		t.myPrint();
		t.myPrint(8810);
		t.myPrint("test");
		t.myPrint(300, 400);
		
	}
	
	Employee e = new Employee("aaa");
	Employee e1 = new Employee("aaaa", 100);
	Employee e2 = new Employee();
	Employee e3 = new Employee(200);
	

}
