package com.curso;

public class Mercedes extends Coche {

    protected final String brand ="Mercedes";


    public Mercedes(int horsepower) {
        super(horsepower);
    }

    public Mercedes() {
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
