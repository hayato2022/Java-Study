package chapter5;

public class Employee {
	int id;
	String name;
	
	// コンストラクタのオーバーロード
	public Employee() {
		System.out.println("Employee()");
	}
	
	public Employee(String name) {
		System.out.println("Employee(String name)");
	}
	
	public Employee(int id) {
		System.out.println("Employee(int id)");
	}
	
	public Employee(String name, int id) {
		System.out.println("Employee(String name, int id)");
	}
}
