package Lab4;

public class Employee
{
    static int nextEmployeeNum = 1000;
    static int numberOfEmployees = 0;
    private int employeeNum;
    private String fname;
    private String lname;
    private Address address;
    private String type;               
    private String assignedCar;

    public Employee(String fname, String lname, Address address, String employeeType)
    {
        this.fname = fname;
        this.lname = lname;
        this.employeeNum = nextEmployeeNum;
        this.address = address;
        this.type = employeeType;
        nextEmployeeNum++;
        numberOfEmployees++;
    }

    public int getNumberOfEmployee()
    {
        return this.employeeNum;
    }

    public static int getNumberOfEmployees()
    {
        return numberOfEmployees;
    }

    public String getFname()
    {
        return this.fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return this.lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public Address getAddress()
    {
        return this.address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public String getType()
    {
        return this.type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getAssignedCar()
    {
        return this.assignedCar;
    }

    public void setAssignedCar(String assignedCar)
    {
        this.assignedCar = assignedCar;
    }

    public String toString()
    {
        if(type.equalsIgnoreCase("Manager"))
        {
            return "Employee [First Name = " + fname + ", Last Name = " + lname + " Address = " + address + ", Employee Number = " + employeeNum
            + ", Employee Type = " + type + "Company Car = " + assignedCar + "]";
        }
        else
        {
            return "Employee [First Name = " + fname + ", Last Name = " + lname + " Address = " + address + ", Employee Number = " + employeeNum
            + "Employee Type = " + type + "]";
        }
    }
}
