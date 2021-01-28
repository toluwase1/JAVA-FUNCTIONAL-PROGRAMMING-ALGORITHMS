package functionalInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.Collections;

public class addTwo {
    public static void main(String[] args) {

//        System.out.println(  addTwo(2, 3));
//        System.out.println();
//
//        System.out.println(addTwo(3, 4));
//        System.out.println(multiplyBy.apply(3));


        BiFunction<Integer, Integer, Integer> multiplyTwoValues = (a, b) ->
                (a * b);
        BiFunction<Integer, Integer, Double> powerOfAnotherNumber = (c, d) -> Math.pow(c, d);
        double result2 = powerOfAnotherNumber.apply(3, 10);
        System.out.println(result2);

        //chaining two functions
        BiFunction<Integer, Integer, Integer> chainingTwoFunctions = multiplyTwoValues.andThen(multiplyBy);
        Integer z = chainingTwoFunctions.apply(3, 4);
        System.out.println(z);

        Predicate<String> checkIfName1IsEqualToName2 = name -> name.equals("Toluwase");
        boolean nameOf = checkIfName1IsEqualToName2.test("Toluwase");
        System.out.println(nameOf);

        Supplier<String> greeterSomebody = () -> "Good Morning to you";
        System.out.println(greeterSomebody.get() + " Toluwase");

        Consumer<String> printer = a -> System.out.println(a);
        printer.accept("Hello Everybody");


        //addToList();

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(addToList(List.of(1,2,3,4,5)));

        List <Integer> list3 = new ArrayList<>(List.of(2,3,4,5,6,7,8)) ;
        List <Integer> list4 = list3.stream().map(a->a+2).collect(Collectors.toList());
        System.out.println(list4);


        List<Integer> list5 = new ArrayList<>(List.of(2,3,4,5,6,7,8));
        List <Double> list6 = list3.stream().map(a-> Math.pow(a, 3)).collect(Collectors.toList());
        System.out.println(list6);

        //Fast way to sort, import collections and implement below
        int[] arr = {11,55,22,0,89};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.print("Sorted String Array: ");
        String[] names = {"Steve", "Ajeet", "Kyle"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.print("Sorted List: ");
        List fruits = new ArrayList();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Grapes");
        Collections.sort(fruits);
        for(Object s: fruits) System.out.print(s+", ");

        //.filters through our stream, fetches all elements that are true (that passes our condition)
        //collector then collects to list and output it
        // any match collects predicate and tests if items on list matches the condition and returns true if at least one matches
        // all match collects predicate and tests if items on list matches the condition and returns true if at least one matches
        //nonematch (oppositee of allmatch)
        //dropwhile is the opposite of filter (it drops out/remove)

        List<Integer> list7 = new ArrayList<>(List.of(2,3,4,5,6,7,8));
        List <Integer> list8 = list7.stream().filter(a-> (a%2) ==1).collect(Collectors.toList());
        System.out.println(list8);


        System.out.println(checkOddNumber(list7));


        boolean listeven = list7.stream().anyMatch(a-> (a%10)==0);
        System.out.println(listeven);

        boolean listeven1 = list7.stream().noneMatch(a-> (a%10)==0);
        System.out.println(listeven1);

        boolean listeven2 = list7.stream().allMatch(a->(a%10)==0);
        System.out.println(listeven2);



    }

   //
   //

    static List checkOddNumber (List list7) {
        List<Integer> list8 = new ArrayList<>();
        for (int i = 0; i < list7.size(); i++) {
            int holder = (int) list7.get(i);
            if (holder % 2 == 1) {
                list8.add(holder);
            }
            //System.out.println(num);;
        }
        return list8;
    }


    static int addTwo(int num, int num1) {
        return (num + num1);
    }

    static Function<Integer, Integer> multiplyBy = a -> a * 3;


    public static List addToList(List list) {


        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int temp = (int) list.get(i);
            list2.add(temp + 2);
            //list--> temp--> evaluate --> add
        }
        return list2;
    }





}




//        for (int i = 0; i < list2.size(); i++) {
//            list2.add(list.get(i) + 2);
// list.set(i, list.get(i) + 2);
//        }
        //System.out.println(list);
       // System.out.println(list2);


//function apply, bifunction apply, consumer accepts, biconsumer accept, Predicate tests
//
//return list;
//    }
//
//}
