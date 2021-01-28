package imperative;

import java.util.Arrays;

public class kataa {
    public static void main(String[] args) {
       // System.out.println(findUniq(1[1,3,2,8,2] ));
    }

        public static double findUniq(double arr[]) {
            // Do the magic

              Arrays.sort(arr);
                if (arr[0]==arr[1]) {
                    return arr[arr.length-1];
                } else {
                    return arr[0];
                }


        }
}
