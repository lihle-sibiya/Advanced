package lesson3;

public class Employee {

      public int empId;
    public String name;
    public String ssn;
    public double salary;

    public Employee() {
    }

    public Employee(int i, String ron, String ab123, int i1) {
    }

    public void changeName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }


}
