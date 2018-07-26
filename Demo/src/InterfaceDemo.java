interface Abc{
	void show();
}

class Implementor implements Abc{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("anything");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Implementor();
	
		obj.show();
	}

}
