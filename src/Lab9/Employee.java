package Lab9;

public class Employee {
    private int empID;
    private string name;
    private string position;
    private double salary;

//
    public Employee(int empID, string name, string position, double salary) {
        this.empID = empID;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    public string getPosition() {
        return position;
    }

    public void setPosition(string position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", name=" + name +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
