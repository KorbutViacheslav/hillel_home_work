package home_work_10.log_abstract;

import home_work_10.LoggingLevel;

abstract public class AbstractFileLoggerConfigurator {
    private LoggingLevel loggingLevel;
    private String format;
    private String path;
    private long maxSize;

    public AbstractFileLoggerConfigurator(LoggingLevel loggingLevel, String format, String path, long maxSize) {
        this.loggingLevel = loggingLevel;
        this.format = format;
        this.path = path;
        this.maxSize = maxSize;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public void setLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(long maxSize) {
        this.maxSize = maxSize;
    }
}
