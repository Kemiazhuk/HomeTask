package org.kemy.basicsOfOop.fifthTask.accessories;

import org.kemy.basicsOfOop.fifthTask.Accessories;
import org.kemy.basicsOfOop.fifthTask.Colors;

import java.math.BigDecimal;

public class Tape extends Accessories {
    private double length;

    public static class Builder extends Accessories.Builder<Builder>  {
        protected double length;

        public Tape build() {
            return new Tape(name, price, color,this.length);
        }

        public static Builder create() {
            return new Tape.Builder();
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
