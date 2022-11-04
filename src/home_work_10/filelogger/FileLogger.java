package home_work_10.filelogger;

import home_work_10.LoggingLevel;
import home_work_10.logAbstract.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {

    private FileLoggerConfiguration fileLoggerConfiguration;
    private String currentPath;
    private static int countFile = 1;

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        super(fileLoggerConfiguration);
        this.fileLoggerConfiguration = fileLoggerConfiguration;
        currentPath = fileLoggerConfiguration.getPath() + String.format("Log_%s.txt", getDateTimeNow());

    }

    public void debug(String message) {
        if (!fileLoggerConfiguration.getLoggingLevel().equals(LoggingLevel.INFO)) {
            checkSizeCurrentFile(message);
            writeLog(message);
        }
    }

    public void info(String message) {
        checkSizeCurrentFile(message);
        writeLog(message);
    }

    private void checkSizeCurrentFile(String message) {
        long currentFileSize = new File(currentPath).length();
        long currentMessage = message.getBytes().length;
        if (currentMessage + currentFileSize >= fileLoggerConfiguration.getMaxSize()) {
            new File(currentPath = fileLoggerConfiguration.getPath() + String.format("Log_%s_%s.txt", getDateTimeNow(), countFile++));
            System.out.println("Old log file is filled! Created new log file... №" + (countFile - 1));

        }
    }

    private void writeLog(String message) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(currentPath, true))) {
            output.write(messageTemplate(message));
            output.newLine();
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getDateTimeNow() {
        return super.getDateTimeNow();
    }

    @Override
    public String messageTemplate(String message) {
        return super.messageTemplate(message);
    }
}
