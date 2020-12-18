import java.awt.*;
import java.util.ArrayList;

/**
 * User class stores information for a specific user and acts on them.
 * @author Asma
 * @version 1.0
 */
public class User {

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
    public User(String username, String password) throws IllegalArgumentException, IllegalStateException {
        setUsername(username);
        setPassword(password);
    }

    /**
     * Set the user's username and make sure that it is not duplicate.
     * @param name  user's username
     */
    private void setUsername(String name) throws IllegalStateException{
        if (University.createdUsernames.contains(name)) throw new IllegalStateException();

        this.username = name;
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

    /**
     * Get user's password.
     * @return password
     */
    protected String getPassword(){
        return password;
    }

    /**
     * Compares two users and returns true if both of them have the same username and password.
     * @param username user's username to be checked and compared
     * @param password  user's password to be checked and compared
     * @return  true if they are equal
     */
    public boolean equals(String username, String password){
        return this.username.equals(username) &&
                this.password.equals(password);
    }

    /**
     * This method will check the entered username and password validity.
     * @param username  entered username
     * @param password  entered password
     * @return  true if both username and password are valid
     */
    public boolean checkUsernameAndPassValidity(String username, String password){
        return !University.createdUsernames.contains(username) && password.length() > 7;
    }

    public void list(){ /// test
        for (String ele :University.createdUsernames) {
            System.out.println(ele);
        }
    }
}
