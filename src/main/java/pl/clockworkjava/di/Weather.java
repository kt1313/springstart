package pl.clockworkjava.di;

import java.util.Random;

public class Weather {

    private static final Random random = new Random();
    public String description;

    public Weather() {

        int i = random.nextInt(3) % 3;
        switch (i) {
            case 0:
                description = "Swieci slonce";
                break;
            case 1:
                description = "Pada deszcz";
                break;
            case 2:
                description = "wieje wiatr";
                break;
        }
    }
}
