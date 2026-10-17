package Lab4;

public class Office
{
    static int nextRoomNumber = 100;
    private int roomNumber;
    private int employeeCount = 0;
    private Employee[] employees = new Employee[2];

    public Office()
    {
        setRoomNumber(nextRoomNumber);
        nextRoomNumber++;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber()
    {
        return this.roomNumber;
    }

    public int getNumberOfEmployees()
    {
        return this.employeeCount;
    }

    public Employee getEmployee(int index)
    {
        // TODO: Return the employee record at the requested index.
        return this.employees[index];
    }

    public void setEmployee(Employee[] employees)
    {
        this.employees = employees;
    }

    public void addEmployee(Employee employee)
    {
        if(employeeCount < 2)
                {
                    employees[employeeCount] = employee;
                    employeeCount++;
                }
        else
        {
            System.out.println("Maximum number of employees assigned");
        }
    }

    public String toString()
    {
        // TODO: Return a readable summary of this office.
        return "";
    }
}
