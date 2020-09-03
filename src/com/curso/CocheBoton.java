package com.curso;

public class CocheBoton extends Coche {

    public CocheBoton(boolean started) {
        super(started);
    }

    public CocheBoton() {
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
