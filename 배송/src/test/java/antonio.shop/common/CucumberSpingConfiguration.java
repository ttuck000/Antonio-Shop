package antonio.shop.common;


import antonio.shop.배송Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 배송Application.class })
public class CucumberSpingConfiguration {
    
}
