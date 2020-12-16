import javax.swing.*;
import java.awt.*;

public class ServicePanel extends JPanel {
    // stores text of the panel
    private String serviceName;
    // stores img for Portal icon
    private Image portalImg;
    // stores img for Samad icon
    private Image samadImg;

    public ServicePanel(String serviceName){
        this.serviceName = serviceName;
        this.setBackground(Color.WHITE);
        // read and stores images for Samad and Portal icons
        portalImg = new ImageIcon("D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\portal2.png").getImage();
        samadImg = new ImageIcon("D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\samad2.jpg").getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.BLACK);
        g2D.setStroke(new BasicStroke(6.0f));
        g2D.drawRoundRect(20,20,200,150,10,10);
        g2D.setPaint(Color.BLACK);
        Font font = new Font("Optima", Font.BOLD, 15);
        g2D.setFont(font);
        g2D.drawString(serviceName, (200-serviceName.length())/2 ,160);
        if (serviceName.equals("Portal")){
            g2D.drawImage(portalImg,45,25,150,120,Color.WHITE,this);
        }
        if (serviceName.equals("Samad")){
            g2D.drawImage(samadImg,45,25,150,120,Color.WHITE,this);
        }
    }
}
