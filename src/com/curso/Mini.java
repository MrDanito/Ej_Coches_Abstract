package com.curso;

public class Mini extends Coche {

    protected final String brand = "Mini";


    public Mini(int horsepower) {
        super(horsepower);
    }

    public Mini() {
    }

    @Override
    public void start() {
        startWithMobile();
    }

    public void startWithMobile() {
        System.out.println("Arranco con el móvil.");
        started = true;
    }

}
