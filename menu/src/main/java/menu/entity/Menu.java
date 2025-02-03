package menu.entity;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Menu {
    List<Pizza> pizzas;
    List<Topping> Toppings;
    List<Beverage> beverages;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("PIZZAS\n");
        sb.append("-".repeat(80)).append("\n");
        pizzas.forEach(pizza -> sb.append(pizza.toString()).append("\n"));
        sb.append("-".repeat(80)).append("\n");

        sb.append("TOPPINGS \n");
        sb.append("-".repeat(80)).append("\n");
        Toppings.forEach(topping -> sb.append(topping.toString()).append("\n"));
        sb.append("-".repeat(80)).append("\n");

        sb.append("BEVERAGES \n");
        sb.append("-".repeat(80)).append("\n");
        beverages.forEach(beverage -> sb.append(beverage.toString()).append("\n"));
        return sb.toString();
    }
}
