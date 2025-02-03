package menu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Beverage implements PriceAndCalories {
    private String name;
    private double price;
    private int calories;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name\tPrice\tCalories\n");
        sb.append(name).append("\t");
        sb.append(price).append("\t");
        sb.append(calories).append("\n");
        return sb.toString();
    }
}
