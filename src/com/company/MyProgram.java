package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        List<String> listArray = Arrays.asList(str.split(" "));
        boolean inWords = listArray.stream()
                .anyMatch(s -> s.equals("повторение") );
        System.out.println(inWords ? "YES":"NO");
    }
}
