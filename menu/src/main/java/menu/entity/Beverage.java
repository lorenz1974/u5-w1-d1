package menu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Beverage implements PriceAndCalories {
    private String name;
    private double price;
    private double calories;

    private double XL_MULTIPLIER = 1.15;

    public Beverage(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public Beverage(String name, double price, int calories, boolean isXL) {
        this.name = name;
        this.price = price * XL_MULTIPLIER;
        this.calories = calories * XL_MULTIPLIER;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name\tPrice\tCalories\n");
        sb.append(name).append("\t");
        sb.append(String.format("%.2f", price)).append("\t");
        sb.append(String.format("%.2f", calories)).append("\n");
        return sb.toString();
    }
}
