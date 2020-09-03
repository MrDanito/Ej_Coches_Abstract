package com.curso;

public class Mercedes extends Coche {

    //Constructor
    public Mercedes(String color, int horsepower) {
        super("Mercedes", color, horsepower);
    }

    public Mercedes() {
    }

    //Metodos
    @Override
    public void start() {
        startWithKey();
    }

    public void startWithKey() {
        System.out.println("Arranco con una llave");
        started = true;
    }

    @Override
    public void stop() {
        stopWithKey();
    }

    public void stopWithKey() {

        if (vel > 0) {

            System.out.println("No se puede apagar el motor con el coche en marcha.");

        } else {

            System.out.println("Paro el motor con la llave");
            started = false;

        }
    }

}
