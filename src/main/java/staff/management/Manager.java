package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String department;


    public Manager(String name, String NINumber, double salary, String department) {
        super(name, NINumber, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
