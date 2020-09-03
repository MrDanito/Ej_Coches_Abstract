package com.curso;

public class CocheMovil extends Coche {

    public CocheMovil(boolean started) {
        super(started);
    }

    public CocheMovil() {
    }

    @Override
    public void start() {
        startWithMobile();
    }

    public void startWithMobile(){
        System.out.println("Arranco con el móvil.");
        started = true;
    }

}
