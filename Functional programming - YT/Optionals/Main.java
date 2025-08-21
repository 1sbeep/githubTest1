package Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> empty= Optional.empty();
        //System.out.println(empty.isEmpty());
        //System.out.println(empty.isPresent());

        Optional<String> hello = Optional.of("hello"); //Optional.of is used when you are sure that there 
        //is a value
        //System.out.println(hello.orElse("world"));

        Optional<Object> nullOptional = Optional.ofNullable(null); //Optional.ofNullable is used when you 
        //are not sure whether it contains a value or not

        //System.out.println(nullOptional.orElse("hello"));

        Optional<String> hello2 = Optional.ofNullable(null);

        String orElse = hello2.map(String::toUpperCase).orElse("world");
        //System.out.println(orElse);

        hello.ifPresentOrElse(word -> {
            System.out.println(word);},() -> {
            System.out.println("world");});
    }











    }
