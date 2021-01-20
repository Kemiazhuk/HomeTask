package org.kemy.basicsOfOop.sixthTask;

import org.kemy.basicsOfOop.fourthTask.MaterialTreasure;
import org.kemy.basicsOfOop.sixthTask.accessories.Box;
import org.kemy.basicsOfOop.sixthTask.accessories.Paper;
import org.kemy.basicsOfOop.sixthTask.accessories.Tape;
import org.kemy.basicsOfOop.sixthTask.accessories.TypeOfPaper;
import org.kemy.basicsOfOop.sixthTask.sweetStuf.Cookie;
import org.kemy.basicsOfOop.sixthTask.sweetStuf.Lollipop;
import org.kemy.basicsOfOop.sixthTask.sweetStuf.Marshmallow;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Present present = new Present(new HashMap<>(), BigDecimal.valueOf(0));
        Marshmallow marshmallow = Marshmallow.Builder
                .create()
                .withName("marshmallow")
                .withPrice(BigDecimal.valueOf(1.22))
                .withCalories(120.4)
                .withSize(2)
                .build();
        Lollipop lollipop = Lollipop.Builder
                .create()
                .withName("Lollipop")
                .withPrice(BigDecimal.valueOf(0.78))
                .withCalories(90.1)
                .withColor(Colors.valueOf("GREEN"))
                .build();
        Cookie cookie = Cookie.Builder
                .create()
                .withName("cookie")
                .withPrice(BigDecimal.valueOf(0.78))
                .withCalories(88)
                .withSize(3.2)
                .build();

        Box box = Box.Builder
                .create()
                .withName("Box")
                .withPrice(BigDecimal.valueOf(1))
                .withColor(Colors.valueOf("GREY"))
                .withVolume(2.5)
                .build();
        Paper paper = Paper.Builder
                .create()
                .withName("Paper")
                .withPrice(BigDecimal.valueOf(0.2))
                .withColor(Colors.valueOf("WHITE"))
                .withTypeOfPaper(TypeOfPaper.valueOf("LAMINATED"))
                .build();
        Tape tape = Tape.Builder
                .create()
                .withName("Tape")
                .withPrice(BigDecimal.valueOf(0.25))
                .withColor(Colors.valueOf("RED"))
                .withLength(12.2)
                .build();


        present.addSweet(lollipop, 10);
        present.addSweet(marshmallow, 5);
        present.addSweet(cookie, 2);
        present.addAccessories(box, 1);
        present.addAccessories(paper, 1);
        present.addAccessories(tape, 1);
        System.out.println(present.toString());
    }


}
