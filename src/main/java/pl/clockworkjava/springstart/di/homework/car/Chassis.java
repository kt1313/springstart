package pl.clockworkjava.springstart.di.homework.car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chassis {

    @Autowired
    Wheel wheel;

    @Autowired
    Engine engine;


    public Chassis(){}

    public void addWheels(){
        System.out.println();
        System.out.println("Dodawanie kol: ");
        wheel.create4Wheels();
    }
    public void addEngine(){
        System.out.println();
        System.out.println("Dodawanie silnika: ");
        engine.setCapacity(4500);
        System.out.println("Pojemnosc: "+engine.getCapacity());
        engine.setVinNr("23GET45BEAN67");
        System.out.println("Nr VIN:  "+engine.getVinNr());

    }
    public void createChassis(){
      addWheels();
      addEngine();
    }
}
