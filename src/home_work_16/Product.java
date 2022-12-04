package home_work_16;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Product {
    private int id = new Random().ints(100000, 999999).limit(1).sum();
    private boolean discount = new Random().nextBoolean();
    private TypeOfProduct type = TypeOfProduct.values()[new Random().nextInt(TypeOfProduct.values().length)];
    private double price = toPrice(type);
    private double newPrice = (discount)
            ? new BigDecimal(price - (price / 100 * 10))
            .setScale(2, RoundingMode.HALF_UP).doubleValue()
            : price;
    private LocalDate dateTime = between(LocalDate.of(2021, Month.JANUARY, 01), LocalDate.now());

    public double getNewPrice() {
        return newPrice;
    }

    public int getId() {
        return id;
    }

    public TypeOfProduct getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    private double toPrice(TypeOfProduct type) {
        if (type.equals(TypeOfProduct.BOOK)) {
            return randomDoubles(10, 500);
        } else if (type.equals(TypeOfProduct.ANIMALPRODUCTS)) {
            return randomDoubles(1, 99);
        } else if (type.equals(TypeOfProduct.VEGETABLES)) {
            return randomDoubles(0.5, 20);
        } else {
            return randomDoubles(0.5, 10);
        }
    }

    private double randomDoubles(double a, double b) {
        double d = new Random().doubles(a, b).limit(1).sum();
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    private LocalDate between(LocalDate start, LocalDate end) {
        long started = start.toEpochDay();
        long ended = end.toEpochDay();
        long rand = ThreadLocalRandom.current().nextLong(started, ended);
        return LocalDate.ofEpochDay(rand);
    }

    public String toString() {

        return "Id: [" + getId()
                + "] Type: [" + getType()
                + "] Price: [$" + getPrice()
                + "] New Price: [$" + getNewPrice()
                + "] Sale -10%: [" + isDiscount()
                + "] Date: [" + getDateTime()
                + "]";
    }
}