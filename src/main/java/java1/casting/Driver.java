package java1.casting;

public class Driver {

	public static void main(String[] args) {
		
//		Upcasting
		Child1 c1 = new Child1();
		c1.childClass();
		c1.parendClass();
		
		Parent1 p1 = c1;
		p1.parendClass();
//		p1.childClass();		we can't inherit the members of subclass from the super class reference.
		
//		Downcasting
		
		Parent1 p2 = new Parent1();
		p2.parendClass();
		
		
		
	
	}

}
