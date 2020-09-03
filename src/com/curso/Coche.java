package com.curso;

public abstract class Coche {

    protected boolean started = false;
    protected int horsepower;

    public Coche(int horsepower) {
        this.horsepower = horsepower;
    }

    public Coche() {
    }

    public int getHorsepower() {
        return horsepower;
    }

    public boolean isStarted() {

        return started;

    }

    public abstract void start();

    public void drive() {

        if (isStarted()) {
            System.out.println("El coche se puede conducir.");
        } else {
            System.out.println("No se puede conducir, primero hay que arrancar el coche.");
        }

    }

    public void brake() {

        System.out.println("El coche esta frenando");

    }

}
