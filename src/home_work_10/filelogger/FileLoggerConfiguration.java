package home_work_10.filelogger;

import home_work_10.LoggingLevel;
import home_work_10.log_abstract.AbstractFileLoggerConfigurator;

public class FileLoggerConfiguration extends AbstractFileLoggerConfigurator {
    private LoggingLevel loggingLevel;
    private String format;
    private String path;
    private long maxSize;

    public FileLoggerConfiguration(LoggingLevel level,String format, String path, long maxSize) {
        super(level,format,path,maxSize);
        this.loggingLevel=level;
        this.format=format;
        this.path=path;
        this.maxSize=maxSize;
    }

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
