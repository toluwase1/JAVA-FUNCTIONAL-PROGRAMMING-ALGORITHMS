package imperative;

public class CalculateRotation {
    public static int shiftedDiff(String first, String second) {
        int count =0;
       if (first.length()==second.length()) {
           return second.concat(second).indexOf(first);

        }


        return -1;
    }
}
