package menu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import menu.entity.Beverage;
import java.util.List;
import java.util.Arrays;

@Configuration
public class BeverageConfig {

    @Bean
    public Beverage coffee() {
        return new Beverage("Coffee", 2.50, 5);
    }

    @Bean
    public Beverage tea() {
        return new Beverage("Tea", 2.00, 2);
    }

    @Bean
    public Beverage juice() {
        return new Beverage("Juice", 3.00, 50);
    }

    @Bean
    public Beverage water() {
        return new Beverage("Water", 1.00, 0);
    }

    @Bean
    public Beverage soda() {
        return new Beverage("Soda", 2.00, 150);
    }

    @Bean
    public List<Beverage> getAllBeverages() {
        return Arrays.asList(this.coffee(), this.tea(), this.juice(), this.water(), this.soda());
    }
}
