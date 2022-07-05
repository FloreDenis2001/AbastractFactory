package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Type of car: ");
        Scanner scanner = new Scanner(System.in);
        String carType = scanner.nextLine();

        CarFactory factory = new FactoryProvider().createFactory(carType);
        Car sedan = factory.createSedan();
        System.out.println(sedan);
    }
}
