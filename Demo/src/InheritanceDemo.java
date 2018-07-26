class Calc1 {
	
	public int add(int i, int j ) {
		return i+j;		
	}
	
}

class AdvCalc extends Calc1 {
	
	public int sub(int i, int j ) {
		return  i-j;		
	}
	
}

class VeryAdvCalc extends AdvCalc {
	
	public int mul(int i, int j ) {
		return i*j;		
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          VeryAdvCalc o = new VeryAdvCalc();
          int result = o.add(1, 2);
          int result1 = o.mul(2, 3);
          int result3 = o.sub(4, 5);
          System.out.println(result);
          System.out.println(result1);
          System.out.println(result3);
          

}}
