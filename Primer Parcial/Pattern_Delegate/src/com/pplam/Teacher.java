package com.pplam;

/**
 * @author derian-cordoba - 16/8/21
 * @project Pattern_Delegate
 */
public class Teacher implements Description {

    private String department;
    private double salary;

    public Teacher(String department, double salary) {
        this.setDepartment(department);
        this.setSalary(salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String description() {
        return String.format("%s-%f", this.getDepartment(), this.getSalary());
    }
}
