import java.util.ArrayList;

/**
 * University class represents a university and stores it's information like
 * masters, students, courses, and etc. list.
 * @author Asma
 * @version 1.0
 */
public class University {

    // stores university name
    private String universityName;
    // stores students list
    private ArrayList<Student> students;
    // stores masters list
    private ArrayList<Master> masters;
    // stores admins list
    private ArrayList<Admin> admins;

    public University(String universityName){
        this.universityName = universityName;
        students = new ArrayList<>();
        masters = new ArrayList<>();
        admins = new ArrayList<>();
    }

    /**
     * Add a new student with unique username and a pass to students list.
     * @param username  student's username
     * @param password  student's password
     */
    public void addStudent(String username, String password){
        //*** first check for the username to not been selected before and throw appropriate exception if
        // it has been taken before
        Student newStudent = new Student(username, password);
        students.add(newStudent);
    }

    /**
     * Add a new master with unique username and a pass to masters list.
     * @param username  master's username
     * @param password  master's password
     */
    public void addMaster(String username, String password){
        //*** first check for the username to not been selected before and throw appropriate exception if
        // it has been taken before
        Master newMaster = new Master(username, password);
        masters.add(newMaster);
    }

    /**
     * Add a new admin with unique username and a pass to admins list.
     * @param username  admin's username
     * @param password  admin's password
     */
    public void addAdmin(String username, String password){
        //*** first check for the username to not been selected before and throw appropriate exception if
        // it has been taken before
        Admin newAdmin = new Admin(username, password);
        admins.add(newAdmin);
    }

}
