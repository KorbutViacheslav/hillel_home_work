package home_work_10.filelogger;

import home_work_10.LoggingLevel;
import home_work_10.logAbstract.ConfigurationLoader;
import home_work_10.logAbstract.Configuration;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileLoggerConfigurationLoader extends ConfigurationLoader {
    private String path = "." + File.separator + "src" + File.separator + "home_work_10" + File.separator + "configLogger.properties";
    private File configLogger = new File(path);
    @Override
    public Configuration load() {
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

