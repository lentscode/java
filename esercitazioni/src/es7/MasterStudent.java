package es7;

public class MasterStudent extends Student {
  private String bachelorDegree;

  public MasterStudent(
    String firstName,
    String lastName,
    int age,
    String registrationDate,
    String number,
    String course,
    double contribute, 
    String bachelorDegree
  ) {
    super(firstName, lastName, age, registrationDate, number, course, contribute, 180);

    this.bachelorDegree = bachelorDegree;
  }
}