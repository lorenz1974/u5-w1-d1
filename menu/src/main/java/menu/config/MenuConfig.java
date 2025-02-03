package menu.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import menu.entity.*;

@Configuration
public class MenuConfig {

    @Autowired
    private PizzaConfig pizzaConfig;
    @Autowired
    private ToppingConfig toppingConfig;
    @Autowired
    private BeverageConfig beverageConfig;

    @Bean(name = "menuStandard")
    public Menu standardMenu() {
        Menu menu = new Menu();
        menu.setPizzas(pizzaConfig.getAllPizzas());
        menu.setToppings(toppingConfig.getAllToppings());
        menu.setBeverages(beverageConfig.getAllBeverages());
        return menu;
    }

    @Bean(name = "menuXL")
    public Menu xlMenu() {
        Menu menu = new Menu();
        menu.setPizzas(pizzaConfig.getAllXLPizzas());
        menu.setToppings(toppingConfig.getAllXLToppings());
        menu.setBeverages(beverageConfig.getAllXLBeverages());
        return menu;
    }

}
