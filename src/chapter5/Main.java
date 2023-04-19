package chapter5;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		ConstructorPractice cp = new ConstructorPractice(100);
//		System.out.println("IDは" + cp.getId());
//		cp.setId(200);
//		System.out.println("IDは" + cp.getId());
		
		// メソッドのオーバーロード
//		Test t = new Test();
//		t.myPrint();
//		t.myPrint(8810);
//		t.myPrint("test");
//		t.myPrint(300, 400);
		
		// 可変長引数
//		Test obj1 = new Test();
//		int[] array = {10, 20, 30};
//		obj1.method("1回目");
//		obj1.method("2回目", 10);
//		obj1.method("3回目", 10, 20, 30, 40);
//		obj1.method("4回目", array);
		
		// インスタンスメンバとstaticメンバの違い
//		System.out.println(Test.instanceVal); NG
		System.out.println(Test.staticVal); //OK
//		Test.methodA();  NG
		Test.methodB();  //OK
		Test obj2 = new Test();
		System.out.println(obj2.instanceVal);  //OK
		obj2.methodA();  //OK
		obj2.methodB();  //OK
		
	}
	
		
	
	
	
//	Employee e = new Employee("aaa");
//	Employee e1 = new Employee("aaaa", 100);
//	Employee e2 = new Employee();
//	Employee e3 = new Employee(200);

}
