package com.curso;

public abstract class Coche {

    protected boolean started = false;
    protected int horsepower;
    protected int vel = 0;
    protected String brand;
    protected String color;

    //Constructor
    public Coche(String brand, String color, int horsepower) {
        this.horsepower = horsepower;
        this.brand = brand;
        this.color = color;
    }

    public Coche() {
    }

    //Getters
    public int getHorsepower() {
        return horsepower;
    }

    public int getVel() {
        return vel;
    }

    public String getColor() {
        return color;
    }

    //Metodos
    public boolean isStarted() {

        return started;

    }

    public abstract void start();

    public abstract void stop();

    public void drive() {

        if (isStarted()) {
            System.out.println("El coche se puede conducir.");
        } else {
            System.out.println("No se puede conducir, primero hay que arrancar el coche.");
        }

    }

    public void acelerate() {

        if (isStarted()) {

            vel++;
            System.out.println("El coche esta acelerando.");

        } else {

            System.out.println("El coche tiene que estar arrancado para poder acelerar.");

        }

    }

    public void brake() {

        if (vel > 0) {

            vel--;
            System.out.println("El coche esta frenando");

        } else {
            System.out.println("El coche esta frenado.");
        }


    }

}
