package seasion3.lab1;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String birth;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //contructor đủ tham số
    public Person(String name, String gender, String birth, String address) {
        super();
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }
    //contructor không tham số
    public Person() {
        super();
    }

    public void inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nPlease enter name: ");
        name = sc.nextLine();
        System.out.print("Please enter gender: ");
        gender = sc.nextLine();
        System.out.print("Please enter birth: ");
        birth = sc.nextLine();
        System.out.print("Please enter address: ");
        address = sc.nextLine();
    }

    //goi output truyen gia tri vua dien
    public void outputPerson() {
        System.out.println("\nYour name is: " + name);
        System.out.println("Your gender is: " + gender);
        System.out.println("Your birth is: " + birth);
        System.out.println("Your address is: " + address);
    }
}
