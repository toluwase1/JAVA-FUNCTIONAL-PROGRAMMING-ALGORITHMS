package imperative;

public class squareDigit {

    public static void main(String[] args) {
        int a = 2456;
        System.out.println(squareDigits(a));
    }

        public static int squareDigits(int n) {
            // TODO Implement me
            //convert the figure to string
            //split the string
            //
            // parse each digit to int
            //square each integer in the parsed int digit
            // return to string
            // concatenate
           // int[] intArray = new int[];
            //  String [] newString1 = newString
            //            int intArray = Integer.parseInt(String.valueOf(newString))
            String newString =  Integer.toString(n);
            StringBuilder value = new StringBuilder();
            for (int i = 0; i<newString.length(); i++) {
                int fff = Integer.parseInt("" +newString.charAt(i));
               int result = (int)  Math.pow(fff, 2);
               value.append(result);
            }
            return Integer.parseInt(value.toString());
        }



}

// *************************
//Another Method
//public class SquareDigit {
//
//  public int squareDigits(int n) {
//    // TODO Implement me
//    String result = "";
//
//while (n != 0) {
//  int digit = n % 10 ;
//  result = digit*digit + result ;
//  n /= 10 ;
//}
//
//return Integer.parseInt(result) ;
//}
//}