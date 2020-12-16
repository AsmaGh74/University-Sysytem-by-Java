import javax.swing.*;
import java.awt.*;

/**
 * MasterMenu class generates a menu bar for master's portal.
 * @author Asma
 * @version 1.0
 */
public class MasterMenu extends Menu{
    public MasterMenu(){
        super();
        setMenuAndItems();
    }

    protected void setMenuAndItems(){
        // generate and add menus to the main menu bar
        Font font = new Font("Optima", Font.BOLD, 15);
        Color color = new Color(255,255,153);

        JMenu course = new JMenu();
        course .setFont(font);
//        course.setForeground(Color.BLUE);
        course.setOpaque(true);
        course.setBackground(color);
        course.setText("COURSE");

        JMenu list = new JMenu();
        list.setFont(font);
        list.setText("list");

        JMenu add = new JMenu();
        add.setFont(font);
        add.setText("add");

        JMenu close = new JMenu();
        close.setFont(font);
        close.setText("close");

        JMenu change = new JMenu();
        change.setFont(font);
//        change.setForeground(Color.BLUE);
        change.setOpaque(true);
        change.setBackground(color);
        change.setText("CHANGE");

        JMenu username = new JMenu();
        username.setFont(font);
        username.setText("username");

        JMenu password = new JMenu();
        password.setFont(font);
        password.setText("password");

        this.add(course);
        this.add(list);
        this.add(add);
        this.add(close);

        this.add(change);
        this.add(username);
        this.add(password);

    }
}
