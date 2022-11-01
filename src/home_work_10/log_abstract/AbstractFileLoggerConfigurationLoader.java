package home_work_10.log_abstract;

import home_work_10.filelogger.FileLoggerConfiguration;
import home_work_10.LoggingLevel;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

abstract public class AbstractFileLoggerConfigurationLoader {
    private String path = "." + File.separator + "src" + File.separator + "home_work_10" + File.separator + "configLogger.properties";
    private File configLogger = new File(path);

    public AbstractFileLoggerConfigurator load() {
        try (FileReader reader = new FileReader(configLogger)) {
            Properties p = new Properties();
            p.load(reader);
            return new FileLoggerConfiguration(
                    LoggingLevel.valueOf(p.getProperty("Level")),
                    p.getProperty("Format"),
                    p.getProperty("Path"),
                    Long.parseLong((p.getProperty("MaxSize"))));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
