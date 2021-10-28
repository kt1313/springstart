package pl.clockworkjava.springstart.di.homework.car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    Chassis chassis;

    @Autowired
    Body body;

    public Car(Body body) {this.body=body;
    }

    public void addChassis() {
        System.out.println();
        System.out.println("Tworzenie samochodu:");
        chassis.createChassis();
    }

    public void addBody(){
        String color=body.getBodyColor();
        System.out.println("Kolor samochodu: "+color);
    }

    public void createCar(){
        addChassis();
        addBody();
        System.out.println("taa daam!");

    }
}
