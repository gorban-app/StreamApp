package com.company;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {

        Person сергей = new Person("Сергей", null);
        System.out.println(сергей
                .getEmail()
                .map(String::toUpperCase)
        .orElse("У Сергея нет почты"));

    }

    static class Person {
        private final String name;
        private final String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
