package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class _streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Aliz", Gender.PREFER_NOT_TO_SAY)
        );

      people.stream()
              .map(person -> person.name)
              .mapToInt(name -> name.length())
          //    .collect(Collectors.toSet())
              .forEach(System.out::println);


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
        MALE, FEMALE, PREFER_NOT_TO_SAY,
    }
}


