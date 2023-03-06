package home_work_28.repositiry;

import home_work_28.product.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    public ProductRepository() {
        this.productList = loadProductList();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProductById(int id) {
        return productList.stream()
                .filter(p -> p.getId() == id).findFirst()
                .orElse(null);
    }

    public List<Product> loadProductList() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Coca-cola", new BigDecimal(2)));
        products.add(new Product(1, "Coca-cola", new BigDecimal(2)));
        products.add(new Product(1, "Coca-cola", new BigDecimal(2)));
        products.add(new Product(2, "Beer", new BigDecimal(5)));
        products.add(new Product(2, "Beer", new BigDecimal(5)));
        products.add(new Product(3, "Water", new BigDecimal(1)));
        return products;
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }
    public void addProduct(Product product){
        productList.add(product);
    }
}
