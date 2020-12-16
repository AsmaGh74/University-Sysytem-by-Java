import javax.swing.*;
import java.awt.*;

/**
 * StudentMenu class generates a menu bar for student's portal.
 * @author Asma
 * @version 1.0
 */
public class StudentMenu extends Menu{
    public StudentMenu(){
        super();
        setMenuAndItems();
    }

    protected void setMenuAndItems(){
        // generate and add menus to the main menu bar
        Font font = new Font("Optima", Font.BOLD, 15);
        Color color = new Color(255,255,153);

        JMenu courses = new JMenu();
        courses.setFont(font);
//        courses.setForeground(Color.BLUE);  // it works
        courses.setOpaque(true);
        courses.setBackground(color);
        courses.setText("COURSES");

//        management.setOpaque(true);  // it works
//        management.setBackground(Color.YELLOW);  // it works

        JMenu coursesList = new JMenu();
        coursesList.setFont(font);
        coursesList.setText("courses list");

        JMenu courseSelection = new JMenu();
        courseSelection.setFont(font);
        courseSelection.setText("courses selection");

        JMenu information = new JMenu();
        information.setFont(font);
//        information.setForeground(Color.BLUE);
        information.setOpaque(true);
        information.setBackground(color);
        information.setText("INFORMATION");

        JMenu personalInformation = new JMenu();
        personalInformation.setFont(font);
        personalInformation.setText("personal");

        JMenu gradesAvg = new JMenu();
        gradesAvg.setFont(font);
        gradesAvg.setText("grades avg");

        JMenu financial = new JMenu();
        financial.setFont(font);
//        financial.setForeground(Color.BLUE);
        financial.setOpaque(true);
        financial.setBackground(color);
        financial.setText("FINANCIAL");

        JMenu balance = new JMenu();
        balance.setFont(font);
        balance.setText("balance");

        JMenu charge = new JMenu();
        charge.setFont(font);
        charge.setText("charge");

        JMenu reserve = new JMenu();
        reserve.setFont(font);
//        reserve.setForeground(Color.BLUE);
        reserve.setOpaque(true);
        reserve.setBackground(color);
        reserve.setText("RESERVE");

        JMenu food = new JMenu();
        food.setFont(font);
        food.setText("food");

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

//        // generate and add menu items to menus
//        Font font1 = new Font("Optima", Font.BOLD, 12);
//        JMenuItem courses = new JMenuItem();
//        courses.setFont(font1);
//        courses.setText("courses        ");
//
////        courses.setOpaque(true);  // it works
////        courses.setBackground(Color.YELLOW);  // it works
//
//        JMenuItem project = new JMenuItem();
//        project.setFont(font1);
//        project.setText("project");
//
//        management.add(courses);
//        management.add(project);

        this.add(courses);
        this.add(coursesList);
        this.add(courseSelection);

        this.add(information);
        this.add(personalInformation);
        this.add(gradesAvg);

        this.add(financial);
        this.add(balance);
        this.add(charge);

        this.add(reserve);
        this.add(food);

        this.add(change);
        this.add(username);
        this.add(password);
    }
}
