package menu.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import menu.entity.Menu;

@Component
public class MenuRunner implements CommandLineRunner {
    @Autowired
    private Menu menuStandard;
    @Autowired
    private Menu menuXL;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-".repeat(80));
        System.out.println("**** MENU STANDARD ***");
        System.out.println("-".repeat(80));
        System.out.println(menuStandard);
        System.out.println("");

        System.out.println("-".repeat(80));
        System.out.println("**** MENU XL ***");
        System.out.println("-".repeat(80));
        System.out.println(menuXL);
        System.out.println("");
    }
}
