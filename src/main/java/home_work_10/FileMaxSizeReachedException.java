package home_work_10;

public class FileMaxSizeReachedException extends RuntimeException {
    public FileMaxSizeReachedException(long maxSize, long currentSize, String path) {
        System.err.println("Max size file - " + maxSize +
                " current size file - " + currentSize + ", Path to file - " +
                path);
    }
}
