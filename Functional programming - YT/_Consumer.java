import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        //Normal java function
        Customer Maria = new Customer("Maria", "99999");
        //greetCustomer(Maria);

        //Consumer functional interface
        //greetCustomerConsumer.accept(Maria);

        //Bifunction
        greetCustomerConsumerVersion2.accept(Maria, false);

        
    }

    static Consumer<Customer> greetCustomerConsumer = 
    customer -> System.out.println("Hello " + customer.customerName + ", thanks for registering your phone number " 
    + customer.customerPhoneNumber);

    static BiConsumer<Customer,Boolean> greetCustomerConsumerVersion2 = 
    (customer,showPhoneNumber) -> System.out.println("Hello " + customer.customerName + 
    ", thanks for registering your phone number " 
    + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering your phone number " 
        + customer.customerPhoneNumber);
    }

     static void greetCustomerVersion2(Customer customer,boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering your phone number " 
        + (showPhoneNumber ? customer.customerPhoneNumber : "*****"));
    }

    static class Customer {
        String customerName;
        String customerPhoneNumber;

    Customer(String customerName, String customerPhoneNumber) {
        this.customerName=customerName;
        this.customerPhoneNumber=customerPhoneNumber;
    }

    }
    
}
