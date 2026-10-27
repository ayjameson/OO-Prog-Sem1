public class Student extends Person 
{

    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student() {
        super();
        this.numCourses = 0;
        this.courses = new String[10];
        this.grades = new int[10];
    }

    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
        this.grades = new int[10];
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourses < 10) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        } else {
            System.out.println("Cannot add more courses. Maximum limit reached.");
        }
    }

    public void printGrades() {
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }
        int total = 0;
        for (int i = 0; i < numCourses; i++) {
            total += grades[i];
        }
        return (double) total / numCourses;
    }
}
