package seasion3.lab1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person per = new Person();
        per.inputPerson();
        per.outputPerson();

        Student s = new Student();
        s.inputPerson();
        s.outputPerson();

        GiaoVien gv = new GiaoVien();
        gv.inputPerson();
        gv.outputPerson();
    }
}
