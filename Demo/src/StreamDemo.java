import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <= 100 ; i++ ) {
			
			list.add(i);
		}
		
		list.stream().filter(i -> {
			System.out.println("Hi");
			return true;
		}).findFirst().orElse(0);
		
		
	}

}
