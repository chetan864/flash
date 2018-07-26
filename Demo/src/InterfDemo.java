interface Demo{
   final int num =9;
	void abc();
   static void show() {
	   System.out.println("demo show");
   }
   
}

class MyImpl implements Demo {
	int num = 9;
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		int num =10;
	}

	
}
public class InterfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo.show();
	}

}
