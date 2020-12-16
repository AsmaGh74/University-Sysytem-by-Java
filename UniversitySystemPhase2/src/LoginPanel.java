import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * LoginPanel class generates GUI for login page.
 * @author Asma
 * @version 1.0
 */
public class LoginPanel {
    // stores main frame for the login part
    JFrame mainLoginFrame;

    public LoginPanel(){
        init();
    }

    private void init(){
        mainLoginFrame = new JFrame();
        mainLoginFrame.setResizable(false);
        mainLoginFrame.setTitle("Portal Login");
        mainLoginFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        mainLoginFrame.setLocation(500, 70);
        mainLoginFrame.setSize(400,220);
        mainLoginFrame.setLayout(new BorderLayout());

        JPanel mainLoginPanel = new JPanel();
        mainLoginPanel.setLayout(new BorderLayout());
        mainLoginPanel.setBorder(BorderFactory.createMatteBorder(0,2,0,2,Color.BLACK));
        mainLoginFrame.add(mainLoginPanel,BorderLayout.CENTER);

        // add guide boxes to the frame
        mainLoginFrame.add(guideBox1(),BorderLayout.NORTH);
//        mainLoginFrame.add(guideBox2(),BorderLayout.SOUTH);

        // add enter username and pass texts to the center of the portal panel
        mainLoginPanel.add(loginPanel(),BorderLayout.CENTER);

        // add side spaces
        mainLoginPanel.add(sideSpaces(),BorderLayout.NORTH);
        mainLoginPanel.add(sideSpaces(),BorderLayout.SOUTH);
        mainLoginPanel.add(sideSpaces(),BorderLayout.EAST);
        mainLoginPanel.add(sideSpaces(),BorderLayout.WEST);

        mainLoginFrame.setVisible(true);
    }

    private JTextArea guideBox1(){
        JTextArea guideBox = new JTextArea();
        guideBox.setEditable(false);
        guideBox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        // set JTextArea font
        Font font = new Font("Optima", Font.BOLD, 15);
        guideBox.setFont(font);
        // set JTextArea text
        guideBox.setText(" Enter portal with your username and password.");
        return guideBox;
    }

    private JTextArea guideBox2(){
        JTextArea guideBox = new JTextArea();
        guideBox.setEditable(false);
        guideBox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        // set JTextArea font
        Font font = new Font("Optima", Font.BOLD, 15);
        guideBox.setFont(font);
        // set JTextArea text
        guideBox.setText(" Press to reset your password.");
        return guideBox;
    }

    private JPanel loginPanel(){
        JPanel login = new JPanel();

        login.setLayout(null);
//        login.setLayout(new GridLayout(0,2));

        login.setBackground(Color.WHITE);
//        login.setBorder(BorderFactory.createMatteBorder(0,3,3,3,Color.BLACK));

        // add enter username and pass texts to the login panel
        login.add(enterTexts());
        // add username and pass boxes to the login panel
        login.add(enterBoxes());
        // add login button to the login panel
        login.add(loginButton());

        return login;
    }

    private JPanel enterTexts(){
        JPanel usernameAndPass = new JPanel();
        usernameAndPass.setLayout(new GridLayout(2,0));
        usernameAndPass.setBackground(Color.WHITE);

        usernameAndPass.setSize(150,60);
        usernameAndPass.setLocation(20,15);

//        // create two JTextFields and add them to the panel
//        Font font = new Font("Optima", Font.BOLD, 15);
//        JTextField username = new JTextField();
//        username.setEditable(false);
//        username.setFont(font);
//        username.setText("Enter username:");
//        JTextField pass = new JTextField();
//        pass.setEditable(false);
//        pass.setFont(font);
//        pass.setText("Enter password:");

        // create two JLabels and add them to the panel
        Font font = new Font("Optima", Font.BOLD, 15);
        JLabel username = new JLabel();
        username.setFont(font);
        username.setText("Enter username:");

        JLabel pass = new JLabel();
        pass.setFont(font);
        pass.setText("Enter password:");

        usernameAndPass.add(username);
        usernameAndPass.add(pass);

        return usernameAndPass;
    }

    private JPanel enterBoxes(){
        JPanel usernameAndPass = new JPanel();
        usernameAndPass.setBackground(Color.WHITE);
        usernameAndPass.setLayout(new GridLayout(2,0));

        usernameAndPass.setSize(150,60);
        usernameAndPass.setLocation(180,15);

        // create two JTextAreas and add them to the panel
        Color backgroundColor = new Color(204, 206, 206);
        Font font = new Font("Optima", Font.BOLD, 15);
        JTextArea username = new JTextArea();
        username.setBackground(backgroundColor);
        username.setFont(font);
        JPasswordField pass = new JPasswordField();
        pass.setBackground(backgroundColor);
        pass.setFont(font);

        usernameAndPass.add(username);
        usernameAndPass.add(pass);

        return usernameAndPass;
    }

    private JPanel sideSpaces(){
        JPanel space = new JPanel();
        space.setBackground(Color.WHITE);
        return space;
    }

    private JButton loginButton(){
        JButton login = new JButton();

        login.setSize(80, 30);
        login.setLocation(135,85);

        Font font = new Font("Optima", Font.BOLD, 15);
        login.setFont(font);
        login.setText("login");

        Color borderColor = new Color(204, 206, 206);
        login.setBorder(BorderFactory.createLineBorder(borderColor, 5));
        login.setBackground(Color.WHITE);

        // add an action listener for login button
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // to close and hide the login frame
                mainLoginFrame.dispatchEvent(new WindowEvent(mainLoginFrame, WindowEvent.WINDOW_CLOSING));
                PortalPanel portalPanel = new PortalPanel();
            }
        });

        return login;
    }
}
