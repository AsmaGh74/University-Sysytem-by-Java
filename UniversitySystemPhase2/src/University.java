import java.rmi.NoSuchObjectException;
import java.util.ArrayList;
import java.util.HashMap;

enum WEEK_DAYS{
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
}

/**
 * University class represents a university and stores it's information like
 * masters, students, courses, and etc. list.
 * @author Asma
 * @version 1.0
 */
public class University {

    // stores university name
    private String universityName;

    // stores users list
    private ArrayList<User> users;

    // stores all created usernames
    // when a new username creates, can be checked to be unique by comparing with usernames in this array list
    public static ArrayList<String> createdUsernames;

    // stores foods with their prices
    public static ArrayList<Food> foodList;

//    // stores daily food type
//    private HashMap<String,Food> dailyFood;

    // stores weekly food schedule
    public static HashMap<WEEK_DAYS, HashMap<String,ArrayList<Food>>> weeklyFoodSchedule;

    public University(String universityName){
        this.universityName = universityName;

        // initialize array lists
        users = new ArrayList<>();
        createdUsernames = new ArrayList<>();
        foodList = new ArrayList<>();

        // initialize weekly food hashmap
//        dailyFood = new HashMap<>();
//        dailyFood.put("launch", null);  // will set later
//        dailyFood.put("dinner", null);  // will set later
        weeklyFoodSchedule = new HashMap<>();
        weeklyFoodInitialization();

        // create an admin so the admin can do rest of the duties through GUI
        Admin mainAdmin = new Admin("Main Admin", "12345678");

        // add the created admin to university's users list
        addUser(mainAdmin);
    }

    /**
     * Return users list.
     * @return users list
     */
    public ArrayList<User> getUsers(){
        return users;
    }

    /**
     * Add a new user to university's users list.
     * @param user user to be added to the university's users list
     */
    public void addUser(User user){
        users.add(user);
        createdUsernames.add(user.getUsername());

    }

    /**
     * This method searches in the users list and
     * compares entered username and pass with the users in the list and returns matched user's type.
     * @param username
     * @param password
     * @return
     */
    public String checkUsernameAndPassword(String username, String password){
        String userType = "";
        for (User ele:users) {
            if (ele.equals(username,password)) userType =  ele.toString();
        }
        return userType;
    }

    /**
     * By this method the admin can add a new food to
     * university's food list.
     * @param food new food to be added to the university's food list
     */
    public void addNewFood(Food food){
        foodList.add(food);
    }

    /**
     * This method will initialize weekly food schedule hashmap with
     * week days and null food for launch and dinner.
     */
    private void weeklyFoodInitialization(){
        HashMap<String,ArrayList<Food>> dailyFood = new HashMap<>();
        dailyFood.put("launch", new ArrayList<Food>());  // will set later
        dailyFood.put("dinner", new ArrayList<Food>());  // will set later

        for (WEEK_DAYS day:WEEK_DAYS.values()) {
            weeklyFoodSchedule.put(day, dailyFood);
        }
    }

    /**
     * Return selected foods for one day based on the day and meal type.
     * @param day  day of the week
     * @param meal meal type
     * @return selected foods
     */
    public static String oneMealFoodToString(WEEK_DAYS day, String meal){
        String foodList = "\n";
        if (weeklyFoodSchedule.get(day).get(meal) != null){
            for (Food food:weeklyFoodSchedule.get(day).get(meal)) {
                foodList += "   " + food.getFoodName() + "\n";
            }
        }
        return foodList;
    }

    /**
     * Checks for user match
     * @param username  user's username
     * @param password  user's password
     * @throws IllegalArgumentException if there is no match
     */
    public boolean checkForUserMatch(String username, String password) throws IllegalArgumentException{
        boolean userMatch = false;
        for (User user:users) {
            userMatch = user.getUsername().equals(username) && user.getPassword().equals(password);
        }
        if (!userMatch) throw new IllegalArgumentException();
        return userMatch;
    }

}
