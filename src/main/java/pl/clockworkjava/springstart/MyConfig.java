package pl.clockworkjava.springstart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.clockworkjava.springstart.di.House;
import pl.clockworkjava.springstart.di.Window;

import javax.net.ssl.HostnameVerifier;

@Configuration
public class MyConfig {

    @Bean
    public Window window1(){
        return new Window();
    }

    @Bean
    public Window window2(){
        return window2();
    }

    @Bean
    public House house(){
        return house();
    }
}
