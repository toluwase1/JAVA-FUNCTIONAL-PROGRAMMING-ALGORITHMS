package imperative;

import java.util.Arrays;

public class highAndLow {
        public static String highAndLow(String numbers) {
            // Code here or
//            split() : returns array of strings computed by splitting.
//            pass splitted string into another array variable;
//            parseInt() : returns the integer representation of the argument.
//            Arrays.sort() : array to be sorted.
//            Integer.toString() : returns the String object representing the Integer value.
            //return arranged highest to lowest
            String [] arr = numbers.split(" ");
            int [] intArray = new int[arr.length];
            for (int i =0; i< arr.length; i++) {
                intArray[i]=Integer.parseInt(arr[i]);
            }
            Arrays.sort(intArray);
            return Integer.toString(intArray[intArray.length-1]) + " " + Integer.toString(intArray[0]);
           // return Integer.toString(intArray[intArray.length-1]) + " " + Integer.toString(intArray[0]) ;
//            numbers.toCharArray();
//            return "throw towel";
        }

}
