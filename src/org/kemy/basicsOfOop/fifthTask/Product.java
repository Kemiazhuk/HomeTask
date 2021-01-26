package org.kemy.basicsOfOop.fifthTask;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public static class Builder {
        public String name;
        public BigDecimal price;

//        public static Builder create() {
//            return new Builder();
//        }

        public Product build() {
            return new Product(this.name, this.price);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            this.price = price;
            return this;
        }
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}

