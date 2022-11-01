package home_work_10.log_abstract;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract public class AbstractFileLogger {
    private AbstractFileLoggerConfigurator abstractFileLoggerConfigurator;
    private String currentPath;
    public AbstractFileLogger(AbstractFileLoggerConfigurator abstractFileLoggerConfigurator) {
        this.abstractFileLoggerConfigurator = abstractFileLoggerConfigurator;
        currentPath = abstractFileLoggerConfigurator.getPath() + String.format("Log_%s.txt", getDateTimeNow());
    }

    abstract public void debug(String message);

    abstract public void info(String message);

    public String getDateTimeNow() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh-mm-ss");
        return now.format(formatter);
    }
    public String messageTemplate(String message) {
        return String.format(abstractFileLoggerConfigurator.getFormat(),
                getDateTimeNow(), abstractFileLoggerConfigurator.getLoggingLevel(), message);
    }
}
