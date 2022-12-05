package antonio.shop.common;


import antonio.shop.BoundedContext1170Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext1170Application.class })
public class CucumberSpingConfiguration {
    
}
