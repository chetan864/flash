class Fruit{
	void show() {
		System.out.println("A");
	}
}




public class AnonymousInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fruit a = new Fruit() {
        	void show(){
        		System.out.println("B");
        	}
        };
        a.show();
	}

}
