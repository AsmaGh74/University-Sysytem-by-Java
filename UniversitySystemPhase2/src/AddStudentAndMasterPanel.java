import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

/**
 * AddStudentAndMasterPanel class generates a panel which the admin can add new student and master to the university's users list.
 * @author Asma
 * @version 1.0
 */
public class AddStudentAndMasterPanel {

    // stores type of the user that admin wants to add to the users list
    private String userType;
    // stores main frame
    private JFrame addFrame;
    // stores username
    private JTextArea username;
    // stores password
    private JTextArea password;
    // stores result text
    private JTextArea printResult;

    public AddStudentAndMasterPanel(String userType){
        this.userType = userType;

        // initialize frame and text areas
        addFrame = new JFrame();
        addFrame.setTitle("Add new user");
        addFrame.setLayout(new BorderLayout());
        addFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        addFrame.setResizable(false);
        addFrame.setLocation(500, 70);
        addFrame.setSize(500,220);

        username = new JTextArea();
        password = new JTextArea();
        printResult = new JTextArea();

        // now add add panel to the center of add frame
        addFrame.add(addPanel(),BorderLayout.CENTER);

        // add print result text area to the bottom of the add frame
        addFrame.add(printResultText(), BorderLayout.SOUTH);

        addFrame.setVisible(true);
    }

    private JPanel addPanel(){
        JPanel add = new JPanel();

        add.setLayout(null);

        add.setBackground(Color.WHITE);

        // add enter username and pass texts to the login panel
        add.add(enterTexts());
        // add username and pass boxes to the login panel
        add.add(enterBoxes());

        // add add user button to the login panel
        add.add(addUserButton());

        return add;
    }

    private JPanel enterTexts(){
        JPanel usernameAndPass = new JPanel();
        usernameAndPass.setLayout(new GridLayout(2,0));
        usernameAndPass.setBackground(Color.WHITE);

        usernameAndPass.setSize(200,60);
        usernameAndPass.setLocation(20,30);

        // create two JLabels and add them to the panel
        Font font = new Font("Optima", Font.BOLD, 15);

        JLabel username = new JLabel();
        username.setFont(font);
        username.setText("Enter new username:");

        JTextArea pass = new JTextArea();
        pass.setEditable(false);
        pass.setBackground(Color.WHITE);
        pass.setBorder(null);
        pass.setFont(font);
        pass.setText("Enter default password:");

        usernameAndPass.add(username);
        usernameAndPass.add(pass);

        return usernameAndPass;
    }

    private JPanel enterBoxes(){
        JPanel usernameAndPass = new JPanel();
        usernameAndPass.setBackground(Color.WHITE);
        usernameAndPass.setLayout(new GridLayout(2,0));

        usernameAndPass.setSize(200,60);
        usernameAndPass.setLocation(250,30);

        // create two JTextAreas and add them to the panel
        Color backgroundColor1 = new Color(204, 206, 206);
        Color backgroundColor2= new Color(255,255,204);
        Font font = new Font("Optima", Font.BOLD, 15);

        this.username.setBackground(backgroundColor2);
        this.username.setFont(font);

        this.password.setBackground(backgroundColor1);
        this.password.setFont(font);

        usernameAndPass.add(this.username);
        usernameAndPass.add(this.password);

        return usernameAndPass;
    }

    private JButton addUserButton() {
        JButton addUser = new JButton();

        addUser.setSize(130, 30);
        addUser.setLocation(160, 110);

        Font font = new Font("Optima", Font.BOLD, 15);
        addUser.setFont(font);
        addUser.setText("add new user");

        Color borderColor = new Color(204, 206, 206);
        addUser.setBorder(BorderFactory.createLineBorder(borderColor, 4));
        addUser.setBackground(Color.WHITE);

        // add action listener to the add user button
        addUser.addActionListener(new actionListenerForAddNewUserButton());

        return addUser;
    }

    private JTextArea printResultText(){
        this.printResult.setEditable(false);

        Font font = new Font("Optima", Font.BOLD, 15);
        this.printResult.setFont(font);

//        Color color = new Color(255,204,204);
//        this.printResult.setBackground(color);

        return printResult;
    }

    private class actionListenerForAddNewUserButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Color color1 = new Color(204,255,204);
            Color color2 = new Color(255,204,204);

            User newUser = null;
            String name = "";
            String pass = "";

            try {
                name = username.getText();
                pass = password.getText();
                switch (userType){
                    case "admin":
                        newUser = new Admin(name,pass);
                        break;
                    case "master":
                        newUser = new Master(name,pass);
                        break;
                    case "student":
                        newUser = new Student(name,pass);
                        break;
                }
            }
            catch (IllegalStateException usernameException){
                // clear username text area
                username.setText("");
                username.update(username.getGraphics());

                // notice admin in the result text part
                printResult.setBackground(color2);
                printResult.setText("");
                printResult.append("This username has already been selected!");
                printResult.update(printResult.getGraphics());
            }

            catch (IllegalArgumentException passwordException){
                // clear password text area
                password.setText("");
                password.update(password.getGraphics());

                // notice admin in the result text part
                printResult.setBackground(color2);
                printResult.setText("");
                printResult.append("Password must be at least 8 characters!");
                printResult.update(printResult.getGraphics());
            }

            if (newUser != null && newUser.checkUsernameAndPassValidity(name,pass)){
                Main.amirkabir.addUser(newUser);

                // print result in the print result text area
                printResult.setBackground(color1);
                printResult.setText("");
                printResult.append(userType + " added successfully :) will close in 4 seconds.");
                printResult.update(printResult.getGraphics());

//            newUser.list(); // test

                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                // now close the add frame
                addFrame.dispatchEvent(new WindowEvent(addFrame, WindowEvent.WINDOW_CLOSING));
            }

        }
    }
}
