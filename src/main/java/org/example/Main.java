package org.example;

import org.example.Model.Child;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый экзмепляр: ");
        Child c1 = new Child();

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("\nВторой экзмепляр: ");
        Child c2 = new Child("Ivan");
    }
}