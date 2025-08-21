import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Intro {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Aisha", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Alice", Gender.FEMALE),
            new Person("Heejaai",Gender.MALE)

        );

        System.out.println("//Imperative approach");
        List<Person> females = new ArrayList<>();
        
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            //System.out.println(female);
        }

        System.out.println(females);


        System.out.println("//Declarative approach");

        //1 version
        people.stream()
        .filter(person -> Gender.FEMALE.equals(person.gender))
        .forEach(System.out::println);

        //2 version
        List<Person> females2 = people.stream()
        .filter(person -> Gender.FEMALE.equals(person.gender))
        .collect(Collectors.toList());
        females2.forEach(System.out::println);

        //3 version
        Predicate<Person> PersonPredicate = person -> Gender.FEMALE.equals(person.gender);
        people.stream()
        .filter(PersonPredicate)
        .forEach(System.out::println);

        System.out.println("sorted");
        System.out.println(people.stream().sorted(Comparator.comparing(person -> person.name)).collect(Collectors.toList()));
        
        System.out.println(people.stream().collect(Collectors.groupingBy(person -> person.gender)));

        System.out.println(people.stream().max(Comparator.comparing(person -> person.name.length())));



        
        

    }


    static class Person {
        String name;
        Gender gender;

    Person(String name, Gender gender) {
        this.name=name;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", " + "gender: " + gender;
    }
    }

    enum Gender {
        MALE,FEMALE
    }
}

