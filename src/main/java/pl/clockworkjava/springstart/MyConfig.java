package pl.clockworkjava.springstart;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.clockworkjava.springstart.di.House;
import pl.clockworkjava.springstart.di.Weather;
import pl.clockworkjava.springstart.di.Window;
import pl.clockworkjava.springstart.di.homework.car.*;

import javax.net.ssl.HostnameVerifier;
import java.util.Arrays;
import java.util.List;

@Configuration
public class MyConfig {

    @Bean
    public Window window1(@Qualifier("sunny") Weather weather) {
        return new Window(weather);
    }

    @Bean
    public Window window2(@Qualifier("rainy") Weather weather) {
        return new Window(weather);
    }

    @Bean
    public Window window3(@Qualifier("rainy") Weather weather) {
        return new Window(weather);
    }

    @Bean("rainy")
    public Weather weather() {
        return new Weather();
    }

    @Bean
    public List<Window> myWindows(@Qualifier("sunny") Weather weather) {
        return Arrays.asList(window1(weather), window2(weather));
    }
    @Bean
    public Wheel wheel() {
        return new Wheel();
    }
    @Bean
    public Engine engine(){
        return new Engine();
    }

    @Bean
    public Chassis chassis(){
        return new Chassis();
    }

    @Bean
    public Body body(){
        return new Body();
    }

    @Bean
    public Car car(Body body){
        return new Car(body);
    }

}
