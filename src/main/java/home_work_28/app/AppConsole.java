package home_work_28.app;

import home_work_28.cart.Cart;
import home_work_28.config.Config;
import home_work_28.product.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class AppConsole {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    Cart cart = context.getBean(Cart.class);

    public void startMenu() {
        System.out.println("Starting menu...");
        System.out.println("Enter one of the teams:");
        printMenu();
        while (true) {
            System.out.println("Enter new command...");
            String choice = scanner();
            switch (choice) {
                case "add" -> {
                    System.out.println("Enter ID product what your want added.");
                    System.out.println("1-Coca-cola\n2-Beer\n3-Water");
                    String productID = scanner();
                    if (isNumeric(productID)) {
                        cart.addProduct(Integer.parseInt(productID));
                        System.out.println("Added product with id=" + productID);
                    } else {
                        System.out.println("Incorrect ID");
                    }
                }
                case "delete" -> {
                    System.out.println("What product by ID your want delete?");
                    System.out.println("Your cart-list: " + cart.getProductList());
                    String productId = scanner();
                    if (isNumeric(productId)) {
                        cart.deleteProduct(Integer.parseInt(productId));
                        System.out.println("Deleted product with id=" + productId);
                    } else {
                        System.out.println("Incorrect product ID");
                    }
                }
                case "cart" -> {
                    System.out.println("Your cart-list: ");
                    cart.getProductList().forEach(System.out::println);
                }
                case "finish" -> {
                    System.out.println("Program is over!");
                    return;
                }
                default -> System.out.println("Your enter incorrect command");
            }
        }
    }

    private String scanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private void printMenu() {
        System.out.println("add - Add the product to your cart.");
        System.out.println("deleted - Delete the product from your cart.");
        System.out.println("cart - show all the product from your cart");
        System.out.println("finish - finish work of program.");
    }

    private static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
