package home_work_14;

public class FileData implements Comparable<FileData> {
    private String name;
    private int size;
    private String path;

    public FileData(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return "FileData: [" +
                "Name: " + name +
                ", Size: " + size +
                ", Path: " + path +
                ']';
    }

    @Override
    public int compareTo(FileData o) {
        return this.getSize() - o.getSize();
    }
}
