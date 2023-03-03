package home_work_28.cart;

import home_work_28.product.Product;
import home_work_28.repositiry.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static ProductRepository productRepository;
    private List<Product> productList;

    public Cart(ProductRepository productRepository) {
        Cart.productRepository = productRepository;
        this.productList = new ArrayList<>();
    }

    public void addProduct(long id) {
        productList.add(productRepository.getProductById(id));
    }

    public void deleteProduct(long id) {
        System.out.println("DELETE "+productList.get((int) id));
        productList.remove(id);
    }

    public List<Product> getProductList() {
        if (productList.isEmpty()) {
            System.out.println("Sorry. You dont have eny products in cart.");
        }
        return productList;
    }
}
