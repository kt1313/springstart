package pl.clockworkjava.springstart.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;
@Component
public class House {
    @Autowired
    List<Window> windows;

    public void peek() {
        windows.forEach(Window::peek);
    }
}
