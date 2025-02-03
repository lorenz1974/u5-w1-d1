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
    public Beverage coffeeXL() {
        return new Beverage("Coffee XL", 3.50, 5, true);
    }

    @Bean
    public Beverage teaXL() {
        return new Beverage("Tea XL", 2.50, 2, true);
    }

    @Bean
    public Beverage juiceXL() {
        return new Beverage("Juice XL", 4.00, 50, true);
    }

    @Bean
    public Beverage waterXL() {
        return new Beverage("Water XL", 1.50, 0, true);
    }

    @Bean
    public Beverage sodaXL() {
        return new Beverage("Soda XL", 3.00, 150, true);
    }

    @Bean
    public List<Beverage> getAllBeverages() {
        return Arrays.asList(this.coffee(), this.tea(), this.juice(), this.water(), this.soda());
    }

    @Bean
    public List<Beverage> getAllXLBeverages() {
        return Arrays.asList(this.coffeeXL(), this.teaXL(), this.juiceXL(), this.waterXL(), this.sodaXL());
    }
}
