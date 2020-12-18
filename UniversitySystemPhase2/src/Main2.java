import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
//        ClassTime.validClassTimes.add("Friday!");
//        for (String ele:ClassTime.validClassTimes) {
//            System.out.println(ele);
//        }
        // result! WEDNESDAY14
        //SUNDAY10
        //SATURDAY8
        //TUESDAY10
        //MONDAY14
        //TUESDAY8
        //WEDNESDAY8
        //WEDNESDAY10
        //MONDAY8
        //Friday!
        //SATURDAY14
        //MONDAY10
        //SUNDAY8
        //TUESDAY14
        //SATURDAY10
        //SUNDAY14

//        /**
//         *  handling too much food price exception
//         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter food name:");
//        String foodName = scanner.nextLine();
//        System.out.println("Enter food price:");
//        double foodPrice = Double.parseDouble(scanner.nextLine());
//        int attempts = 0;
//        do {
//            try {
//                Food newFood = new Food(foodName,foodPrice);
//            }
//            catch (IllegalStateException e){
//                attempts++;
//                System.out.println("Enter food name:");
//                foodName = scanner.nextLine();
//                System.out.println("Enter food price:");
//                foodPrice = Double.parseDouble(scanner.nextLine());
//                if (foodPrice < 10000) {
//                    Food newFood = new Food(foodName,foodPrice);
//                }
//            }
//        } while (foodPrice > 10000 && attempts < 2);
//        if (foodPrice > 10000){
//            System.out.println("You can not add new food any more! More than expected attempts!");
//        }
//        for (String ele:Food.foodList.keySet()) {
//            System.out.println(ele);
//        }
//        // end of handling,, it works

        University university = new University("hi");

        University.foodList.add(new Food("makaroni", 10.0));
        University.foodList.add(new Food("fesenjoon", 50.0));
        University.foodList.add(new Food("ghorme", 40.0));
        University.foodList.add(new Food("kookoo", 5.0));
        SetWeeklyFoodSchedulePanel setWeeklyFoodSchedulePanel = new SetWeeklyFoodSchedulePanel();

    }
}
