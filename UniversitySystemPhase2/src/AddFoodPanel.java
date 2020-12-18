import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;

/**
 * AddFoodPanel represents a GUI with appropriate listeners so that the admin can add
 * a new food to the university's foods list.
 * @author Asma
 * @version 1.0
 */
public class AddFoodPanel {

    // stores main frame
    private JFrame addFrame;
    // stores food name
    private JTextArea foodName;
    // stores food price
    private JTextArea foodPrice;
    // stores result text
    private JTextArea printResult;

    public AddFoodPanel(){

        // initialize frame and text areas
        addFrame = new JFrame();
        addFrame.setTitle("Add new food");
        addFrame.setLayout(new BorderLayout());
        addFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        addFrame.setResizable(false);
        addFrame.setLocation(500, 70);
        addFrame.setSize(500,220);

        foodName = new JTextArea();
        foodPrice = new JTextArea();
        printResult = new JTextArea();

        // now add add panel to the center of add frame
        addFrame.add(addPanel(),BorderLayout.CENTER);

        // add print result text area to the bottom of the add frame
        addFrame.add(printResultText(), BorderLayout.SOUTH);

        addFrame.setVisible(true);

    }

    private JPanel addPanel(){
        JPanel add = new JPanel();

        add.setLayout(null);

        add.setBackground(Color.WHITE);

        // add enter food name and price texts to the login panel
        add.add(enterTexts());
        // add food name and price boxes to the login panel
        add.add(enterBoxes());

        // add add food button to the login panel
        add.add(addFoodButton());

        return add;
    }

    private JPanel enterTexts(){
        JPanel foodNameAndPrice = new JPanel();
        foodNameAndPrice.setLayout(new GridLayout(2,0));
        foodNameAndPrice.setBackground(Color.WHITE);

        foodNameAndPrice.setSize(200,60);
        foodNameAndPrice.setLocation(20,30);

        // create two JLabels and add them to the panel
        Font font = new Font("Optima", Font.BOLD, 15);

        JLabel foodName = new JLabel();
        foodName.setFont(font);
        foodName.setText("Enter new food name:");

        JTextArea price = new JTextArea();
        price.setEditable(false);
        price.setBackground(Color.WHITE);
        price.setBorder(null);
        price.setFont(font);
        price.setText("Enter food price:");

        foodNameAndPrice.add(foodName);
        foodNameAndPrice.add(price);

        return foodNameAndPrice;
    }

    private JPanel enterBoxes(){
        JPanel foodNameAndPrice = new JPanel();
        foodNameAndPrice.setBackground(Color.WHITE);
        foodNameAndPrice.setLayout(new GridLayout(2,0));

        foodNameAndPrice.setSize(200,60);
        foodNameAndPrice.setLocation(250,30);

        // create two JTextAreas and add them to the panel
        Color backgroundColor1 = new Color(204, 206, 206);
        Color backgroundColor2= new Color(255,255,204);
        Font font = new Font("Optima", Font.BOLD, 15);

        this.foodName.setBackground(backgroundColor2);
        this.foodName.setFont(font);

        this.foodPrice.setBackground(backgroundColor1);
        this.foodPrice.setFont(font);

        foodNameAndPrice.add(this.foodName);
        foodNameAndPrice.add(this.foodPrice);

        return foodNameAndPrice;
    }

    private JButton addFoodButton() {
        JButton addFood = new JButton();

        addFood.setSize(130, 30);
        addFood.setLocation(160, 110);

        Font font = new Font("Optima", Font.BOLD, 15);
        addFood.setFont(font);
        addFood.setText("add new food");

        Color borderColor = new Color(204, 206, 206);
        addFood.setBorder(BorderFactory.createLineBorder(borderColor, 4));
        addFood.setBackground(Color.WHITE);

        // add action listener to the add user button
        addFood.addActionListener(new actionListenerForAddNewFoodButton());

        return addFood;
    }

    private JTextArea printResultText(){
        this.printResult.setEditable(false);

        Font font = new Font("Optima", Font.BOLD, 15);
        this.printResult.setFont(font);

//        Color color1 = new Color(204,255,204);
//        Color color2 = new Color(255,204,204);
//        this.printResult.setBackground(color);

        return printResult;
    }

    private class actionListenerForAddNewFoodButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Color color1 = new Color(204,255,204);
            Color color2 = new Color(255,204,204);

            Food newFood = null;
            String name = "";
            Double price = 0.0;

            try {
                name = foodName.getText();
                price = Double.valueOf(foodPrice.getText());
                newFood = new Food(name,price);
            }
            catch (NumberFormatException exception){
                // clear food price text area
                foodPrice.setText("");
                foodPrice.update(foodPrice.getGraphics());

                // notice admin in the result text part
                printResult.setBackground(color2);
                printResult.setText("");
                printResult.append("Food price must be a number!");
                printResult.update(printResult.getGraphics());
            }

            if (newFood != null && price instanceof Double){
                Main.amirkabir.addNewFood(newFood);

                // print result in the print result text area
                printResult.setBackground(color1);
                printResult.setText("");
                printResult.append(foodName.getText() + " added successfully :) will close in 4 seconds.");
                printResult.update(printResult.getGraphics());

//                newFood.list();  // test

                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

                // now close the add frame
                addFrame.dispatchEvent(new WindowEvent(addFrame, WindowEvent.WINDOW_CLOSING));
            }

        }
    }
}
