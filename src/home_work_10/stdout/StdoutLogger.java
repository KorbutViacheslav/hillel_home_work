package home_work_10.stdout;

import home_work_10.LoggingLevel;
import home_work_10.logAbstract.Logger;

public class StdoutLogger extends Logger {
    private StdoutLoggerConfiguration stdoutLoggerConfiguration = new StdoutLoggerConfiguration();

    public StdoutLogger(StdoutLoggerConfiguration stdoutLoggerConfiguration) {

    }

    @Override
    public void debug(String message) {
        if (!stdoutLoggerConfiguration.getLoggingLevel().equals(LoggingLevel.INFO)) {
            System.out.println(messageTemplate(message));
        }
    }

    @Override
    public void info(String message) {
        System.out.println(messageTemplate(message));
    }

    public String getDateTimeNow() {

        return super.getDateTimeNow();
    }

    public String messageTemplate(String message) {
        return String.format(stdoutLoggerConfiguration.getFormat(),
                getDateTimeNow(), stdoutLoggerConfiguration.getLoggingLevel(), message);
    }
}
