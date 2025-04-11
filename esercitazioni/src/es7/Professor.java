package es7;

import es5.Person;

public class Professor extends Person {
	private final String hiringDate;
	private String role;
	private String department;
	private double wage;

	public Professor(
		String firstName,
		String lastName,
		int age,
		String hiringDate,
		String role,
		String department,
		double wage
	) {
		super(firstName, lastName, age);

		this.hiringDate = hiringDate;
		this.role = role;
		this.department = department;
		this.wage = wage;
	}

	public String getHiringDate() {
		return hiringDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0) return;

		this.wage = wage;
	}
}
