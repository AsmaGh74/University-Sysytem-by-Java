import javax.swing.*;
import java.util.ArrayList;

/**
 * Master class stores information of a master and acts on them.
 * @author Asma
 * @version 1.0
 */
public class Master extends User{

    // stores file address for master's default profile photo
    private String addressForDefaultProfilePhoto;
    // stores a list of courses that the master teaches
    private ArrayList<Course> courses;

    /**
     * Creates a new master with unique username and a password.
     * @param username  master's username
     * @param password  master's password
     */
    public Master(String username, String password){
        super(username, password);
        courses = new ArrayList<Course>();
        addressForDefaultProfilePhoto = "D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\master.png";
        super.setProfilePhoto(new ImageIcon(addressForDefaultProfilePhoto).getImage());
    }
}
