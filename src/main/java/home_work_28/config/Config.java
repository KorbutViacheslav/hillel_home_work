package home_work_28.config;

import home_work_28.cart.Cart;
import home_work_28.repositiry.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "home_work_28")
public class Config {
/*    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart(productRepository());
    }*/
}
