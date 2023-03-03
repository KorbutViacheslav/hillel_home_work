package home_work_28.repositiry;

import home_work_28.product.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> productList;

    public ProductRepository() {
        this.productList = loadProductList();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductById(long id) {
        return productList.get((int) id);
    }

    public List<Product> loadProductList() {
        List<Product> products = new ArrayList<>();
        products.add(null);
        products.add(new Product("Coca-cola", new BigDecimal(2)));
        products.add(new Product("Beer", new BigDecimal(5)));
        products.add(new Product("Water", new BigDecimal(1)));
        return products;
    }
}
