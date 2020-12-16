import javax.swing.*;
import java.awt.*;

/**
 * AdminMenu class generates a menu bar for admin's portal.
 * @author Asma
 * @version 1.0
 */
public class AdminMenu extends Menu{
    public AdminMenu(){
        super();
        setMenuAndItems();
    }

    protected void setMenuAndItems(){
        // generate and add menus to the main menu bar
        Font font = new Font("Optima", Font.BOLD, 15);
        Color color = new Color(255,255,153);

        JMenu list = new JMenu();
        list.setFont(font);
//        list.setForeground(Color.BLUE);
        list.setOpaque(true);
        list.setBackground(color);
        list.setText("LIST");

        JMenu students = new JMenu();
        students.setFont(font);
        students.setText("students");

        JMenu masters = new JMenu();
        masters.setFont(font);
        masters.setText("masters");

        JMenu courses = new JMenu();
        courses.setFont(font);
        courses.setText("courses");

        JMenu add = new JMenu();
        add.setFont(font);
//        add.setForeground(Color.BLUE);
        add.setOpaque(true);
        add.setBackground(color);
        add.setText("ADD");

        JMenu student = new JMenu();
        student.setFont(font);
        student.setText("student");

        JMenu master = new JMenu();
        master.setFont(font);
        master.setText("master");

        JMenu set = new JMenu();
        set.setFont(font);
//        set.setForeground(Color.BLUE);
        set.setOpaque(true);
        set.setBackground(color);
        set.setText("SET");

        JMenu diet = new JMenu();
        diet.setFont(font);
        diet.setText("diet");

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

        this.add(list);
        this.add(students);
        this.add(masters);
        this.add(courses);

        this.add(add);
        this.add(student);
        this.add(master);

        this.add(set);
        this.add(diet);

        this.add(change);
        this.add(username);
        this.add(password);
    }
}
