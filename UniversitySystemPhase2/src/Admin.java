import javax.swing.*;
import java.awt.*;

/**
 * Admin class stores information of a admin and acts on them.
 * @author Asma
 * @version 1.0
 */
public class Admin extends User{

    // stores file address for admin's default profile photo
    public static String addressForDefaultProfilePhoto;

    /**
     * Creates a new admin with unique username and a password.
     * @param username  admin's username
     * @param password  admin's password
     */
    public Admin(String username, String password){
        super(username, password);
        addressForDefaultProfilePhoto = "D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\admin.png";
        super.setProfilePhoto(new ImageIcon(addressForDefaultProfilePhoto).getImage());
    }

    /**
     * Returns user type.
     * @return "admin"
     */
    public String toString(){
        return "admin";
    }


}
