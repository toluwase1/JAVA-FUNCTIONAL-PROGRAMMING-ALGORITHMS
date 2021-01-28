//package functionalInterface;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Consumer;
//
//public class _FunctionalForEach {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Toluwase", "Thomas", "AjibolA");
//        names.forEach(System.out::println);
//
//        Consumer<String> toUpperCase = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s.toUpperCase());
//            }
//        };
//        names.forEach(toUpperCase);
//
//        Map <String, String> map = new Map<String, String>();
//        map.put("A", "B");
//        map.put("B", "Brian");
//        map.put("C", "Charles");
//
//        map.forEach((k,v)->
//                System.out.println("kEY= "+ k + " and value is "+ v)
//
//        );
//
//    }
//
//}
