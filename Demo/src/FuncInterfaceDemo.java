interface Desk{
	void show();
}
public class FuncInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desk d = () ->  System.out.println("show"); 
		d.show();
		}
	}


