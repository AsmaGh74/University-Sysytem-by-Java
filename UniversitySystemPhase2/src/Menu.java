import javax.swing.*;
import java.awt.*;

/**
 * Menu class generates a menu bar.
 */
public abstract class Menu extends JMenuBar {
    public Menu(){
        init();
    }

    /**
     * Initializes and generates a menu bar.
     */
    private void init(){
        // set menu bar layout
        this.setLayout(new GridLayout(15,0));

//        this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Color color = new Color(204,255,255);
        g2d.setColor(color);
        g2d.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
    }

    /**
     * Set menus and their items based on the type of user.
     */
    abstract protected void setMenuAndItems();

}
