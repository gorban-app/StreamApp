package com.company;


import java.util.*;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {

        List<User> userList = getListUser();
        List<User> userStream = new ArrayList<>();

        // filter
        userStream = userList.stream()
                .filter(user -> user.getGender().equals(Gender.MAN))
                .collect(Collectors.toList());
        //userStream.forEach(System.out::println);
        //

        // sort
        userStream = userList.stream()
                .sorted(Comparator.comparing(User::getAge)
             //   .thenComparing(User::getGender) // sort by gender
                        /*.reversed()*/ ) // reversed sort
                .collect(Collectors.toList());
        //userStream.forEach(System.out::println);
        //

        //all match
        boolean allMatch = userList.stream()
                .allMatch(user -> user.getAge() > 100);
        System.out.println(allMatch);

        // any match
        boolean anyMatch = userList.stream()
                .anyMatch(user -> user.getAge() > 100);
        System.out.println(anyMatch);

        //none match
        boolean noneMatch = userList.stream()
                .noneMatch(user -> user.getFirstname().equals("Anna"));
        System.out.println(noneMatch);

        // Min
        userList.stream()
                .max(Comparator.comparing(User::getAge))
                .ifPresent(System.out::println);

        // Min
        userList.stream()
                .min(Comparator.comparing(User::getAge))
                .ifPresent(System.out::println);

        Map<Gender, List<User>> mapGender = userList.stream()
                .collect(Collectors.groupingBy(User::getGender));

        mapGender.forEach((( map, user) ->{
            System.out.println(map);
            user.forEach(System.out::println);
            System.out.println();
        }));

        userList.stream()
                .filter(user -> user.getGender().equals(Gender.WOMAN))
                .max(Comparator.comparing(User::getAge))
                .map(User::getFirstname)
                .ifPresent(System.out::println);

    }

    private static List<User> getListUser() {
        return Arrays.asList(
                new User("Alexander", "Gorban", Gender.MAN, 40),
                new User("Sergey", "Belux", Gender.MAN, 65),
                new User("Nikolay", "Gutkov", Gender.MAN, 66),
                new User("Mihail", "Efremov", Gender.MAN, 67),
                new User("Nikolay", "Proskunin", Gender.MAN, 71),
                new User("Urii", "Proskinin", Gender.MAN, 69),
                new User("Anna", "Polosuhina", Gender.WOMAN, 87),
                new User("Vika", "Sergeeva", Gender.WOMAN, 76),
                new User("Nastya", "Sergeeva", Gender.WOMAN, 94),
                new User("Elena", "Smirnova", Gender.WOMAN, 81));
    }
}
