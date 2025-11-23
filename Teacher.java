package day6;

public class Teacher extends Employee {

	private double bonus= 0.01;
	@Override
	public double calculatSalary(int stundePerMonth , double salaryPerH ) {
		return stundePerMonth * salaryPerH * bonus;
	}

}
