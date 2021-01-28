package imperative;

class Challenge {
    public static void main(String[] args) {

        System.out.println(numberToOrdinal(0));
    }

    public static String numberToOrdinal( Integer number ) {



       String numberToString = number.toString();
       String ab = "";

        if (numberToString.endsWith("11") || (numberToString.endsWith("12") || numberToString.endsWith("13") ) ) {
            ab = numberToString+"th";
        }else if(numberToString.endsWith("1")) {
            ab =numberToString + "st";
        }
        else if (numberToString.endsWith("2")) {
            ab = numberToString+"nd";
        } else if (numberToString.endsWith("3")) {
            ab = numberToString+"rd";
        } else if (numberToString=="0") {
            ab = "0";
        } else{
            ab = numberToString+"th";

       }
       return ab;
}
}

//Javascript solution

//    function numberToOrdinal(n) {
//        // Finish me
//
//        var numberToString = n.toString();
//        var ab = "";
//
//        if (numberToString.endsWith("11") || (numberToString.endsWith("12") || numberToString.endsWith("13") ) ) {
//            ab = numberToString+"th";
//        }else if(numberToString.endsWith("1")) {
//            ab =numberToString + "st";
//        }
//        else if (numberToString.endsWith("2")) {
//            ab = numberToString+"nd";
//        } else if (numberToString.endsWith("3")) {
//            ab = numberToString+"rd";
//        } else if (numberToString=="0") {
//            ab = "0";
//        } else{
//            ab = numberToString+"th";
//
//        }
//        return ab;
//    }
//// return n;
//
