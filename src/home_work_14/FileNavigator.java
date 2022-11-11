package home_work_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator {
    Map<String, ArrayList<FileData>> mapList = new HashMap<>();

    public void add(String path, FileData fileData) {
        if (path.equals(fileData.getPath())) {
            if (mapList.containsKey(path)) {
                mapList.get(path).add(fileData);
                System.out.println("Added " + fileData + " to list by path " + path);
            } else {
                mapList.put(path, new ArrayList<>());
                mapList.get(path).add(fileData);
                System.out.println("We created a list at " + path + " and added there " + fileData);
            }
        } else {
            throw new IllegalArgumentException("ERROR! Key-path: " + path + " and file path: " + fileData.getPath() + " do not match");
        }
    }

    public ArrayList<FileData> find(String path) {
        return mapList.get(path);
    }

    public ArrayList<FileData> filterBySize(int sizeFile) {
        ArrayList<FileData> list = new ArrayList<>();
        for (ArrayList<FileData> file : mapList.values()) {
            for (FileData fileData : file) {
                if (fileData.getSize() <= sizeFile) {
                    list.add(fileData);
                }
            }
        }
        return list;
    }

    public void remove(String path) {
        mapList.remove(path);
    }

    public ArrayList<FileData> sortBySize() {
        ArrayList<FileData> sortedFiles = new ArrayList<>();
        for (ArrayList<FileData> fileData : mapList.values()) {
            sortedFiles.addAll(fileData);
        }
        Collections.sort(sortedFiles);
        return sortedFiles;
    }
}