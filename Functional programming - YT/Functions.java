import java.util.function.BiFunction;
import java.util.function.Function;


public class Functions {
    public static void main(String[] args) {

        //Function example
        //Function takes 1 argument and produces 1 result

        //System.out.println(incrementByOne(1));

        //System.out.println(incrementByOneFunction.apply(1));

        System.out.println(multiplyBy10Function.apply(incrementByOneFunction.apply(incrementByThreeFunction.apply(0))));

        //Function<Integer, Integer> addByOneThenMultiplyBy10ThenIncrementByThree = incrementByThreeFunction.andThen(incrementByOneFunction).andThen(multiplyBy10Function);
        //System.out.println(addByOneThenMultiplyBy10ThenIncrementByThree.apply(0));

        //Bifunction example
        //Bifunction takes 2 arguments and produces 1 result

        System.out.println(incrementByOneAndMultiplyFunction.apply(4, 100));

        
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static Function<Integer, Integer> incrementByThreeFunction = number -> number + 3;

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyFunction = 
    (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;






    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }


    
}
