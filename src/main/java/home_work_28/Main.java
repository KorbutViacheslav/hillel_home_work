package home_work_28;

import home_work_28.cart.Cart;
import home_work_28.config.Config;
import home_work_28.repositiry.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(Config.class);
        Cart cart = (Cart) context.getBean("cart");
        cart.addProduct(1);
        cart.getProductList().forEach(System.out::println);
    }
}
