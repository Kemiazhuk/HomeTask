package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Bouquet bouquet = new Bouquet(new ArrayList<>(), BigDecimal.valueOf(0));
        Plant rose = Plant.Builder
                .create()
                .withName("Rose")
                .withPrice(BigDecimal.valueOf(7.5))
                .withQuantity(13)
                .withFreshness(2)
                .withLengthStalk(70)
                .build();
        Plant peony = Plant.Builder
                .create()
                .withName("Peony")
                .withPrice(BigDecimal.valueOf(4.55))
                .withQuantity(50)
                .withFreshness(3)
                .withLengthStalk(50)
                .build();
        Plant tulip = Plant.Builder
                .create()
                .withName("Tulip")
                .withPrice(BigDecimal.valueOf(3.1))
                .withQuantity(70)
                .withFreshness(1)
                .withLengthStalk(45)
                .build();
        Accessories paper = Accessories.Builder
                .create()
                .withName("paper")
                .withPrice(BigDecimal.valueOf(3.03))
                .withQuantity(3)
                .withColor("red")
                .build();
        Accessories tape = Accessories.Builder
                .create()
                .withName("tape")
                .withPrice(BigDecimal.valueOf(2.02))
                .withQuantity(2)
                .withColor("red")
                .build();
        Plant roseForBouquet = (Plant) rose.clone();
        bouquet.addPlant(roseForBouquet, 3);
        rose.setQuantity(rose.getQuantity() - 3);

        Accessories accessoriesForBouquet = (Accessories) paper.clone();
        bouquet.addAccessories(accessoriesForBouquet, 1);
        paper.setQuantity(paper.getQuantity() - 1);

        accessoriesForBouquet = (Accessories) tape.clone();
        bouquet.addAccessories(accessoriesForBouquet, 1);
        tape.setQuantity(tape.getQuantity() - 1);

        System.out.println(bouquet.toString());
    }

}