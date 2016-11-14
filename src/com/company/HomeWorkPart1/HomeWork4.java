package com.company.HomeWorkPart1;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.println("Введите слово: ");
            name = scanner.next();

            if (name.length() > 9) {
                System.out.println(" " + name.charAt(0) + (name.length() - 2) + name.charAt(name.length() - 1));
            } else {
                System.out.println(name);
            }
            System.out.println("Добавить ещё продукт (Yes)1/0(no)? ");
            if (scanner.nextInt() == 0) {
                break;
            }
        }
    }
}
