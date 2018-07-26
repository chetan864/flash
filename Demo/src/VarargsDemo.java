
class Calc {
		
		public int add(int ... n) {
			
			int sum = 0;
			for( int a : n) {
				sum = sum + a;
				//System.out.println(sum);
			}
			
			return sum;
			
		}
	}

public class VarargsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc c = new Calc();
		int x = c.add(2,3,4,5);
		System.out.println(x);

	}

}
