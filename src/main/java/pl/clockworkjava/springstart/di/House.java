package pl.clockworkjava.springstart.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

@Component
public class House {

    List<Window> windows;

    public House(){
        System.out.println("[HOUSE]Konstruktor");
    }

    @Autowired
    @Qualifier("myWindows")
  public void setWindows(List<Window> windows){
        System.out.println("[HOUSE]metoda ");
        this.windows=windows;
    }

    public void peek() {
        windows.forEach(Window::peek);
    }
}
