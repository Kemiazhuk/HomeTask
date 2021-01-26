package org.kemy.basicsOfOop.fifthTask.accessories;

import org.kemy.basicsOfOop.fifthTask.Accessories;
import org.kemy.basicsOfOop.fifthTask.Colors;

import java.math.BigDecimal;

public class Paper extends Accessories {
    private TypeOfPaper typeOfPaper;

    public static class Builder extends Accessories.Builder<Builder>{
        private TypeOfPaper typeOfPaper;

        public Paper build() {
            return new Paper(name, price, color,this.typeOfPaper);
        }

        public static Builder create() {
            return new Paper.Builder();
        }

        public Builder withTypeOfPaper (TypeOfPaper typeOfPaper){
            this.typeOfPaper = typeOfPaper;
            return this;
        }

    }

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
}
