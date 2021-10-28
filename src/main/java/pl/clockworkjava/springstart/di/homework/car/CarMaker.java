package pl.clockworkjava.springstart.di.homework.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CarMaker implements ApplicationRunner {

    @Autowired
    Car car;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=-=-=-=-=-=-=");
        car.createCar();
        System.out.println("=-=-=-=-=-=-=");

    }
}
