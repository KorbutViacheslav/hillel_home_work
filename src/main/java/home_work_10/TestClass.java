package home_work_10;

public class TestClass {
    public static void main(String[] args) {
        FileLogger logger = new FileLogger(new FileLoggerConfiguration());
        logger.info("INFO");
        logger.debug("DEBUG");
        logger.debug("DEBUG");
        logger.debug("DEBUG");

    }
}
