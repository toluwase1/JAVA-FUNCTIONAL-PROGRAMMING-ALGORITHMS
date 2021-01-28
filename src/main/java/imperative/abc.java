package imperative;
import java.util.*;

public class abc {
    public static void main(String[] args) {
      int a=  shiftedDiff("eecoff","coffee");
        System.out.println(a);

//        String ab = "abnabcdefghi";
        LinkedList<String> ab = new LinkedList<>();
        ab.add("abc");
        System.out.println(ab.contains("abn".toUpperCase()));


    }

    public static int shiftedDiff(String first, String second) {
        LinkedList<String> ab = new LinkedList<>();
        ab.add("abc");
        ab.contains("abn".toUpperCase());

        if (first.length() == second.length()){
          //return   (second+second).indexOf(first);
            return second.concat(second).indexOf(first);
            //fatigue
            //tiguefatiguefa
            //hoop
            //phoophoo
        } else {
            return -1;
        }


    }
}