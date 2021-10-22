package pl.clockworkjava.springstart.di;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("sunny")
public class Weather {

    private static final Random random = new Random();
    public String description;

    public Weather() {

        int i = random.nextInt(3) % 3;
        switch (i) {
            case 0:
                description = "prazyyyy!";
                break;
            case 1:
                description = "lejeee!";
                break;
            case 2:
                description = "wichooor!";
                break;
        }
    }
}
