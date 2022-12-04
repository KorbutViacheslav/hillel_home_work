package home_work_16;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static List<Product> productList = IntStream.range(0, 10).mapToObj(i -> new Product()).collect(Collectors.toList());

    public static void main(String[] args) {
        System.out.println("All products:");
        productList.forEach(System.out::println);
        //Test of task 1
        System.out.println("\nAll products in the BOOK category and over $250:");
        bookCategory(productList).forEach(System.out::println);
        //Test of task 2
        System.out.println("\nAll products in the BOOk category and have a discount:");
        categoryWithDiscount(productList).forEach(System.out::println);
        //Test of task 3
        System.out.println("\nProducts in the BOOK category and have a discount, sorted in ascending order:");
        System.out.println(theCheapestProducInTheCategory(productList));
        //Test of task 4
        System.out.println("\nFirst three books in list:");
        lastThreeProducts(productList).forEach(System.out::println);
        //Test of task 5
        System.out.println("\nFilter by data,type and price sum price: \n$" + addYearTypeBookPrice(productList));
        System.out.println("\nSorting products by type in the MAP:");
        //Test of task 6
        toMap(productList).forEach((type, list) -> {
            System.out.println(type);
            list.forEach(System.out::println);
        });
    }

    public static List<Product> bookCategory(List<Product> list) {
        return list.stream().filter(product -> test(product) && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> categoryWithDiscount(List<Product> list) {
        return list.stream().filter(product -> test(product))
                .filter(Product::isDiscount)
                .collect(Collectors.toList());
    }

    public static Product theCheapestProducInTheCategory(List<Product> list) {
        Optional<Product> cheapest = list.stream().filter(Main::test).min((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        if (cheapest.isEmpty()) {
            throw new NoSuchElementException("List is empty!");
        } else
            return cheapest.get();
    }

    public static List<Product> lastThreeProducts(List<Product> list) {
        return list.stream().sorted(Comparator.comparing(Product::getDateTime).reversed())
                .filter(product -> test(product))
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double addYearTypeBookPrice(List<Product> list) {
        return list.stream().filter(product -> product.getNewPrice() <= 75
                && test(product) && product.getDateTime().getYear() == LocalDate.now()
                .getYear()).mapToDouble(Product::getPrice).sum();
    }

    public static Map<TypeOfProduct, List<Product>> toMap(List<Product> list) {
        return list.stream().collect(Collectors.groupingBy(Product::getType));
    }

    private static boolean test(Product product) {
        return product.getType() == TypeOfProduct.BOOK;
    }
}
