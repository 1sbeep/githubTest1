package Optionals;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person("James","JAMES@gmail.com");
        //System.out.println(person.getEmail().map(String::toLowerCase).orElse("email not provided"));

        System.out.println(person.getEmail().map(string -> string.toLowerCase()).orElse("email not provided"));
        
    }

static class Person {
    private String name;
    private String email;

    Person(String name, String email) {
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return this.name;
    }
    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
}
    
}
