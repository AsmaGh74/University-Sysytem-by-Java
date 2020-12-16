import javax.swing.*;
import java.awt.*;

public class ServiceButton extends JButton {
    // stores name of the button
    private String serviceName;
    // stores img for Portal icon
    private Image portalImg;
    // stores img for Samad icon
    private Image samadImg;

    public ServiceButton(String serviceName){
        this.serviceName = serviceName;
//        this.setText(serviceName);
        this.setBackground(Color.WHITE);
//        this.setBorder(new );
        // read and stores images for Samad and Portal icons
        portalImg = new ImageIcon("D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\portal2.png").getImage();
        samadImg = new ImageIcon("D:\\Lessons #2\\AP99\\Home Works\\Midterm Project\\phase1\\imgs\\samad2.jpg").getImage();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.BLACK);
        g2D.setStroke(new BasicStroke(6.0f));
        g2D.drawRoundRect(20,20,200,150,10,10);
        g2D.setPaint(Color.BLACK);
        Font font = new Font("Optima", Font.BOLD, 15);
        g2D.setFont(font);
        // calculate serviceName string in pixels
        FontMetrics metrics = g2D.getFontMetrics(font);
        int width = metrics.stringWidth(serviceName);

        g2D.drawString(serviceName, (200-width)/2 + 20 ,160);

        if (serviceName.equals("Portal")){
            g2D.drawImage(portalImg,45,25,150,120,Color.WHITE,this);
        }
        if (serviceName.equals("Samad")){
            g2D.drawImage(samadImg,45,25,150,120,Color.WHITE,this);
        }
    }
}
