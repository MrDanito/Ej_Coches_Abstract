package com.curso;

public class CocheLlave extends Coche {

    public CocheLlave(boolean started) {
        super(started);
    }

    public CocheLlave() {
    }

    @Override
    public void start() {
        startWithKey();
    }

    public void startWithKey(){
        System.out.println("Arranco con un boton");
        started = true;
    }

}
