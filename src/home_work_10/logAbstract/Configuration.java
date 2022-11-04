package home_work_10.logAbstract;

import home_work_10.LoggingLevel;

abstract public class Configuration {
    private LoggingLevel loggingLevel;
    private String format;

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public String getFormat() {
        return format;
    }
}