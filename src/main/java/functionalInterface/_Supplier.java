package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBconnectionUrl());
        System.out.println(getDBconnectionUrlSupplier.get());

    }


    static String getDBconnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier <String> getDBconnectionUrlSupplier = () ->
            "jdbc://localhost:5432/users";

}
