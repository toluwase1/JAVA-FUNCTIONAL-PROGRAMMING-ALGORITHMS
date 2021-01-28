package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


public class _Consumer {
    public static void main(String[] args) {
       // normal java function for consumer
        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);

        //conventional for biconsumer
        greetCustomerConsumerV2.accept(maria, false);

        //consumer functional interface
        greetCustomerConsumer.accept(maria);

        //biconsumer functional interface
        greetCustomerConsumerV2.accept(maria, false);




    }

    //biconsumer
    static BiConsumer <Customer, Boolean > greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+ customer.customerName+
                    ", thanks for registering your phone number "
                    +(showPhoneNumber ? customer.customerPhoneNumber: "********"));

//consumer customer interface
    static Consumer <Customer> greetCustomerConsumer = customer ->
        System.out.println("Hello "+ customer.customerName+
                ", thanks for registering your phone number "
                +customer.customerPhoneNumber);

    //Normal conventional way
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering your phone number "
                + customer.customerPhoneNumber);
    }
    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello "+ customer.customerName+
                ", thanks for registering your phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber: "********"));


        }





        static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }



}
