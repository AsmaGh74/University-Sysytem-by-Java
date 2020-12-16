import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

enum WEEK_DAY{
    SATURDAY8, SATURDAY10, SATURDAY14,
    SUNDAY8, SUNDAY10,SUNDAY14,
    MONDAY8, MONDAY10, MONDAY14,
    TUESDAY8, TUESDAY10, TUESDAY14,
    WEDNESDAY8, WEDNESDAY10, WEDNESDAY14
}
enum START_HOUR{
//    8,10,14
}

/**
 * ClassTime class represents a time table for holding a course.
 * @author Asma
 * @version 1.0
 */
public class ClassTime {
    // stores valid class times
    public static Set<String> validClassTimes =
            new HashSet<String>(Arrays.asList("SATURDAY8", "SATURDAY10", "SATURDAY14",
                    "SUNDAY8", "SUNDAY10","SUNDAY14",
                    "MONDAY8", "MONDAY10", "MONDAY14",
                    "TUESDAY8", "TUESDAY10", "TUESDAY14",
                    "WEDNESDAY8", "WEDNESDAY10", "WEDNESDAY14"));
    // stores number of units
    private int numberOfUnits;
    // stores valid numbers for number of units
    private Set<String> validNumberOfUnits =
            new HashSet<String>(Arrays.asList("1","2","3","4"));

    // stores the times that the course will be held in a week
    private int timesInAWeek;
    // stores days of the week and start hour that the course will be held
    private String[] weekDays;

    public ClassTime(int timesInAWeek, String[] weekDays, int numberOfUnits){
        this.weekDays = new String[2];  // now it's elements are null
        setNumberOfUnits(numberOfUnits);
        setTimesInAWeek(timesInAWeek, numberOfUnits);
        setWeekDays(weekDays);
    }

    /**
     * This function will set number of units for the course and
     * throws appropriate exception if number of units is not in the valid range ([1-4]).
     * @param numberOfUnits  number of units for the course
     */
    private void setNumberOfUnits(int numberOfUnits){
        //*** set number of units and throw appropriate exception if it is not in [1-4] range
        NotInTheValidListException exception = new NotInTheValidListException(numberOfUnits, validNumberOfUnits); // here
        this.numberOfUnits = numberOfUnits;
    }

    /**
     * This function will set the times that the course will be held in a week
     * and throws appropriate exception if there is no match between
     * number of units and times in a week for the course.
     * @param timesInAWeek  number of times that the class will held per week
     * @param numberOfUnits  number of units for the course
     */
    private void setTimesInAWeek(int timesInAWeek, int numberOfUnits){
        // ***set times in a week based on the numberOfUnits and throw appropriate exception
        this.timesInAWeek = timesInAWeek;
    }

    /**
     * This function will set the days and start hours that the course will be held and
     * will throw appropriate exception if the days and start hours are not valid.
     * @param weekDays  day of the week plus start hour
     */
    private void setWeekDays(String[] weekDays){
        //*** set the days and start hours that the course will be held and throw appropriate exception
        // if the days and start hours are not valid one
        this.weekDays = weekDays;
    }
}
