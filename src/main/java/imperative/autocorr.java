package imperative;

import java.util.Arrays;

public class autocorr {

    public static String autocorrect(String input) {
//      String[] c = input.split(" ");
//      input.substring(c);
//
//
//        String [] b  =   Arrays.stream(input).anyMatch((a->a="u").replace("u", "your client"));
        if (input.contains(" you")) {
            input.replace("you", " your client");
        } else if (input.contains("u")) {
            input.replace(" u ", "your client") ;
        } else if (input.contains(" youuuuu")) {
            input.replace("youuuuu", " your client.");
        } else if (input.contains("youuu")) {
            input.replace(" youuu", " your client.");
        }

        return input;

    }

}
