package com.curso;

public class Mini extends Coche {

    //Constructor
    public Mini(String color, int horsepower) {
        super("Mini", color, horsepower);
    }

    public Mini() {
    }

    //Metodos
    @Override
    public void start() {
        startWithMobile();
    }

    public void startWithMobile() {
        System.out.println("Arranco con el móvil.");
        started = true;
    }

    @Override
    public void stop() {
        stopWithMobile();
    }

    public void stopWithMobile() {

        if (vel > 0) {

            System.out.println("No se puede apagar el motor con el coche en marcha.");

        } else {

            System.out.println("Paro el motor con un botón");
            started = false;

        }
    }

}
