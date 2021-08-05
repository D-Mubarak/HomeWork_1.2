package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        String name;

        System.out.print("Введите ваше имя: ");

        name = str.nextLine();

        System.out.println("Здравствуйте " + name);
    }
}