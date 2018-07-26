
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5;
		Integer a = new Integer(i);//wrapping, boxing
		
		int value = a.intValue();//unwrapping, unboxing
		
		Integer b = 5;//autoboxing, auto wrapping
		
		int v1 = b; // autouboxing; autounwrapping
		
		String str = "123";
		
		int i1 = Integer.parseInt(str);
		
		System.out.println(i1);
		
	}

}
