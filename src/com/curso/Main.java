package com.curso;

public class Main {

    public static void main(String[] args) {

        CocheBoton cb1 = new CocheBoton(false);

        cb1.drive();
        cb1.start();
        cb1.drive();

        //////////
        System.out.println();
        //////////

        CocheLlave cc1= new CocheLlave(true);

        cc1.drive();


        //////////
        System.out.println();
        //////////

        CocheMovil cm1 = new CocheMovil();

        cm1.drive();
        cm1.start();
        cm1.drive();

    }
}
