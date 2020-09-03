package com.curso;

public class Seat extends Coche {

    //Constructor
    public Seat(String color, int horsepower) {
        super("Seat", color, horsepower);
    }

    public Seat() {
    }

    //Metodos
    @Override
    public void start() {
        startWithButton();
    }

    public void startWithButton() {
        System.out.println("Arranco con un botón");
        started = true;
    }

    @Override
    public void stop() {
        stopWithButton();
    }

    public void stopWithButton() {

        if (vel > 0) {

            System.out.println("No se puede apagar el motor con el coche en marcha.");

        } else {

            System.out.println("Paro el motor con un botón");
            started = false;

        }

    }


}
