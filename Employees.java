package day7;

import java.util.Objects;

public class Employees implements Comparable<Employees> {

	private int id;
	private String name;
	private double salary;

	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Employees))
			return false;
		Employees e = (Employees) o;
		return id == e.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public String toString() {
		return id + " " + name + " " + salary;
	}

	@Override
	public int compareTo(Employees other) {
		return this.name.compareTo(other.name);
	}
}
