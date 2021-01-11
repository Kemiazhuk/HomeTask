package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(new ArrayList<>(), new ArrayList<>(), BigDecimal.valueOf(0) );
        bouquet.addPlant(new Plant("Rose", 100, 2, BigDecimal.valueOf(7.5), 3));
        bouquet.addPlant(new Plant("Peony", 50, 4, BigDecimal.valueOf(4.55), 3));
        bouquet.addPlant(new Plant("Tulip", 70, 1, BigDecimal.valueOf(3.1), 9));
        bouquet.addAccessories(new Accessories("paper", BigDecimal.valueOf(3.03)));
        bouquet.addAccessories(new Accessories("tape", BigDecimal.valueOf(2.02)));
        System.out.println(bouquet.toString());
    }
}