package pl.clockworkjava.springstart;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.clockworkjava.springstart.di.House;
import pl.clockworkjava.springstart.di.Weather;
import pl.clockworkjava.springstart.di.Window;

import javax.net.ssl.HostnameVerifier;

@Configuration
public class MyConfig {

    @Bean
    public Window window1(@Qualifier("sunny") Weather weather){
        return new Window( weather);
    }

    @Bean
    public Window window2( @Qualifier("rainy") Weather weather){

        return new Window(weather);
    }
    @Bean("rainy")
    public Weather weather(){
        return new Weather();
    }
//@Bean
//    public House house(){
//        return new House();
//}
}
