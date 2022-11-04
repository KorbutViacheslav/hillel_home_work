package home_work_10.stdout;

import home_work_10.LoggingLevel;
import home_work_10.logAbstract.ConfigurationLoader;
import home_work_10.logAbstract.Configuration;

public class StdoutLoggerConfigurationLoader extends ConfigurationLoader {
    @Override
    public StdoutLoggerConfiguration load() {
        return new StdoutLoggerConfiguration();
    }
}
