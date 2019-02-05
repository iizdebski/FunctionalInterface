package com.izdebski;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n -- Constructor References --");
        PersonFactory<Person>personFactory = Person::new;
        Person person = personFactory.create("Peter", "Petrenko");
        System.out.println(person);
    }
}