package org.kemy.basicsOfOop.sixthTask;

import java.math.BigDecimal;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Present present = new Present(new HashMap<>(), BigDecimal.valueOf(0));
        Sweet marshmallow = Sweet.Builder
                .create()
                .withName("marshmallow")
                .withPrice(BigDecimal.valueOf(1.22))
                .withQuantity(100)
                .withBrandOfSweet("Spartak")
                .build();
        Sweet candy = Sweet.Builder
                .create()
                .withName("candy")
                .withPrice(BigDecimal.valueOf(0.78))
                .withQuantity(100)
                .withBrandOfSweet("Kamunarka")
                .build();
        Sweet cookie = Sweet.Builder
                .create()
                .withName("cookie")
                .withPrice(BigDecimal.valueOf(0.78))
                .withQuantity(100)
                .withBrandOfSweet("Kamunarka")
                .build();

        Accessories box = Accessories.Builder
                .create()
                .withName("Box")
                .withPrice(BigDecimal.valueOf(1))
                .withQuantity(10)
                .withColor("Grey")
                .build();
        Accessories paper = Accessories.Builder
                .create()
                .withName("Paper")
                .withPrice(BigDecimal.valueOf(0.2))
                .withQuantity(33)
                .withColor("White")
                .build();
        Accessories tape = Accessories.Builder
                .create()
                .withName("Tape")
                .withPrice(BigDecimal.valueOf(0.25))
                .withQuantity(30)
                .withColor("Red")
                .build();

        present.addSweet(candy, 10);
        present.addSweet(marshmallow, 5);
        present.addSweet(cookie, 2);
        present.addAccessories(box, 1);
        present.addAccessories(paper, 1);
        present.addAccessories(tape, 1);
        System.out.println(present.toString());
    }


}
