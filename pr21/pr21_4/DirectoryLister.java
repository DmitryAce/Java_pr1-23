package pr21.pr21_4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryLister {
    public static List<String> listFilesInDirectory(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        fileList.add(file.getName());
                    }
                }
            }
        }

        return fileList;
    }

    public static void main(String[] args) {
        String directoryPath = "F:\\Code\\Java\\MIREA\\Java practice lessons";

        List<String> fileList = listFilesInDirectory(directoryPath);

        System.out.println("Первые 5 элементов в каталоге:");
        int limit = Math.min(5, fileList.size());
        for (int i = 0; i < limit; i++) {
            System.out.println(fileList.get(i));
        }
    }
}
