package home_work_10;

public class FileLoggerConfiguration {
    private final LoggingLevel loggingLevel = LoggingLevel.DEBUG;
    private final String format = "%s %s %s %s";
    private final String path = ".\\src\\home_work_10\\";
    private final long maxSize = 100;

    public String getPath() {
        return path;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public String getFormat() {
        return format;
    }
}
