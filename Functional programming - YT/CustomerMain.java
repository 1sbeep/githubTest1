import java.time.LocalDate;


public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "alice@gmail.com", "08181881", 
        LocalDate.of(2000,1,1));

        CustomerValidatorService validatorService = new CustomerValidatorService();
        //System.out.println(validatorService.isValid(customer));

        //Using combinator pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEmailValid().and(CustomerRegistrationValidator.isphoneNumberValid().
        and(CustomerRegistrationValidator.isAdult())).apply(customer);

        System.out.println(result);

    }
    
}
