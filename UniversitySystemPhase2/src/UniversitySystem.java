import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 * This class integrates all of the systems in the university. Systems like food reservation and course registration.
 * @author Asma
 * @version 1.0
 */
public class UniversitySystem {
    // stores the name of the university
    private String universityName;
    // frame for university system
    JFrame universitySystemFrame;
    // panel for university system
    JPanel universitySystemPanel;

    /**
     * Create a new university system.
     * @param universityName  name of the university
     */
    public UniversitySystem(String universityName){
        this.universityName = universityName;
        // initialize the system gui
        init();
    }

    /**
     * Initialize the system gui.
     */
    private void init(){
        universitySystemFrame = new JFrame();
        universitySystemPanel = new JPanel();
        universitySystemFrame.setTitle(universityName + " University System");
        universitySystemFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        universitySystemFrame.setLocation(500, 70);
        universitySystemFrame.setSize(500,500);
        universitySystemFrame.setLayout(new BorderLayout());

        universitySystemPanel.setLayout(new BorderLayout());
        universitySystemPanel.setBackground(Color.WHITE);
        universitySystemFrame.add(universitySystemPanel,BorderLayout.CENTER);

        // add guide box to panel
        universitySystemPanel.add(guideTextArea(), BorderLayout.NORTH);
//        // add dark or light theme button to panel
//        universitySystemPanel.add(lightOrDarkThemeButton(), BorderLayout.SOUTH);
        // add services panel to the center of panel
        universitySystemPanel.add(servicesPanel(), BorderLayout.CENTER);

        universitySystemFrame.setVisible(true);
    }

    /**
     * Create a JTextArea and write guide lines in that.
     * @return guide box JTextArea
     */
    private JTextArea guideTextArea(){
        JTextArea guideBox = new JTextArea();
        guideBox.setEditable(false);
        guideBox.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        // set JTextArea font
        Font font = new Font("Optima", Font.BOLD, 20);
        guideBox.setFont(font);
        // set JTextArea text
        guideBox.setText(" Students Services\n Food Reservation and Course Registration");
        return guideBox;
    }

//    /**
//     * Create a button to switch between light and dark button.
//     * @return  created button
//     */
//    private JButton lightOrDarkThemeButton(){
//        JButton lightOrDark = new JButton();
//        // set button font
//        Font font = new Font("Optima", Font.BOLD, 10);
//        lightOrDark.setFont(font);
//        lightOrDark.setText("Click for Dark Theme");
//        // set button background and foreground color
//        lightOrDark.setForeground(Color.WHITE);
//        lightOrDark.setBackground(Color.BLACK);
////        // change text area to dark mode. It works.
////        JTextArea darkGuideBox = guideTextArea();
////        darkGuideBox.setBackground(Color.BLACK);
////        darkGuideBox.setForeground(Color.WHITE);
////        universitySystemFrame.add(darkGuideBox,BorderLayout.NORTH);
////        // end of dark mode text area
//        return lightOrDark;
//    }

    /**
     * Create a JPanel for services part and put different service buttons on the panel.
     * @return  services panel
     */
    private JPanel servicesPanel(){
        JPanel servicesPanel = new JPanel();
        servicesPanel.setLayout(new GridLayout(0,2));
        servicesPanel.setBackground(Color.WHITE);
        servicesPanel.setBorder(BorderFactory.createMatteBorder(0,3,3,3,Color.BLACK));
//        // add two panels as food reservation panel and course registration panel to the main panel
//        ServicePanel servicePanel1 = new ServicePanel("Samad");  // Food Reservation
//        servicesPanel.add(servicePanel1);
//        ServicePanel servicePanel2 = new ServicePanel("Portal");  // Course Registration
//        servicesPanel.add(servicePanel2);

        // add a portal button to servicesPanel
        ServiceButton portalButton = new ServiceButton("Portal");
        servicesPanel.add(portalButton);
        // add an action listener to portal button
        portalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // to close and hide the university services frame
                universitySystemFrame.dispatchEvent(new WindowEvent(universitySystemFrame, WindowEvent.WINDOW_CLOSING));
                LoginPanel loginPanel = new LoginPanel();
            }
        });

        // add a samad button to servicesPanel
        ServiceButton samadButton = new ServiceButton("Samad");
        servicesPanel.add(samadButton);

        // add a button for service number 3
        ServiceButton newServiceButton = new ServiceButton("New Service");
        servicesPanel.add(newServiceButton);

        return servicesPanel;
    }

//    /**
//     * Create a button for a specific service. The button will be added to the services panel.
//     * @param serviceName  name of the service
//     * @return  service button
//     */
//    private JButton serviceButton(String serviceName){
//        JButton serviceButton = new JButton();
//        serviceButton.setText(serviceName);
//        serviceButton
//    }
}
