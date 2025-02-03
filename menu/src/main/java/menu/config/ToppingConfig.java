package menu.config;

import org.springframework.context.annotation.Configuration;
import menu.entity.Topping;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping tomato() {
        return new Topping("Tomato", 0.5, 20);
    }

    @Bean
    public Topping mozzarella() {
        return new Topping("Mozzarella", 1.0, 80);
    }

    @Bean
    public Topping basil() {
        return new Topping("Basil", 0.3, 5);
    }

    @Bean
    public Topping pepperoni() {
        return new Topping("Pepperoni", 1.5, 150);
    }

    @Bean
    public Topping mushrooms() {
        return new Topping("Mushrooms", 0.7, 25);
    }

    @Bean
    public List<Topping> getAllToppings() {
        return Arrays.asList(this.tomato(), this.mozzarella(), this.basil(), this.pepperoni(), this.mushrooms());
    }
}
