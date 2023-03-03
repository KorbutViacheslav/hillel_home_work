package home_work_28.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private static long idCounter= 0L;
    private long id;

    private String nameProduct;

    private BigDecimal price;

    public Product(String nameProduct, BigDecimal price) {
        this.id = ++idCounter;
        this.nameProduct = nameProduct;
        this.price = price;
    }
}
