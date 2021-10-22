package pl.clockworkjava.springstart.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Window {

    Weather weather;

    public Window(Weather weather) {
        this.weather = weather;
    }

    public void peek() {
        System.out.println(weather.description);
    }
}
