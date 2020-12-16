import javax.swing.*;
import java.awt.*;

/**
 * ProfilePanel class generates a panel for user's profile.
 * @author Asma
 * @version 1.0
 */
public class ProfilePanel extends JPanel{
    // stores user's name
    private String userName;
    // stores user's profile img
    private Image profileImg;

    public ProfilePanel(String userName, Image profileImg){
        this.userName = userName;
        this.profileImg = profileImg;
        init();
    }

    /**
     * Initialize and generate profile panel.
     */
    private void init(){
        this.setSize(150,150);
        this.setLocation(10,10);
        this.setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Color color = new Color(204, 206, 206);
        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(5.0f));
        g2d.drawRoundRect(10,10,120,120,10,10);

        // set user's name under profile photo
        Font font = new Font("Optima", Font.BOLD, 15);
        g2d.setFont(font);
        g2d.setPaint(Color.BLACK);
        // calculate user's name string in pixels
        FontMetrics metrics = g2d.getFontMetrics(font);
        int width = metrics.stringWidth(userName);
        g2d.drawString(userName, (120-width)/2 + 10,150);

        // of the user has an img set it for profile
        if (profileImg != null){
            g2d.drawImage(profileImg,15,15,110,110,Color.WHITE,this);
        }

    }
}
