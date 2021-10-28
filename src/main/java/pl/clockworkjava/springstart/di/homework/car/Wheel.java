package pl.clockworkjava.springstart.di.homework.car;

import org.springframework.stereotype.Component;

@Component
public class Wheel {

    public Wheel() {
        create4Wheels();
    }

    public void create4Wheels(){
        System.out.println("Utworzono kolo 1");
        System.out.println("Utworzono kolo 2");
        System.out.println("Utworzono kolo 3");
        System.out.println("Utworzono kolo 4");

    }
}

