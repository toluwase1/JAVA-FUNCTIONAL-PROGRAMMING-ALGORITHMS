package imperative;

import java.util.Arrays;

public class HighAndLowV2 {
    //split with " "
    //parse splitted into array container
    //parse to int
    //sort
    public static String highAndLow(String numbers) {
        String[] arr =  numbers.split(" ");
        int [] intArray = new int[arr.length];
        for (int i =0; i<intArray.length; i++) {
            intArray[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArray);
        return Integer.toString(intArray.length-1) + " " + Integer.toString(intArray[0]);
    }

}
