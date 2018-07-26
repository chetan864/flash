@FunctionalInterface
 interface set{
	void show();
	default void display() {
		System.out.println("Display");
		
	}
}

class setImpl implements set{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}
	
	public void display() {
		System.out.println("new display");
	}
	
}


public class DefMethInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		set s = new setImpl();
		s.show();
		s.display();
	}

}
