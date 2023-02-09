package first.workshop;

import java.math.BigDecimal;

class Product {
    public String name;
    public BigDecimal price;
    public Tax tax;
    Product(String name, BigDecimal price, Tax tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
}
