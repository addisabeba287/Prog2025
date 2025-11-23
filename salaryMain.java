package day6;

public class salaryMain {
	
	public static void main(String[] args) {
		
		Employee emn = new Teacher();
		Employee emnA = new Admin();

		System.out.println(" Teacher Salary: " + emn.calculatSalary(160, 50));
		System.out.println(" Admin Salary: " + emnA.calculatSalary(160, 30));
	}

}
