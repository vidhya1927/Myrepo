package abstractassignment;

public class FullTimeEmployee extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee obj = new FullTimeEmployee();
		obj.calculateSalary();
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		int payment = 200;		
		int fulltimeamt = payment * 8;
		System.out.println("Full time Employee: "+ fulltimeamt);
	}

}
