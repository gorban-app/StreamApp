package com.company;

public class User {
    private final String firstname;
    private final String lastname;
    private final Gender gender;
    private final int age;

    public User(String firstname, String lastname, Gender gender, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
