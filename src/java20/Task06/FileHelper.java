package java20.Task06;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FileHelper {
    public static File getFileByPath(String pathToFile) {
        return new File(pathToFile);
    }

    public static String getTextFromFile(File file) {
        try {
            byte[] arrbytes = Files.readAllBytes(file.toPath());
            String text = new String(arrbytes, StandardCharsets.UTF_8);
            return text;
        } catch (IOException e) {
            throw new AssertionError(e.getMessage());
        }
    }
}

