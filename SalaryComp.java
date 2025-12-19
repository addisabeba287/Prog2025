package day7;

import java.util.Comparator;

public class SalaryComp implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		return Double.compare(o1.getSalary(), o2.getSalary());
	}
}
