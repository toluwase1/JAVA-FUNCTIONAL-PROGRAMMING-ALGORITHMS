package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //without predicate
        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("With predicate");
        // With Predicate<> Functional Programming
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println(
                "Is Phone Number Exist And Contains Number 3 = " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300"));

        System.out.println(
                "Is Phone Number Exist And Contains Number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("070000003"));
        System.out.println(
                "Is Phone Number Exist And Contains Number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("09309877300"));


    }

    //predicate executed in the conventional way
    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }

    // predicate the functional way
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length()==11;
    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    //BiPredicate
//    static BiPredicate<String, String> isPhoneNumberValidBiPredicate = (phoneNumber, containsNumber3) ->
//            ((phoneNumber.startsWith("07") && phoneNumber.length()==11.and(phoneNumber.contains("3"));






}

