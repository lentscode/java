package es7;

import es5.Person;

public abstract class Student extends Person {
	private String registrationDate;
	private String number;
	private String course;
	private double contribute;
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
}
