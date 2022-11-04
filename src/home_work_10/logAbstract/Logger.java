package home_work_10.logAbstract;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract public class Logger {
    private Configuration configuration;
    abstract public void debug(String message);

    abstract public void info(String message);

    public String getDateTimeNow() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh-mm-ss");
        return now.format(formatter);
    }
    abstract public String messageTemplate(String message);
}
