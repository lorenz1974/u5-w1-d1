package menu.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements PriceAndCalories {

    private String name;
    private double price;
    private double calories;
    private boolean isXL;

    private double basePrice = 5.0;
    private double baseCalories = 500;

    List<Topping> toppings;

    private double XL_MULTIPLIER = 1.15;

    public Pizza(String name, List<Topping> toppings) {
        this.name = name;
        this.toppings = toppings;

        this.price = toppings.stream().mapToDouble(Topping::getPrice).sum() + basePrice;
        this.calories = toppings.stream().mapToDouble(Topping::getCalories).sum() + baseCalories;
    }

    public Pizza(String name, List<Topping> toppings, boolean isXL) {
        this.name = name;
        this.toppings = toppings;

        this.calories = (toppings.stream().mapToDouble(Topping::getCalories).sum() + baseCalories) * XL_MULTIPLIER;
        this.price = (toppings.stream().mapToDouble(Topping::getPrice).sum() + basePrice) * XL_MULTIPLIER;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nName\t\tPrice\tCalories\tToppings list\n");
        sb.append("-".repeat(80)).append("\n");
        sb.append(name).append("\t")
                .append(String.format("%.2f", price)).append("\t")
                .append(String.format("%.2f", calories)).append("\t\t");
        toppings.forEach(topping -> sb.append(topping.getName()).append(", "));
        if (!toppings.isEmpty()) {
            sb.setLength(sb.length() - 2); // Remove the last comma and space
        }
        sb.append("\n");
        return sb.toString();
    }
}
