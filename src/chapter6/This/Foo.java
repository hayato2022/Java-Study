package chapter6.This;

public class Foo {
	String str;
	int num;
	
	public Foo() {
		this("no-deta");
	}
	
	public Foo(String str) {
		this(str, 1);
	}
	
	public Foo(String str, int num) {
		this.str = str;
		this.num = num;
		System.out.println("String: " + this.str);
		System.out.println("int: " + this.num);
	}
}
