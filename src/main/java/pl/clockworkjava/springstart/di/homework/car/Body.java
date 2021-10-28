package pl.clockworkjava.springstart.di.homework.car;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Body {

    private static final Random random = new Random();
    private String bodyColor;

    public Body() {
        int i = random.nextInt(4) % 4;
        setBodyColor(i);
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(int i) {
        switch (i){
            case 0:
                bodyColor="green";
                break;
            case 1:
                bodyColor="blue";
                break;
            case 2:
                bodyColor="red";
                break;
            case 3:
                bodyColor="black";
                break;
        }
    }
}
