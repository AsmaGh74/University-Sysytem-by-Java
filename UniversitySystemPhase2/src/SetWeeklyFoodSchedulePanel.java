import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * SetWeeklyFoodSchedulePanel class will create a GUI and
 * appropriate listeners so that the admin can set weekly
 * food schedule for the university.
 * @author Asma
 * @version 1.0
 */
public class SetWeeklyFoodSchedulePanel {

    // stores main frame
    private JFrame setFrame;
    // stores meal type
    private String meal;
    // stores week day
    private WEEK_DAYS weekDay;

    public SetWeeklyFoodSchedulePanel(){

        // initialize main frame
        setFrame = new JFrame();
        setFrame.setTitle("Set weekly food schedule");
        setFrame.setLayout(new BorderLayout());
        setFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setFrame.setResizable(false);
        setFrame.setLocation(700, 20);
        setFrame.setSize(600,700);

        // add set panel to the center of set frame
        setFrame.add(buttonsAndListPanel(), BorderLayout.CENTER);

        // add done button to the south of set frame
        setFrame.add(doneButton(), BorderLayout.SOUTH);

        // set space panels
        setFrame.add(spacePanel(),BorderLayout.NORTH);
        setFrame.add(spacePanel(),BorderLayout.EAST);
        setFrame.add(spacePanel(),BorderLayout.WEST);

        setFrame.setVisible(true);
    }

//    private JPanel setPanel(){
//        Color backgroundColor1 = new Color(204, 206, 206);
//        Color backgroundColor2= new Color(255,255,204);
//
//        Color[] colors = {backgroundColor1, backgroundColor2};
//
//        JPanel set = new JPanel();
//        set.setBackground(Color.WHITE);
//        set.setLayout(new GridLayout(8,0));
//
//        // add 7 label and combo box (each for one day of week)
//        int i = 1;
//        for (WEEK_DAYS day: WEEK_DAYS.values()) {
//            JPanel dayPanel = labelAndListPanel(day);
//            dayPanel.setBackground(colors[i%2]);
//            set.add(dayPanel);
//            i++;
//        }
//
//        return set;
//    }

//    private JPanel labelAndListPanel(WEEK_DAYS weekDay){
//        Color color = new Color(204,255,255);
//
//        // create main panel
//        JPanel labelAndComboBox = new JPanel();
//        labelAndComboBox.setLayout(new GridLayout(0,2));
//
//        // create label for day week
//        Font font = new Font("Optima", Font.BOLD, 15);
//
//        JLabel weekDayLabelForLaunch = new JLabel();
//        weekDayLabelForLaunch.setBackground(Color.WHITE);
//        weekDayLabelForLaunch.setFont(font);
//        weekDayLabelForLaunch.setText("   " + weekDay.name() +  " launch");
//
//        JLabel weekDayLabelForDinner = new JLabel();
//        weekDayLabelForDinner.setBackground(Color.WHITE);
//        weekDayLabelForDinner.setFont(font);
//        weekDayLabelForDinner.setText("   " + weekDay.name() +  " launch");
//
//        // create JList  for available foods
//        Font font1 = new Font("Optima", Font.BOLD, 12);
//        // create String[] argument for JList
//        String[] foods = new String[University.foodList.size()];
//        for (int i = 0; i < University.foodList.size(); i++){
//            foods[i] = University.foodList.get(i).getFoodName();
//        }
//
//        JList availableFoods = new JList(foods);
//        availableFoods.setFont(font1);
//        availableFoods.setSelectionBackground(color);
//
////        availableFoods.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//
//        availableFoods.setSelectionModel(new DefaultListSelectionModel() {
//            @Override
//            public void setSelectionInterval(int index0, int index1) {
//                if(super.isSelectedIndex(index0)) {
//                    super.removeSelectionInterval(index0, index1);
//                }
//                else {
//                    super.addSelectionInterval(index0, index1);
//                }
//            }
//        });
//
//        // default selected food
//        availableFoods.setSelectedIndex(0);
////        int[] defaultSelections = {0,1};
////        availableFoods.setSelectedIndices(defaultSelections);
//
//        // set a mouse listener to the JList
//        availableFoods.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
//                int[] selectedFoodIndices =  availableFoods.getSelectedIndices();
////                University //hereeeeeeeeeeeeeeeeee
//            }
//        });
//
//
//        // add label and JList to the main panel
//        labelAndComboBox.add(weekDayLabelForLaunch);
//        labelAndComboBox.add(availableFoods);
//        labelAndComboBox.add(weekDayLabelForDinner);
//
//        return labelAndComboBox;
//    }

//    private JPanel setPanel(){
//        // create main panel as set
//        JPanel set = new JPanel();
//        set.setBackground(Color.WHITE);
//        set.setLayout(new GridLayout(0,2));
//
//        // add 14 buttons and a JList for available foods
//
//        return set;
//    }

    private JPanel buttonsAndListPanel(){
//        int meal = 0; // 0 for launch and 1 for dinner
//        WEEK_DAYS weekDay = WEEK_DAYS.SATURDAY;

        Font font = new Font("Optima", Font.BOLD, 15);
        Color backgroundColor1 = new Color(204, 206, 206);
        Color backgroundColor2= new Color(255,255,204);
        Color[] colors = {backgroundColor1, backgroundColor2};

        // create main panel as set
        JPanel set = new JPanel();
        set.setBackground(Color.WHITE);
        set.setLayout(new GridLayout(0,2));


        // create JList  for available foods
//        Font font1 = new Font("Optima", Font.BOLD, 12);
        Color color = new Color(204,255,255);

        // create String[] argument for JList
        String[] foods = new String[University.foodList.size()];
        for (int j = 0; j < University.foodList.size(); j++){
            foods[j] = "     " + University.foodList.get(j).getFoodName() + "\n";
        }

        JList availableFoods = new JList(foods);
        availableFoods.setFont(font);
        availableFoods.setSelectionBackground(color);
        availableFoods.setForeground(Color.BLACK);
        availableFoods.setSelectionForeground(Color.BLUE);

////        availableFoods.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//
        availableFoods.setSelectionModel(new DefaultListSelectionModel() {
            @Override
            public void setSelectionInterval(int index0, int index1) {
                if(super.isSelectedIndex(index0)) {
                    super.removeSelectionInterval(index0, index1);
                }
                else {
                    super.addSelectionInterval(index0, index1);
                }
            }
        });

        // default selected food
//        availableFoods.setSelectedIndex(0);
//        int[] defaultSelections = {0,1};
//        availableFoods.setSelectedIndices(defaultSelections);

        // set a mouse listener to the JList
        availableFoods.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                ArrayList<Food> selectedFoods = new ArrayList<>();
                int[] selectedFoodIndices =  availableFoods.getSelectedIndices();
                for (int k = 0; k < selectedFoodIndices.length; selectedFoods.add(University.foodList.get(selectedFoodIndices[k])), k++);

                HashMap<String, ArrayList<Food>> selectedFoodsForOneMeal = new HashMap<>();
                selectedFoodsForOneMeal.put(meal,selectedFoods);

                University.weeklyFoodSchedule.put(weekDay, selectedFoodsForOneMeal);

                // test
//                for (WEEK_DAYS day:University.weeklyFoodSchedule.keySet()) {
////                    System.out.println(day);
//
////                    System.out.println("launch");
//                    if (University.weeklyFoodSchedule.get(day).get("launch") != null &&  University.weeklyFoodSchedule.get(day).get("launch").size() != 0){
//                        System.out.println(day);
//                        System.out.println("launch");
//                        for (Food food:University.weeklyFoodSchedule.get(day).get("launch")) {
//                            System.out.println(food.getFoodName());
//                            System.out.println(food.getFoodPrice());
//                        }
//                    }
//
////                    System.out.println("dinner");
//                    if (University.weeklyFoodSchedule.get(day).get("dinner") != null && University.weeklyFoodSchedule.get(day).get("dinner").size() != 0){
//                        System.out.println(day);
//                        System.out.println("dinner");
//                        for (Food food:University.weeklyFoodSchedule.get(day).get("dinner")) {
//                            System.out.println(food.getFoodName());
//                            System.out.println(food.getFoodPrice());
//                        }
//                    }
//
//                    // test end
//
//                }  // ف // test
            }
        });



        // create buttons panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBackground(Color.WHITE);
        buttonsPanel.setLayout(new GridLayout(14,0));

        // add 14 buttons and a JList for available foods
        int i = 0;
        for (WEEK_DAYS day:WEEK_DAYS.values()) {

            // create and add launch button
            JButton launchButton = new JButton(" " + day.name() + " launch");
            launchButton.setFont(font);
            launchButton.setBackground(colors[i%2]);

            // add action listener to button
            launchButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    weekDay = day;
                    meal = "launch";

                    set.add(availableFoods);
                    set.revalidate();
                    set.repaint();
                }
            });

            buttonsPanel.add(launchButton);


            // create and add diner button
            JButton dinnerButton = new JButton(" " + day.name() + " dinner");
            dinnerButton.setFont(font);
            dinnerButton.setBackground(colors[i%2]);

            // add action listener to button
            dinnerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    weekDay = day;
                    meal = "dinner";

                    set.add(availableFoods);
                    set.revalidate();
                    set.repaint();
                }
            });

            buttonsPanel.add(dinnerButton);

            i++;
        }


        // add buttons panel to main set panel
        set.add(buttonsPanel);

        return set;
    }

    private JPanel spacePanel(){
        JPanel space = new JPanel();
        space.setBackground(Color.WHITE);

        return space;
    }

    private JButton doneButton(){
        Color backgroundColor1 = new Color(204, 206, 206);
        Color backgroundColor2= new Color(255,255,204);
        Color[] colors = {backgroundColor1, backgroundColor2};

        JButton done = new JButton();
        Font font = new Font("Optima", Font.BOLD, 15);
        Color color = new Color(204,255,255);
        done.setFont(font);
        done.setBackground(color);
        done.setText("Done");

        // add an action listener for done button to show the result
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // close the set frame after 2 seconds
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                setFrame.dispatchEvent(new WindowEvent(setFrame, WindowEvent.WINDOW_CLOSING));

                // create a JTable on a JFrame and show the food schedule for week
                JFrame showSchedule = new JFrame();
                showSchedule.setTitle("week food schedule");
                showSchedule.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                showSchedule.setBackground(Color.WHITE);
                showSchedule.setLayout(new GridLayout(0,8));
                showSchedule.setSize(900,400);
                showSchedule.setLocation(500, 50);
                showSchedule.setResizable(false);

                JTextArea start = new JTextArea();
                start.setEditable(false);
                start.setFont(font);
                start.setText("");
                showSchedule.add(start);

                for (WEEK_DAYS day:WEEK_DAYS.values()) {
                    JTextArea foodSchedule = new JTextArea();
                    foodSchedule.setEditable(false);
                    foodSchedule.setFont(font);
                    foodSchedule.setText("\n\n  " + day.name());
                    foodSchedule.setBackground(color);
                    showSchedule.add(foodSchedule);
                }

                JTextArea launch = new JTextArea();
                launch.setEditable(false);
                launch.setFont(font);
                launch.setBackground(color);
//                launch.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                launch.setText("\n\n   LAUNCH");
                showSchedule.add(launch);

                int i = 0;
                for (WEEK_DAYS day:WEEK_DAYS.values()) {
                    JTextArea foodSchedule = new JTextArea();
                    foodSchedule.setEditable(false);
                    foodSchedule.setFont(font);
                    foodSchedule.setBackground(colors[i%2]);
                    i++;
                    foodSchedule.setText(University.oneMealFoodToString(day,"launch"));
                    showSchedule.add(foodSchedule);
                }

                JTextArea dinner = new JTextArea();
                dinner.setEditable(false);
                dinner.setFont(font);
                dinner.setBackground(color);
//                dinner.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                dinner.setText("\n\n   DINNER");
                showSchedule.add(dinner);

                for (WEEK_DAYS day:WEEK_DAYS.values()) {
                    JTextArea foodSchedule = new JTextArea();
                    foodSchedule.setEditable(false);
                    foodSchedule.setFont(font);
                    foodSchedule.setBackground(colors[i%2]);
                    i++;
                    foodSchedule.setText(University.oneMealFoodToString(day,"dinner"));
                    showSchedule.add(foodSchedule);
                }


                showSchedule.setVisible(true);
            }
        });

        return done;
    }

}
