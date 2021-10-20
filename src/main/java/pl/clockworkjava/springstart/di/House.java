package pl.clockworkjava.springstart.di;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class House {
    List<Window> windows = new ArrayList<>();

    House(Weather weather) {
        windows.add(new Window(weather));
        windows.add(new Window(weather));
    }

    public House() {
    }

    public void addWindow(Window window) {
        this.windows.add(window);
    }

    public void peek() {

        windows.forEach(Window::peek);
    }
}
