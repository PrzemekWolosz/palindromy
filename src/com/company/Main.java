package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        isPalindorm(getWord());
    }

    public static String getWord () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word to check if it is palindorm");
        String word = scanner.nextLine();
        return word;
    }

    public static void isPalindorm (String word) {
        String front = "";
        for (int i = 0; i < word.length() ; i++) {
            front = front + word.charAt(i);
        }
        String back = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            back = back + word.charAt(i);
        }
        if (front.toUpperCase().equals(back.toUpperCase())) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindorm");
        }
    }
}