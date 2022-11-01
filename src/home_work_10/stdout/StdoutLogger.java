package home_work_10.stdout;

import home_work_10.log_abstract.AbstractFileLogger;
import home_work_10.log_abstract.AbstractFileLoggerConfigurator;

public class StdoutLogger extends AbstractFileLogger {

    @Override
    public void debug(String message) {
        System.out.println(messageTemplate(message));
    }

    @Override
    public void info(String message) {
        System.out.println(messageTemplate(message));
    }

    @Override
    public String getDateTimeNow() {
        return super.getDateTimeNow();
    }

    public StdoutLogger(AbstractFileLoggerConfigurator abstractFileLoggerConfigurator) {
        super(abstractFileLoggerConfigurator);
    }

    @Override
    public String messageTemplate(String message) {
        return super.messageTemplate(message);
    }
}
