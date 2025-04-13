package es7;

import es5.Person;

public abstract class Student extends Person {
	private final String registrationDate;
	private final String number;
	private String course;
	private final double contribute;
	private int cfu;

	public Student(
		String firstName,
		String lastName,
		int age,
		String registrationDate,
		String number,
		String course,
		double contribute,
		int cfu
	) {
		super(firstName, lastName, age);

		this.registrationDate = registrationDate;
		this.number = number;
		this.course = course;
		this.contribute = contribute;
		this.cfu = cfu;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public String getNumber() {
		return number;
	}

	public String getCourse() {
		return course;
	}

	public double getContribute() {
		return contribute;
	}

	public int getCfu() {
		return cfu;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}
}
