import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

        // set a mouse listener to the add student menu
        // with this listener when u click an add student and master panel will appear
        student.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AddStudentAndMasterPanel addStudentAndMasterPanel = new AddStudentAndMasterPanel("student");
            }
        });

        JMenu master = new JMenu();
        master.setFont(font);
        master.setText("master");

        // set a mouse listener to the add master menu
        // with this listener when u click an add student and master panel will appear
        master.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AddStudentAndMasterPanel addStudentAndMasterPanel = new AddStudentAndMasterPanel("master");
            }
        });

        JMenu set = new JMenu();
        set.setFont(font);
//        set.setForeground(Color.BLUE);
        set.setOpaque(true);
        set.setBackground(color);
        set.setText("FOOD");

        JMenu food = new JMenu();
        food.setFont(font);
        food.setText("add new food");

        // set a mouse listener to the add food menu
        // with this listener when u click an add food panel will appear
        food.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                AddFoodPanel addFoodPanel = new AddFoodPanel();
            }
        });

        JMenu diet = new JMenu();
        diet.setFont(font);
        diet.setText("set weekly food schedule");

        // set a mouse listener to the set weekly food schedule menu
        // with this listener when u click an set weekly food schedule panel will appear
        diet.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                SetWeeklyFoodSchedulePanel setWeeklyFoodSchedulePanel = new SetWeeklyFoodSchedulePanel();
            }
        });

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
        this.add(food);
        this.add(diet);

        this.add(change);
        this.add(username);
        this.add(password);
    }
}
