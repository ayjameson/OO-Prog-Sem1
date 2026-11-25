package Q2;
public class Employee extends Person {
    private int annualSalary;

    public Employee(String name, int salary)
    {
        super(name);
        this.annualSalary = salary;
    }

    @Override
    public String getDescription()
    {
        return "An employee with a salary of " + annualSalary;
    }
}
