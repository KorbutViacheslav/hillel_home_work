package home_work_10.stdout;

import home_work_10.logAbstract.Logger;
import home_work_10.logAbstract.Configuration;

public class StdoutLogger extends Logger {

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

    public StdoutLogger(Configuration configuration) {
        super(configuration);
    }

    @Override
    public String messageTemplate(String message) {
        return super.messageTemplate(message);
    }
}
