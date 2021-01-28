package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)


        );
        System.out.println("//Imperative Approach ");
        //imperative approach to determine number of females
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
               females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }
        System.out.println("//Declarative Approach ");
        //Declarative Approach : Use streams and collections
        people.stream()
                .filter(person -> Gender.FEMALE.equals(person.gender))
                .forEach(System.out::println);

        //Declarative Approach : Use streams and collections
        System.out.println("//Declarative Approach ");

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        List<Person> females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
              //  .forEach(System.out::println);

    }

    static class Person {
        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        private final String name;
        private final Gender gender;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
     //   ArrayList
    }



    enum Gender {
        MALE, FEMALE
    }
}
