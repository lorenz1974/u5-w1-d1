package menu.config;

import menu.entity.Pizza;
import menu.entity.Topping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class PizzaConfig {

    @Autowired
    private ToppingConfig toppings;

    @Bean
    public Pizza pizzaMargerita() {
        return new Pizza(
                "Margherita",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.basil()));
    }

    public Pizza pizzaPepperoni() {
        return new Pizza(
                "Pepperoni",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.pepperoni()));
    }

    @Bean
    public Pizza pizzaVegetarian() {
        return new Pizza(
                "Vegetarian",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.mushrooms(), toppings.basil()));
    }

    @Bean
    public Pizza pizzaMargeritaXL() {
        return new Pizza(
                "Margherita XL",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.basil()),
                true);
    }

    @Bean
    public Pizza pizzaPepperoniXL() {
        return new Pizza(
                "Pepperoni XL",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.pepperoni()),
                true);
    }

    @Bean
    public Pizza pizzaVegetarianXL() {
        return new Pizza(
                "Vegetarian XL",
                Arrays.asList(toppings.tomato(), toppings.mozzarella(), toppings.mushrooms(), toppings.basil()),
                true);
    }

    @Bean
    public List<Pizza> getAllPizzas() {
        return Arrays.asList(pizzaMargerita(), pizzaPepperoni(), pizzaVegetarian());
    }

    @Bean
    public List<Pizza> getAllXLPizzas() {
        return Arrays.asList(this.pizzaMargeritaXL(), this.pizzaPepperoniXL(), this.pizzaVegetarianXL());
    }
}
