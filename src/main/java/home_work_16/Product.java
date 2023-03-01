package home_work_16;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Product {
    private Utils utils = new Utils();
    private boolean discount = new Random().nextBoolean();
    private TypeOfProduct type = TypeOfProduct.values()[new Random().nextInt(TypeOfProduct.values().length)];
    private double price = toPrice(type);
    private double newPrice = discount ? (discount) ? new BigDecimal(price - (price / 100 * 10))
            .setScale(2, RoundingMode.HALF_UP).doubleValue() : price : 0;
    private LocalDate dateTime = utils.between(LocalDate.of(2021, Month.JANUARY, 01), LocalDate.now());

    public double getNewPrice() {
        return newPrice;
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
            return utils.randomDoubles(10, 500);
        } else if (type.equals(TypeOfProduct.ANIMALPRODUCTS)) {
            return utils.randomDoubles(1, 99);
        } else if (type.equals(TypeOfProduct.VEGETABLES)) {
            return utils.randomDoubles(0.5, 20);
        } else {
            return utils.randomDoubles(0.5, 10);
        }
    }

    public String toString() {
        String withDiscount = "Type: [" + getType()
                + "] Price: [$" + getPrice()
                + "] Sale -10%: [" + isDiscount()
                + "] New Price: [$" + getNewPrice()
                + "] Date: [" + getDateTime()
                + "]";
        String withoutDiscount = "Type: [" + getType()
                + "] Price: [$" + getPrice()
                + "] Sale -10%: [" + isDiscount()
                + "] Date: [" + getDateTime()
                + "]";
        return discount ? withDiscount : withoutDiscount;
    }
}