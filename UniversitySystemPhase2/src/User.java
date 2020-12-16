import java.awt.*;
import java.util.ArrayList;

/**
 * User class stores information for a specific user and acts on them.
 * @author Asma
 * @version 1.0
 */
public class User {
    // stores all created usernames
    // when a new username creates, can be checked to be unique by comparing with usernames in this array list
    public static ArrayList<String> createdUsernames;

    // stores selected username by the user for her/his account
    private String username;
    // stores user's selected password
    private String password;
    // stores user's profile img
    private Image profilePhoto;

    /**
     * Generates a new user with unique username and a password.
     * @param username  user's username
     * @param password  user's password
     */
    public User(String username, String password) throws IllegalArgumentException{
        createdUsernames = new ArrayList<>();
        setUsername(username);
        setPassword(password);
    }

    /**
     * Set the user's username and make sure that it is not duplicate.
     * @param name  user's username
     */
    private void setUsername(String name) throws IllegalArgumentException{
        for (String ele:createdUsernames) {
            if (ele.equals(name)) throw new IllegalArgumentException();
        }
        this.username = name;
        // add the new username to created usernames list
        createdUsernames.add(name);
    }

    /**
     * Set the user's password and make sure that it is at least 8 characters.
     * @param pass user's password.
     */
    private void setPassword(String pass) throws IllegalArgumentException{
        if (pass.length() < 8) throw new IllegalArgumentException();
        this.password = pass;
    }

    /**
     * Set user's profile photo.
     * @param profilePhoto  user's profile photo.
     */
    protected void setProfilePhoto(Image profilePhoto){
        this.profilePhoto = profilePhoto;
    }

    /**
     * Get user's username.
     * @return username
     */
    protected String getUsername(){
        return username;
    }
}
