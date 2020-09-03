package com.curso.tombola;

import com.curso.IMusicable;
import com.curso.Mercedes;
import com.curso.Mini;
import com.curso.Seat;

import java.util.Random;

public class Tombola {

    Random random = new Random();

    public IMusicable sortearElemento(){

        int num = random.nextInt(10);

        if (num >0 && num <4){
            return new Mercedes();
        }else if(num >= 4 && num <8){
            return new Mini();
        }else {
            return new Seat();
        }


    }

}
