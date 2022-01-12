package week3.task3;

public class Task3 {

    public static void main(String[] args) {

        Employee janis = new Employee("Janis", 37, "26484575", "Riga", 1000, "teacher");
        Manager dace = new Manager("Dace", 29, "254588778", "Jelgava", 1200, "unknown");

        janis.printSalary();
        dace.printSalary();

    }

}
