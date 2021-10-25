package pl.clockworkjava.springstart.di;


import org.junit.Assert;
import org.junit.Test;

public class WeatherTest {

    @Test
    public void testWeatherMod0(){
       Weather w = new Weather(0);
        Assert.assertEquals("prazyyyy!",w.description);
    }

    @Test
    public void testWeatherMod0Neg(){
        Weather w = new Weather(0);
        Assert.assertNotEquals("prazyyyy   !",w.description);
    }
}
