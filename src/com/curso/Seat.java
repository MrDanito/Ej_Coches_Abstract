package com.curso;

public class Seat extends Coche {

    protected final String brand ="Seat";

    public Seat(int horsepower) {
        super(horsepower);
    }

    public Seat() {
    }

    @Override
    public void start() {
        startWithButton();
    }


    public void startWithButton(){
        System.out.println("Arranco con un boton");
        started = true;
    }

}
