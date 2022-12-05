package antonio.shop.common;


import antonio.shop.창고재고Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 창고재고Application.class })
public class CucumberSpingConfiguration {
    
}
