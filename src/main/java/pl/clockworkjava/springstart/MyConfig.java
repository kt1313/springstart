package pl.clockworkjava.springstart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.clockworkjava.springstart.di.House;
import pl.clockworkjava.springstart.di.Weather;
import pl.clockworkjava.springstart.di.Window;

import javax.net.ssl.HostnameVerifier;

@Configuration
public class MyConfig {

    @Bean
    public Window window1(Weather weather){
        return new Window( weather);
    }

    @Bean
    public Window window2( Weather weather){

        return new Window(weather);
    }
//@Bean
//    public House house(){
//        return new House();
//}
}
