package com.curso;

public abstract class Coche {

    protected boolean started;

    public Coche(boolean started) {
        this.started = started;
    }

    public Coche() {
    }

    public boolean isStarted(){

        return started;

    }

    public abstract void start();

    public void drive(){

        if (isStarted()){
            System.out.println("El coche se puede conducir.");
        }else {
            System.out.println("No se puede conducir, primero hay que arrancar el coche.");
        }



    }

}
