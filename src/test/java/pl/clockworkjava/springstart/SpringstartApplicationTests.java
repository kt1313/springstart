package pl.clockworkjava.springstart;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.clockworkjava.springstart.di.Weather;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringstartApplicationTests {

	@Autowired
	@Qualifier("sunny")Weather weather;

	@Test
	public void weatherInjectionTest(){
		Assert.assertFalse(weather.description.isEmpty());
	}



	@Test
	void contextLoads() {
	}

}
