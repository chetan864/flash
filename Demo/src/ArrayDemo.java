
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,8,7,6};
		int b[] = {5,4,3};
		int c[] = {1,2};
		
		int d[][] = { {9,8,7,6},
					  {5,4,3},
					  {1,2}
				      };
		
		for(int k[] : d) {
			for(int l : k) {
				System.out.print(" "+l);
			}
			System.out.println();
		}
		
		
	}

}
