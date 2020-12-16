import javax.swing.*;
import java.awt.*;

/**
 * PortalPanel class generates GUI for portal service.
 * @author Asma
 * @version 1.0
 */
public class PortalPanel {
    // stores the main frame for portal
    JFrame portalFrame;

    public PortalPanel(){
        init();
    }

    /**
     * Initialize portal frame and add necessary components to the frame.
     */
    private void init(){
        // generate main frame for the portal
        portalFrame = new JFrame();
        portalFrame.setResizable(false);
        portalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        portalFrame.setTitle("Portal");
        portalFrame.setLayout(new BorderLayout());
        portalFrame.setLocation(600,30);
        portalFrame.setSize(700,700);

        // generate main panel for the portal
        JPanel portalPanel = new JPanel();
        portalPanel.setLayout(null);
        portalPanel.setBackground(Color.WHITE);

        // add profile panel to the portal panel
        Image profileImg = new ImageIcon("D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\portal3.png").getImage();
        ProfilePanel profilePanel = new ProfilePanel("Asma Gh", profileImg);
        portalPanel.add(profilePanel);

        // add welcome text to the portal panel
        portalPanel.add(welcomeText());

        // add main menu of the portal to the portal frame
//        portalFrame.setJMenuBar(portalMenu());
        portalFrame.add(portalMenu(),BorderLayout.EAST);

        // add portal panel to the portal frame
        portalFrame.add(portalPanel,BorderLayout.CENTER);

        portalFrame.setVisible(true);
    }

    private JTextArea welcomeText(){
        Point location = new Point(20,200);
        Dimension size = new Dimension(300,70);
        String text = "Welcome to Portal.\nTake a look to the news.";
        TextArea welcome = new TextArea(location,size,text);
        return welcome;
    }

    private JMenuBar portalMenu(){
        StudentMenu studentMenu = new StudentMenu();
        return studentMenu;
    }
}
