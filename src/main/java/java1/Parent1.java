package java1;

public class Parent1 {
	static String b;
	public static void main(String[] args) {
		Parent1 p1 = new Parent1(b);
		p1.printOut();
		
	}
	
	public Parent1(String b) {
		this.b =b;
	}
	
	public void printOut() {
		System.out.println(b+" Bye");
	}

}
