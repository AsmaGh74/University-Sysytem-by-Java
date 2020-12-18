import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Food class represents a food and stores food name and price.
 * This class has a list of valid foods and when you wanna define a new food for university food menu, it will be added to the list.
 */
public class Food {
//    // stores valid food names for university food menu
//    public static Set<String> validFoodNames =
//            new HashSet<String>(Arrays.asList());

//    // stores foods with their prices
//    public static HashMap<String,Double> foodList;

    // stores food name
    private String foodName;
    // stores food price
    private double foodPrice;


    /**
     * Creates a new food with certain name and price and add it to the food list.
     * @param foodName  name of the food
     * @param foodPrice  price of the food
     */
    public Food(String foodName, Double foodPrice) throws NumberFormatException{
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    /**
     * Return name of the food.
     * @return  food name
     */
    public String getFoodName(){
        return foodName;
    }

    /**
     * Return price of the food.
     * @return food price
     */
    public Double getFoodPrice(){
        return foodPrice;
    }

//    public void list(){  // test
//        for (Food ele:University.foodList) {
//            System.out.println(ele.foodName + "   "  + ele.foodPrice);
//        }
//    }

}
