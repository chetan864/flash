class outer {
	int a;
	int b;
	
	static class Inner {
		
		int c;
		int d;
		
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		outer o = new outer();
		outer.Inner il = new outer.Inner();
		
	
	
	int nums[] = {8,9,4,5};
	
	for(int i=0;i<4;i++) {
		System.out.println(nums[i]);
	}
	}
}
