import java.util.Set;

/**
 * NotInTheValidListException class represents an exception that will be thrown when the
 * entered value is not in the valid values list for the field.
 * @author Asma
 * @version 1.0
 */
public class NotInTheValidListException extends RuntimeException{
    // stores valid values set
    private Set<String> validValuesSet;
    // stores entered value
    private Object value;

    public NotInTheValidListException(Object value, Set<String> validValuesSet){
        this.validValuesSet = validValuesSet;
        this.value = value;
        toString();
        listValidValues();
    }

    public String toString(){
        return "Entered value " +
                this.value +
                " is not a valid one.";
    }

    private void listValidValues(){
        System.out.println("Valid values:");
        for (String ele:validValuesSet) {
            System.out.println(ele);
        }
    }
}
