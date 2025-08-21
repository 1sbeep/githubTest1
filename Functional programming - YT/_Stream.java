import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _Stream {
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Aisha", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Alice", Gender.FEMALE)

        );

        //Set<Gender> genders = people.stream().map(person -> person.gender).collect(Collectors.toSet())

         //people.stream().map(person -> person.gender).collect(Collectors.toSet()).
         //forEach(System.out::println);

        //people.stream().mapToInt(person -> person.name.length()).
         //forEach(System.out::println);

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);



         boolean containsOnlyFemales = people.stream().allMatch(personPredicate);

         System.out.println(containsOnlyFemales);




        
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
