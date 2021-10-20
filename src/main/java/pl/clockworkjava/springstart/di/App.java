package pl.clockworkjava.springstart.di;

public class App {
    public static void main(String[] args) {

        Weather weather=new Weather();
        House house = new House(weather);

        house.peek();
    }
}
