package home_work_28;

import home_work_28.app.AppConsole;
import home_work_28.cart.Cart;
import home_work_28.config.Config;
import home_work_28.repositiry.ProductRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
/*        var context=new AnnotationConfigApplicationContext(Config.class);
        Cart cart = context.getBean(Cart.class);
        Cart cart1 = context.getBean(Cart.class);
        cart1.addProduct(1);
        cart1.getProductList().forEach(System.out::println);
        System.out.println("FIRST CART");
        cart.getRepo().forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        cart.addProduct(1);
        cart.addProduct(2);
        cart.addProduct(4);
        cart.getProductList().forEach(System.out::println);
        System.out.println("____________________________________");
        cart.getRepo().forEach(System.out::println);
        System.out.println("________________________________DELETE id");
        cart.deleteProduct(1);
        cart.deleteProduct(1);
        cart.getProductList().forEach(System.out::println);
        System.out.println("REPOOOOOOOOOOOOOOOO");
        cart.getRepo().forEach(System.out::println);*/
        AppConsole appConsole=new AppConsole();
        appConsole.startMenu();
    }
}
