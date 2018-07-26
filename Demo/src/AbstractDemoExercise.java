interface Writer{
	public abstract void write();
}

class Pen  implements Writer{
	
	public void write() {
		System.out.println("I am a pen");
	}	
	
}

class Pencil implements Writer{
	
	public void write() {
		System.out.println("I am a pencil");
	}
}

class Kit{
	
	public void doSomething(Writer p) {
		p.write();
	}
}

public class AbstractDemoExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		k.doSomething(p);
		
	}

}
