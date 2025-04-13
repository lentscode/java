package es7;

public class BachelorStudent extends Student {
  private final String highSchool;

  public BachelorStudent(
    String firstName,
    String lastName,
    int age,
    String registrationDate,
    String number,
    String course,
    double contribute, 
    String highSchool
  ) {
    super(firstName, lastName, age, registrationDate, number, course, contribute, 180);

    this.highSchool = highSchool;
  }

  public String getHighSchool() {
    return highSchool;
  }
}