package model;

public class Staff extends Person {
    private int salary;

    public Staff(String name, int age, int salary) {
        super(name, age);
        setSalary(salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата должна быть положительным числом");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s, зарплата %d руб.", super.toString(), salary);
    }
}
