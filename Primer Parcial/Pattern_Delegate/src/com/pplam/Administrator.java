package com.pplam;

/**
 * @author derian-cordoba - 16/8/21
 * @project Pattern_Delegate
 */
public class Administrator implements Description {

    private String position;
    private double salary;

    public Administrator(String position, double salary) {
        this.setPosition(position);
        this.setSalary(salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String description() {
        return String.format("%s-%f", this.getPosition(), this.getSalary());
    }
}
