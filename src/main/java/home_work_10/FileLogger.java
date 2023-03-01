package home_work_10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {

    private final FileLoggerConfiguration fileLoggerConfiguration;
    private final String currentPath;

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
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
        if (message.getBytes().length + currentFileSize >= fileLoggerConfiguration.getMaxSize()) {
            throw new FileMaxSizeReachedException(fileLoggerConfiguration.getMaxSize(), currentFileSize, currentPath);
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

    private String messageTemplate(String message) {
        return String.format(fileLoggerConfiguration.getFormat(),
                "[" + getDateTimeNow() + "]",
                "[" + fileLoggerConfiguration.getLoggingLevel() + "]",
                "Message",
                "[" + message + "]"
        );
    }

    public String getDateTimeNow() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh.mm.ss");
        return now.format(formatter);
    }
}
