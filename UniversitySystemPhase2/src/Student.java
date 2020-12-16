import javax.swing.*;

/**
 * Student class stores information of a student and acts on them.
 * @author Asma
 * @version 1.0
 */
public class Student extends User{
    //***** do not forget abt avg calculation for student

    // stores file address for student's default profile photo
    private String addressForDefaultProfilePhoto;
    // stores balance for student account
    private double balance;
    // stores avg for student's grades
    private double avg;

    /**
     * Creates a new student with unique username and a password.
     * @param username  student's username
     * @param password  student's password
     */
    public Student(String username, String password){
        super(username, password);
        addressForDefaultProfilePhoto = "D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\student.png";
        super.setProfilePhoto(new ImageIcon(addressForDefaultProfilePhoto).getImage());
        // set balance and avg initial value to 0
        balance = 0;
        avg = 0;
    }

    /**
     * Charge student's account with a specific amount.
     * @param chargeAmount  the amount that student account will be charged
     * @return  balance for student account
     */
    public double chargeAccount(double chargeAmount){
        balance += chargeAmount;
        return balance;
    }

    /**
     * Withdraw from the student's account and
     * if there is not enough money in the account throw appropriate exception.
     * @param withdrawAmount  the amount which student wants to withdraw from the account
     * @return  balance for student account
     */
    public double withdrawFromAccount(double withdrawAmount){
        //*** check if there is enough money in the student's account and
        // if there is not throw appropriate exception
        balance -= withdrawAmount;
        return balance;
    }

    /**
     * Check if object and this student are the same.
     * @param object  object to be checked
     * @return  true if object and this student are the same
     */
    public boolean equals(Object object){
        if (this == object) return true;
        if (!(object instanceof Student)) return false;
        Student student = (Student) object;
        return super.getUsername().equals(student.getUsername());
    }
}
