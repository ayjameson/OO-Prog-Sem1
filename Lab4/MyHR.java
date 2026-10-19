package Lab4;

import java.util.Scanner;

public class MyHR
{
    private static final int MAX_EMPLOYEES = 5;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        Employee[] employees = new Employee[MAX_EMPLOYEES]; //5 capacity
        Office[] offices = new Office[3];    //3 offices, 2 employees per office with 5 max so 3 needed
        String fname;
        String lname;
        String street;
        String townorcity;
        String county;
        String type;
        String companyCar;

        companyCar = null;

        for(int y=0; y<=2; y++)
        {
            Office of = new Office();
            offices[y]=of;
        }
    
    while(choice != 4)
    {
        System.out.println("Select what operation you'd like to perform");
        System.out.println("1) List offices");
        System.out.println("2) Create new employee record");
        System.out.println("3) List employees");
        System.out.println("4) Exit");
        choice = in.nextInt();

        switch(choice)
        {
            case 1:
                for(Office of: offices)
                {
                    System.out.println(of + "\t" + "Number of Employees: " + of.getNumberOfEmployees());
                    if(of.getNumberOfEmployees() != 0)
                    {
                        System.out.println("Employees: " + "\n" + of.getNumberOfEmployees());
                    }
                }
                break;
            case 2:
                if(employees.length<=5)
                {
                    Scanner createEmployee = new Scanner(System.in);
                    
                    System.out.println("Enter employee's first name");
                    fname = createEmployee.nextLine();
                    System.out.println("Enter employee's last name ");
                    lname = createEmployee.nextLine();
                    System.out.println("Enter employee's street");
                    street = createEmployee.nextLine();
                    System.out.println("Enter employee's city or town");
                    townorcity = createEmployee.nextLine();
                    System.out.println("Enter employee's county");
                    county = createEmployee.nextLine();
                    System.out.println("Enter employee type (Manager or Staff)");
                    type = createEmployee.nextLine();
                    if(type.equalsIgnoreCase("Manager"))
                    {
                        System.out.println("Enter company car type");
                        companyCar = createEmployee.nextLine();
                    }
                    Address address = new Address(street, townorcity, county);
                    Employee employee = new Employee(fname, lname, address, type);
                    employee.setAssignedCar(companyCar);
                    employees[Employee.getNumberOfEmployees()]=employee;
                    for(Office of: offices)
                    {
                        if(of.getNumberOfEmployees()<=2)
                        {
                            of.addEmployee(employee);
                            break;
                        }
                    }
                }
                else
                {
                    System.out.println("Employee records are full");
                }
                break;
            case 3:
                for(Employee emp: employees)
                {
                    if(emp != null)
                    {
                        System.out.println(emp);
                    }
                }
                break;
            case 4:
                System.out.println("Goodbye!");
                System.exit(0);
        }

    }
}
}
