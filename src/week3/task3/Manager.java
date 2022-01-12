package week3.task3;

import week3.task3.Member;

public class Manager extends Member {

    String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager() {
    }

    public Manager(String name, int age, String phoneNumber, String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}
