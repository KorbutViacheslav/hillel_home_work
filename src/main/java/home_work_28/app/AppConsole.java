package home_work_28.app;

import home_work_28.cart.Cart;
import home_work_28.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;
import java.util.Scanner;

public class AppConsole {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    Cart cart = context.getBean(Cart.class);

    public void startMenu() {
        System.out.println("Starting menu...");
        printMenu();
        while (true) {
            System.out.println("Enter new command...");
            String choice = scanner();
            switch (choice) {
                case "add":
                    System.out.println("Enter ID product what your want added.");
                    System.out.println("1-Coca-cola\n2-Beer\n3-Wather");
                    String productID = scanner();
                    if (isNumeric(productID)) {
                        cart.addProduct(Integer.parseInt(productID));
                        System.out.println("Added product with id=" + productID);
                    } else {
                        System.out.println("Incorrect ID");
                    }

                    break;
                case "delete":
                    System.out.println("What product by ID your want delete?");
                    System.out.println("Your cart-list: " + cart.getProductList());
                    String productId = scanner();
                    if (isNumeric(productId)) {
                        cart.deleteProduct(Integer.parseInt(productId));
                        System.out.println("Deleted product with id=" + productId);
                    } else {
                        System.out.println("Incorrect ID");
                    }
                    break;
                case "cart":
                    cart.getProductList().forEach(System.out::println);
                    return;
                case "finish":
                    System.out.println("Program is over!");
                    return;
                default:
                    System.out.println("Your enter incorrect command");
                    break;
            }
        }
    }

    public String scanner() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    private void printMenu() {
        System.out.println("add");
        System.out.println("delete");
        System.out.println("cart");
        System.out.println("finish");
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
