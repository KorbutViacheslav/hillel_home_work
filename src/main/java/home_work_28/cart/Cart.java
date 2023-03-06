package home_work_28.cart;

import home_work_28.product.Product;
import home_work_28.repositiry.ProductRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@Scope("prototype")
public class Cart {
    private final ProductRepository PRODUCTREPOSITORY;
    private List<Product> productList;

    public Cart(ProductRepository productRepository) {
        this.productList = new ArrayList<>();
        this.PRODUCTREPOSITORY = productRepository;
    }

    public List<Product> getRepo() {
        return PRODUCTREPOSITORY.getProductList();
    }

    public void addProduct(int id) {
        Product product = PRODUCTREPOSITORY.getProductById(id);
        if (Objects.nonNull(product)) {
            productList.add(product);
            PRODUCTREPOSITORY.removeProduct(product);
        } else {
            System.out.println("The product with id=" + id + " is absent in store.");
        }
    }

    public void deleteProduct(int id) {
        if (productList.stream().anyMatch(p -> Objects.nonNull(p) && p.getId() == id)) {
            Product product = productList.stream()
                    .filter(p -> p.getId() == id).findFirst()
                    .orElse(null);
            PRODUCTREPOSITORY.addProduct(product);
            productList.remove(product);
        } else {
            System.out.println("The product with id=" + id + " is absent in your cart");
        }

    }

    public List<Product> getProductList() {
        if (productList.isEmpty()) {
            System.out.println("Sorry. You dont have eny products in cart.");
        }
        return productList;
    }
}
