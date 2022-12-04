package home_work_16;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {

    public double randomDoubles(double a, double b) {
        double d = new Random().doubles(a, b).limit(1).sum();
        return new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public LocalDate between(LocalDate start, LocalDate end) {
        long started = start.toEpochDay();
        long ended = end.toEpochDay();
        long rand = ThreadLocalRandom.current().nextLong(started, ended);
        return LocalDate.ofEpochDay(rand);
    }
}
