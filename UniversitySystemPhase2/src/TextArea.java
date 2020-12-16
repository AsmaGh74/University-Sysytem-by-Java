import javax.swing.*;
import java.awt.*;

/**
 * TextArea class generates a JTextArea to present a text on a panel.
 * @author Asma
 * @version 1.0
 */
public class TextArea extends JTextArea {
    // stores location of the text area
    private Point location;
    // stores size of the text area
    private Dimension size;
    // stores the text that will be present in the text area
    private String text;

    public TextArea(Point location, Dimension size, String text){
        this.location = location;
        this.size = size;
        this.text = text;
        this.setEditable(false);
        // set size and location of the text area
        this.setLocation(location);
        this.setSize((int) Math.round(this.size.getWidth() + 10), (int) Math.round(this.size.getHeight() + 20));
        // set text for text area
        Font font = new Font("Optima", Font.BOLD, 12);
        this.setFont(font);
        this.setText("\n" + text + "\n");
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        this.setEditable(false);
        this.setBorder(null);

        Graphics2D g2d = (Graphics2D) g;
        Color color = new Color(204, 206, 206);
        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(3.0f));

        // draw a line top of the text area
        g2d.drawLine(0, 2,
                (int) Math.round(size.getWidth()), 2);
        // draw a line bottom of the text area
        g2d.drawLine(0, (int) Math.round(size.getHeight()),
                (int) Math.round(size.getWidth()), (int) Math.round(size.getHeight()));
    }
}
