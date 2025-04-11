package es5;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(
		String firstName,
		String lastName,
		int age
	) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.equals("")) {
			return;
		}

		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.equals("")) {
			return;
		}

		this.lastName = lastName;
	}

	public void setAge(int age) {
		if (age < 0) {
			return;
		}

		this.age = age;
	}
}
