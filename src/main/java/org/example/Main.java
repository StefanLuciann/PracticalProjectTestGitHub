package org.example;

import java.beans.IntrospectionException;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello titi world!");
        printPeriodicallyCurentDateAndTime();
    }

    public static void printPeriodicallyCurentDateAndTime() {
        while (true) {
            try {
                System.out.println(Instant.now());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}