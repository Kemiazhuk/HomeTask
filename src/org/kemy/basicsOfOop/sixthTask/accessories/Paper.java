package org.kemy.basicsOfOop.sixthTask.accessories;

import org.kemy.basicsOfOop.sixthTask.Accessories;
import org.kemy.basicsOfOop.sixthTask.Colors;

import java.math.BigDecimal;

public class Paper extends Accessories {
    private TypeOfPaper typeOfPaper;

    public TypeOfPaper getTypeOfPaper() {
        return typeOfPaper;
    }

    public void setTypeOfPaper(TypeOfPaper typeOfPaper) {
        this.typeOfPaper = typeOfPaper;
    }

    public Paper(String name, BigDecimal price, Colors color, TypeOfPaper typeOfPaper) {
        super(name, price, color);
        this.typeOfPaper = typeOfPaper;
    }

    public static class Builder {
        private String name;
        private BigDecimal price;
        private Colors color;
        private TypeOfPaper typeOfPaper;

        public Paper build() {
            return new Paper(this.name, this.price, this.color, this.typeOfPaper);
        }

        public static Builder create() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }


        public Builder withColor(Colors color) {
            this.color = color;
            return this;
        }

        public Builder withTypeOfPaper(TypeOfPaper typeOfPaper) {
            this.typeOfPaper = typeOfPaper;
            return this;
        }

    }
}
