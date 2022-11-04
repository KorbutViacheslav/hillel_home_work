package home_work_10.stdout;

import home_work_10.LoggingLevel;
import home_work_10.logAbstract.Configuration;

public class StdoutLoggerConfiguration extends Configuration {
    private LoggingLevel loggingLevel=LoggingLevel.INFO;
    private String format="[%s] [%s] Message: [%s]";
    private long maxSize=100;

    @Override
    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    @Override
    public String getFormat() {
        return format;
    }
}
