package home_work_10;

import home_work_10.filelogger.FileLogger;
import home_work_10.filelogger.FileLoggerConfiguration;
import home_work_10.filelogger.FileLoggerConfigurationLoader;
import home_work_10.stdout.StdoutLogger;
import home_work_10.stdout.StdoutLoggerConfiguration;
import home_work_10.stdout.StdoutLoggerConfigurationLoader;

public class Main {
    public static void main(String[] args) {
        FileLogger logger = new FileLogger((FileLoggerConfiguration) new FileLoggerConfigurationLoader().load());
        logger.info("INFO");
        logger.debug("DEBUG");
        logger.debug("DEBUG");
        logger.debug("DEBUG");
        logger.info("INFO");
        logger.info("INFO");
        StdoutLogger stl=new StdoutLogger(new StdoutLoggerConfigurationLoader().load());
        stl.info("INFO CONSOLE");
        stl .debug("DEBUG CONSOLE");
    }
}
