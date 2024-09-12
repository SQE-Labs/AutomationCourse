package encapsulationInheritance;

import java.util.Scanner;

public class Employee {
	private int employee_id;
	private String employee_name;
	private double employee_salary;

	public Employee(int id, String name, double salary) {
		this.employee_id = id;
		this.employee_name = name;
		this.employee_salary = salary;
	}

	public void set_id(int id) {
		this.employee_id = id;
	}

	public void set_name(String name) {
		this.employee_name = name;
	}

	public int get_id() {
		return employee_id;

	}

	public String get_name() {
		return employee_name;
	}

	public double get_salary() {
		return employee_salary;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(101, "rahul", 75000);
		System.out.println("employee id " + emp.get_id());
		emp.set_id(102);
		System.out.println("updated employee id " + emp.get_id());
	}

}
