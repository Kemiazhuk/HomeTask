package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(new ArrayList<>(), BigDecimal.valueOf(0));
        Plant rose = new Plant.Builder()
                .create()
                .withName("Rose")
                .withPrice(BigDecimal.valueOf(7.5))
                .withQuantity(13).withFreshness(2)
                .withLengthStalk(70)
                .build();
//        Plant peony = new Plant("Peony", 50, 4, BigDecimal.valueOf(4.55), 3);
//        Plant tulip = new Plant("Tulip", 70, 1, BigDecimal.valueOf(3.1), 9);
        Accessories paper = new Accessories("paper", BigDecimal.valueOf(3.03), 1, "red");
        Accessories tape = new Accessories("tape", BigDecimal.valueOf(2.02), 2, "red");
        bouquet.addPlant(rose, 3);
        rose.setQuantity(rose.getQuantity() - 3);
        bouquet.addAccessories(paper, 1);
        paper.setQuantity(paper.getQuantity() - 1);
        bouquet.addAccessories(tape, 1);
        tape.setQuantity(tape.getQuantity() - 1);
        System.out.println(bouquet.toString());
    }
}