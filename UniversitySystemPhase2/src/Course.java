import java.util.ArrayList;
import java.util.HashMap;

/**
 * Course class represents a course and stores course information.
 * @author Asma
 * @version 1.0
 */
public class Course {

    // stores course name
    private String courseName;

//    // stores number of units  // moved to ClassTime class
//    private int numberOfUnits;

    // stores course capacity
    private int capacity;
    // stores week days and start hours that the course will be held
    private ClassTime classTime;
    // stores the students that enrolled in this course and grade for each of them
    private HashMap<Student, Double> studentsAndGrades;

    /**
     * Create a new course with specific name, capacity and holding time.
     * @param courseName  name of the course
     * @param capacity  capacity for the course
     * @param classTime  holding time
     */
    public Course(String courseName, int capacity, ClassTime classTime){
        this.courseName = courseName;
        this.capacity = capacity;
        this.classTime = classTime;
        studentsAndGrades = new HashMap<>();
    }

    /**
     * Add a new student to the course
     * @param student  student to be added to the course
     */
    public void addNewStudent(Student student){
        // *** check for student existence
        // *** check for course capacity
        studentsAndGrades.put(student,0.0); // initial grade for every student is 0
    }

    /**
     * Get all the students that enrolled in the course
     * @return students
     */
    public ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<>();
        for (Student ele:studentsAndGrades.keySet()) {
            students.add(ele);
        }
        return students;
    }

    /**
     * Set grade for student in this course.
     * @param student  the student whose grade is to be recorded
     * @param grade  student's grade
     */
    public void setGradeForStudent(Student student, Double grade){
        for (Student ele:studentsAndGrades.keySet()) {
            if (ele.equals(student)) studentsAndGrades.put(ele,grade);
        }
    }

    /**
     * This method returns grade for a student whose enrolled in the course.
     * @param student  student whose grade will be returned
     * @return  student's grade in this course
     */
    public Double returnStudentGrade(Student student){
        //*** check for student existence in the course students' list and throw appropriate exception
        Double grade = 0.0;
        for (Student ele:studentsAndGrades.keySet()) {
            if (ele.equals(student)) grade = studentsAndGrades.get(ele);
        }
        return grade;
    }


}
