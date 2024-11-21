package abstractassignment;

public class Contractor extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj = new Contractor();
		obj.calculateSalary();		
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		int payment = 200;
		int hrs = 100;
		int salary = payment * hrs;
		System.out.println("Calculated Salary: "+ salary);
	}

}
