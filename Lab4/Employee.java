package Lab4;

public class Employee
{
    // TODO: A CompanyCar is only needed for employees whose type is "Manager";
    // staff employees should not have one.
    static int nextEmployeeNum = 1000;
    private int employeeNum;
    private String fname;
    private String lname;
    private Address address;
    private String type;               
    private Office assignedOffice;
    private CompanyCar assignedCar;
    // TODO: Add a static field to track the number of employee records.

    public Employee(String fname, String lname, Address address, String employeeType, Office office)
    {
        // TODO: Assign an employee number and initialize this employee's details.
        // Keep companyCar for managers; leave it absent for staff employees.
        this.fname = fname;
        this.lname = lname;
        this.employeeNum += nextEmployeeNum;
        this.address = address;
        this.type = employeeType;
        this.assignedOffice = office;
    }

    public static int getNumberOfEmployees()
    {
        return (employeeNum - 1000);
    }

    public String toString()
    {
        // TODO: Return a readable summary of this employee.
        return "";
    }
}
