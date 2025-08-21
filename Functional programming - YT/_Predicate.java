import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        //System.out.println(isPhoneNumberValid("07000000000"));
        //System.out.println(isPhoneNumberValid("0700000000"));

        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));

        //System.out.println(isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));
        //System.out.println(isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000"));

        //System.out.println(isTotalLengthEven.and(isProduct10).test("ee","1234"));

        System.out.println(isPhoneNumberValidPredicate2.apply("07000000000"));



        
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }

    static Function<String,Boolean> isPhoneNumberValidPredicate2 = 
    phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Predicate<String> isPhoneNumberValidPredicate = 
    phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static BiPredicate<String, String> isTotalLengthEven = 
    (string1, string2) -> (string1.length() + string2.length())%2!=0;

    static BiPredicate<String,String> isProduct10 = 
    (string1, string2) -> (string1.length()*string2.length())==10;


}