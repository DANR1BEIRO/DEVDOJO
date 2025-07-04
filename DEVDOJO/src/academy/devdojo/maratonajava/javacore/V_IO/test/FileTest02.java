package academy.devdojo.maratonajava.javacore.V_IO.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File folder01 = new File("New folder");
        boolean isFolderCreated = folder01.mkdir();
        System.out.println("New folder is created: " + isFolderCreated);

        File file01 = new File(folder01, "file.txt");
        boolean isFileCreated = file01.createNewFile();
        System.out.println("New file is created: " + isFileCreated);

        File fileRenamed = new File(folder01, "File Renamed");
        boolean isFileRenamed = file01.renameTo(fileRenamed);
        System.out.println("File renamed: " + isFileRenamed);

        File folderRenamed = new File("Folder renamed");
        boolean isFolderRenamed = folder01.renameTo(folderRenamed);
        System.out.println("Folder renamed: " + isFolderRenamed);
    }
}
