package home_work_16;

import java.time.LocalDate;
import java.time.Month;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = IntStream.range(0, 10).mapToObj(i -> new Product()).collect(Collectors.toList());
        System.out.println("All products:");
        productList.forEach(System.out::println);
        System.out.println("\nAll products in the BOOK category and over $250:");
        bookCategory(productList).forEach(System.out::println);
        System.out.println("\nAll products in the BOOk category and have a discount:");
        categoryWithDiscount(productList).forEach(System.out::println);
        System.out.println("\nProducts in the BOOK category and have a discount, sorted in ascending order:");
        theCheapestCategory(productList).forEach(System.out::println);
        System.out.println("\nFirst three books in list:");
        lastThreeProducts(productList).forEach(System.out::println);
        System.out.println("\nFilter by data,type and price:");
        addYearTypeBookPrice(productList).forEach(System.out::println);
        System.out.println("\nSorting products by type in the MAP:");
        toMap(productList).forEach((type, list) -> {
            System.out.println(type);
            list.forEach(System.out::println);
        });
    }

    public static List<Product> bookCategory(List<Product> list) {
        return list.stream().filter(product -> product.getType() == TypeOfProduct.BOOK && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> categoryWithDiscount(List<Product> list) {
        return list.stream().filter(product -> product.getType() == TypeOfProduct.BOOK)
                .filter(Product::isDiscount)
                .collect(Collectors.toList());
    }

    public static List<Product> theCheapestCategory(List<Product> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty!");
        }
        return list.stream().sorted((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()))
                .filter(product -> product.getType() == TypeOfProduct.BOOK)
                .limit(1)
                .collect(Collectors.toList());
    }

    public static List<Product> lastThreeProducts(List<Product> list) {
        return list.stream().sorted(Comparator.comparing(Product::getDateTime).reversed())
                .filter(product -> product.getType() == TypeOfProduct.BOOK)
                .limit(3)
                .collect(Collectors.toList());
    }

    public static List<Product> addYearTypeBookPrice(List<Product> list) {
        LocalDate limitYear = LocalDate.of(2022, Month.JANUARY, 1);
        return list.stream().sorted(Comparator.comparing(Product::getDateTime))
                .filter(product -> product.getType() == TypeOfProduct.BOOK
                        && product.getPrice() < 75
                        && product.getDateTime().isAfter(limitYear))
                .collect(Collectors.toList());
    }

    public static Map<TypeOfProduct, List<Product>> toMap(List<Product> list) {
        return list.stream().collect(Collectors.groupingBy(Product::getType));
    }

}
