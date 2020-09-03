package com.curso;

public class Main {

    public static void main(String[] args) {

        Seat seat = new Seat("Rojo", 100);

        seat.drive();
        seat.start();
        seat.drive();
        System.out.println("El coche tiene: " + seat.horsepower + " cv de potencia.");

        //////////
        System.out.println("--------------------");
        //////////

        Mercedes mercedes = new Mercedes("Negro", 190);

        mercedes.drive();
        System.out.println("El coche tiene: " + mercedes.horsepower + " cv de potencia.");


        //////////
        System.out.println("--------------------");
        //////////

        Mini mini = new Mini("Verde Botella", 150);

        mini.drive();
        mini.start();
        mini.drive();
        mini.acelerate();
        mini.acelerate();
        mini.acelerate();
        System.out.println("Velocidad: " + mini.getVel());
        mini.brake();
        System.out.println("Velocidad: " + mini.getVel());
        System.out.println("El coche tiene: " + mini.horsepower + " cv de potencia.");


    }
}
