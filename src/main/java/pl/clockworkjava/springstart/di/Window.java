package pl.clockworkjava.springstart.di;

public class Window {

    Weather weather;

    public Window(Weather weather)
    {
        this.weather=weather;    }

        public Window(){}

    public void peek(){
        System.out.println(weather.description);
    }
}
