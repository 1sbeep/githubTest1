import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {

        hello("John",null,firstname -> System.out.println("No lastname for " + firstname + " is provided"));

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        }
        else {
            callback.accept(firstName);
        }
    }
    
}
