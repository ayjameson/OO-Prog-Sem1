public class Teacher extends Person 
{
    private String[] courses;
    private int numCourses;

    public Teacher() {
        super();
        this.courses = new String[10];
        this.numCourses = 0;
    }

    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new String[10];
        this.numCourses = 0;
    }

    public boolean addCourse(String course) {
        if (numCourses < 10) {
            courses[numCourses] = course;
            numCourses++;
            return true;
        } else {
            return false; // Cannot add more courses
        }
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // Shift remaining courses to the left
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[numCourses - 1] = null; // Clear the last element
                numCourses--;
                return true; // Course removed successfully
            }
        }
        return false; // Course not found
    }

    public String[] getCourses() {
        String[] currentCourses = new String[numCourses];
        System.arraycopy(courses, 0, currentCourses, 0, numCourses);
        return currentCourses;
    }

    @Override
    public String toString() {
        return super.toString() + " teaches " + numCourses + " courses.";
    }
    
}
