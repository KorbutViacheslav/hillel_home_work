package home_work_10.logAbstract;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract public class Logger {
    private Configuration configuration;
    private String currentPath;
    public Logger(Configuration configuration) {
        this.configuration = configuration;
        currentPath = configuration.getPath() + String.format("Log_%s.txt", getDateTimeNow());
    }

    abstract public void debug(String message);

    abstract public void info(String message);

    public String getDateTimeNow() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh-mm-ss");
        return now.format(formatter);
    }
    public String messageTemplate(String message) {
        return String.format(configuration.getFormat(),
                getDateTimeNow(), configuration.getLoggingLevel(), message);
    }
}
