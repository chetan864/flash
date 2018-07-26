
class A {
	int j;
	public void show(){
		System.out.println(j);
	}
}

class B extends A{
	
	int i ;
	public void show() {		
		super.j = 8;
		super.show();
		System.out.println("B");
	}
}


public class SuperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B result = new B();
		result.show();
		int[] a = new int[4];
		for(int k : a) {
			System.out.print(" "+k);
		}
		
	
		
		
	}

}
