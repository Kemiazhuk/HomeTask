package org.kemy.basicsOfOop.fifthTask;

import org.kemy.basicsOfOop.fifthTask.accessories.Paper;
import org.kemy.basicsOfOop.fifthTask.accessories.Tape;
import org.kemy.basicsOfOop.fifthTask.accessories.TypeOfPaper;
import org.kemy.basicsOfOop.fifthTask.plants.Peony;
import org.kemy.basicsOfOop.fifthTask.plants.Rose;
import org.kemy.basicsOfOop.fifthTask.plants.Tulip;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet(new ArrayList<Product>(),new ArrayList<Integer>(), new BigDecimal("0"));

        Product rose = Rose.Builder
                .create()
                .withLengthThorns(0.2)
                .withColor(Colors.valueOf("RED"))
                .withFreshness(2)
                .withLengthStalk(70)
                .withPrice(BigDecimal.valueOf(7.5))
                .withName("Rose")
                .build();
        Peony peony = Peony.Builder
                .create()
                .withName("Peony")
                .withPrice(BigDecimal.valueOf(4.55))
                .withFreshness(3)
                .withLengthStalk(50)
                .withColor(Colors.valueOf("RED"))
                .withBuds(2)
                .build();
        Tulip tulip = Tulip.Builder
                .create()
                .withName("Tulip")
                .withPrice(BigDecimal.valueOf(3.1))
                .withFreshness(1)
                .withLengthStalk(45)
                .withColor(Colors.valueOf("YELLOW"))
                .withFlowerLeaves(2)
                .build();
        Paper paper = Paper.Builder
                .create()
                .withName("paper")
                .withPrice(BigDecimal.valueOf(3.03))
                .withAccessoriesColor(Colors.valueOf("WHITE"))
                .withTypeOfPaper(TypeOfPaper.valueOf("GLITTER"))
                .build();
        Tape tape = Tape.Builder
                .create()
                .withName("tape")
                .withPrice(BigDecimal.valueOf(2.02))
                .withAccessoriesColor(Colors.valueOf("RED"))
                .withLength(11.2)
                .build();

        bouquet.addPlant(rose, 3);
        bouquet.addPlant(peony, 3);
        bouquet.addPlant(tulip, 3);

        bouquet.addAccessories(paper, 1);
        bouquet.addAccessories(tape, 1);

        System.out.println(bouquet.toString());
    }

}