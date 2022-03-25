package seasion3.lab1;

import java.util.Scanner;

public class Student extends Person {
    private String studentID;
    private float testScore;
    private String email;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public float getTestScore() {
        return testScore;
    }

    public void setTestScore(float testScore) {
        this.testScore = testScore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void inputPerson() {
        super.inputPerson();    //ghi đè phương thức nhập

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter student code: ");
        studentID = sc.nextLine();
        System.out.print("Please enter test score:  ");
        testScore = sc.nextFloat();
        sc.nextLine();
        System.out.print("Please enter email: ");
        email = sc.nextLine();
    }

    @Override
    public void outputPerson() {
        super.outputPerson();   //ghi đè phương thức in

        System.out.println("Your student code is: " + studentID);
        System.out.println("Your test score is: " + testScore);
        System.out.println("Your email is: " + email);
        checkTestScore(testScore);  //check học bổng
    }

    public void checkTestScore(float testScore) {
        if (testScore >= 8.0) {
            System.out.println("\nStudents are eligible for the scholarship!\n");
        } else {
            System.out.println("\nStudents are not eligible for scholarships!\n");
        }
    }
}