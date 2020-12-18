import javax.swing.*;
import java.awt.*;

/**
 * ChangeUsernameOrPassPanel class creates GUI and
 * appropriate listeners for changing username or password by user.
 * @author Asma
 * @version 1.0
 */
public class ChangeUsernameOrPassPanel {
    // stores main frame
    private JFrame changeFrame;
    // stores user's username
    private String username;
    // stores user's password
    private String password;
    // stores changing part (username or password)
    private String changingPart;

    public ChangeUsernameOrPassPanel(String changingPart, String username, String password){
        this.changingPart = changingPart;
        this.username = username;
        this.password = password;

        changeFrame = new JFrame();
        init();
        changeFrame.setVisible(true);
    }

    private void init(){
        // set change frame
        changeFrame.setResizable(false);
        changeFrame.setLocation(500, 70);
        changeFrame.setSize(500,220);
        changeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        changeFrame.setLayout(new BorderLayout());

        // add change panel to the center of change frame
        changeFrame.add(changePanel(),BorderLayout.CENTER);
    }

    private JPanel changePanel(){
        Font font = new Font("Optima", Font.BOLD, 15);

        // initialize change panel
        JPanel change = new JPanel();
        change.setBackground(Color.WHITE);
        change.setLayout(null);

        // create a text area to enter the change text
        JTextArea enterText = new JTextArea();
        enterText.setSize(200,20);
        enterText.setLocation(20,20);
        enterText.setFont(font);
        enterText.setEditable(false);
        enterText.setText(" Enter new " + changingPart);

        // create a text area so the user can enter new username or password


        // add text areas to the change panel
        change.add(enterText);

        return change;
    }
}
