package java1.Overriding;

public class Child extends Parent1{

	public static void main(String[] args) {
		Child c = new Child();
		c.wish();	
	}
	
	public void wish() {
		System.out.println("Hello, Good Morning");
	}

	
}
