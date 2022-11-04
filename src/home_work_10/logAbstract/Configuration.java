package home_work_10.logAbstract;

import home_work_10.LoggingLevel;

abstract public class Configuration {
    private LoggingLevel loggingLevel;
    private String format;
    private String path;
    private long maxSize;

    public Configuration(LoggingLevel loggingLevel, String format, String path, long maxSize) {
        this.loggingLevel = loggingLevel;
        this.format = format;
        this.path = path;
        this.maxSize = maxSize;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public String getFormat() {
        return format;
    }

    public String getPath() {
        return path;
    }

    public long getMaxSize() {
        return maxSize;
    }
}