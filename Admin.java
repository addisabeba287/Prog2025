package day6;

public class Admin extends Employee{

	@Override
	public double calculatSalary(int stundePerMonth , double salaryPerH) {
		return stundePerMonth * salaryPerH;
	}

}
