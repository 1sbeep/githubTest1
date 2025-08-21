import java.util.Optional;
import java.util.function.Supplier;

public class _Optionals {
    public static void main(String[] args) {
        
        Object value = Optional.ofNullable("null").orElseGet(() -> "default value");


        //System.out.println(value);

        Optional.ofNullable(null).
        ifPresentOrElse(email -> System.out.println("Sending email to " + email),
        () -> {System.out.println("cannot send email");
        System.out.println("Please, try again!");});
        


    }
    
}
