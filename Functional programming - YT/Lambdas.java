import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        //Primitives don't allow null values. Therefore, we use objects in functions, predicates, consumers and so on
        //as they allow null values
        
        Function<String, String> upperCaseName = name -> name.toUpperCase();

        Function<String, String> upperCaseName2 = String::toUpperCase;

        Function<String, String> upperCaseName3 = name -> {
            if (name.isBlank()) {
                throw new IllegalArgumentException("");
            }
            return name.toUpperCase();
            };

        BiFunction<String, Integer,String> upperCaseName4 = (name,age) -> {
            if (name.isBlank()) {
                throw new IllegalArgumentException("name is blank!");
            }
            System.out.println(age);
            return name.toUpperCase();
            };

        System.out.println(upperCaseName4.apply("", 22));

        }



    }
