

public class Employee {
	
	int eid;
	int salary;
	static String ceo;
	
	
	Employee(){
		salary = 6000;
	}
	
	void show(){
		System.out.println(eid + ":" + salary + ":" + ceo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.eid = 1;
		e1.show();
		Employee e2 = new Employee();
		e2.eid = 2;
		e2.show();
		Employee.ceo="nikita";
				
	}

}
