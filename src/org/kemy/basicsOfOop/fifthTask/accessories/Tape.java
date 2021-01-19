package org.kemy.basicsOfOop.fifthTask.accessories;

import org.kemy.basicsOfOop.fifthTask.Accessories;
import org.kemy.basicsOfOop.fifthTask.plants.Colors;

import java.math.BigDecimal;

public class Tape extends Accessories {
    private double length;

    public static class Builder {
        private String name;
        private BigDecimal price;
        private Colors color;
        private double length;

        public Tape build() {
            return new Tape(this.name, this.price, this.color,this.length);
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

        public Builder withLength (double length){
            this.length = length;
            return this;
        }

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Tape(String name, BigDecimal price, Colors color, double length) {
        super(name, price, color);
        this.length = length;
    }

}
