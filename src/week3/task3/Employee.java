package week3.task3;

import week3.task3.Member;

public class Employee extends Member {

    String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Employee() {
    }

    public Employee(String name, int age, String phoneNumber, String address, int salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}
