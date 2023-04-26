package chapter6.inter;

public interface MyInter {
	double methodA(int num);
	default void methodB() {
		System.out.println("methodB()");
	}
}
