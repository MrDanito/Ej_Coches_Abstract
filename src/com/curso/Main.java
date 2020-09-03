package com.curso;

public class Main {

    public static void main(String[] args) {

        Seat seat = new Seat(100);

        seat.drive();
        seat.start();
        seat.drive();
        System.out.println("El coche tiene: " + seat.horsepower + " cv de potencia.");

        //////////
        System.out.println();
        //////////

        Mercedes mercedes = new Mercedes(190);

        mercedes.drive();
        System.out.println("El coche tiene: " + mercedes.horsepower + " cv de potencia.");


        //////////
        System.out.println();
        //////////

        Mini mini = new Mini(150);

        mini.drive();
        mini.start();
        mini.drive();
        mini.brake();
        System.out.println("El coche tiene: " + mini.horsepower + " cv de potencia.");


    }
}
