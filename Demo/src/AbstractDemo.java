

abstract class Human{ //abstract class
	
	abstract public void eat(); //abstract method
	
	public void sleep() {
		System.out.println("sleep");
	}
}

class Man extends Human { //concreate class
	
	public void eat() {
		System.out.println("eat");
	}
}


public class AbstractDemo {
	
	public static void main(String[] args) {
		
		Human v = new Man();
		
	}
}
