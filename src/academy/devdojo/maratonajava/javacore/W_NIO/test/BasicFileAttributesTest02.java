package academy.devdojo.maratonajava.javacore.W_NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();

         System.out.println("CreationTime: " + creationTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("--------------");

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, fileTime,creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();

        System.out.println("CreationTime: " + creationTime);
        System.out.println("lastAccessTime: " + lastAccessTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
    }
}
