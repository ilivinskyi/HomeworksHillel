package textdataparser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FileManager {

    public List<String> getFileContent(String fileName) {
        try {
            String content = new String(
                    Files.readAllBytes(Paths.get(FileManagerConstants.filePath(fileName).toLowerCase()))
            );
            String[] words = content.split(FileManagerConstants.SPLIT_REGEX.text);
            return List.of(words);
        } catch (IOException e) {
            System.err.println(FileManagerConstants.ERROR_CREATING_FILE.text + e.getMessage());
            return Collections.emptyList();
        }
    }

    public void saveStatistics(String fileName, BookParser parsedBook) {
        try (
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter(FileManagerConstants.outputFileName(fileName))
                )
        ) {
            for (Map.Entry<String, Long> entry : parsedBook.getMostPopularWords(10).entrySet()) {
                writeToFile(entry, writer);
                writer.newLine();
            }
            writer.newLine();
            writer.write(
                    FileManagerConstants.WORDS_COUNT.text + parsedBook.getNumberOfUniqueWords()
            );
        } catch (IOException e) {
            System.err.println(FileManagerConstants.ERROR_OCCURRED.text + e.getMessage());
        }
    }

    private void writeToFile(Map.Entry<String, Long> entry, BufferedWriter writer)
            throws IOException {
        try {
            writer.write(entry.getKey() + ", " + entry.getValue());
        } catch (IOException e) {
            System.out.println(FileManagerConstants.ERROR_WRITING_FILE.text + e.getMessage());
            throw new IOException(e);
        }
    }
}
