package java1;

public class Child1 extends Parent1{
	static String a;
	public static void main(String args[]) {
		Child1 c1 = new Child1(a);
		c1.a = "HELLO";
		c1.print();
		c1.printOut();
	}
	
	public Child1(String a) {
		super("Bye");
		this.a=a;
	}
	
	public void print() {
		System.out.println(a);
	}
}
