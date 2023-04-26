package chapter6.override;

public class SubB extends Super {
	public static String x = "Sub: x";
	public String y = "Sub: y";
	public static void methodA() {
		System.out.println("Sub: methodA()");
	}
	
	public void methodB() {
		System.out.println("Sub: methodB()");
	}

}
