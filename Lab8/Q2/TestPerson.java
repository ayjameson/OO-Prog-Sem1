package Q2;
public class TestPerson {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 25000);
        Student student = new Student("Mary", "Science");
        Person[] people = new Person[2];
        people[0] = employee;
        people[1] = student;

        for (Person person : people)
        {
            System.out.println(person.getName());
        }
    }
}
