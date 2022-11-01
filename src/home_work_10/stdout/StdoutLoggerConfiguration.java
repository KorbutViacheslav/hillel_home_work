package home_work_10.stdout;

import home_work_10.LoggingLevel;
import home_work_10.log_abstract.AbstractFileLoggerConfigurator;

public class StdoutLoggerConfiguration extends AbstractFileLoggerConfigurator {
    private LoggingLevel loggingLevel;
    private String format;
    private String path;
    private long maxSize;
    public StdoutLoggerConfiguration(LoggingLevel loggingLevel, String format, String path, long maxSize) {
        super(loggingLevel, format, path, maxSize);
    }

    @Override
    public LoggingLevel getLoggingLevel() {
        return super.getLoggingLevel();
    }

    @Override
    public String getFormat() {
        return super.getFormat();
    }


    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public long getMaxSize() {
        return super.getMaxSize();
    }

}
