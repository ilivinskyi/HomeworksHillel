package textdataparser;

public enum FileManagerConstants {
    DIRECTORY("src/"),
    ERROR_CREATING_FILE("Error reading the file: "),
    ERROR_WRITING_FILE("Error during writing statistics: "),
    EXTENSION(".txt"),
    ERROR_OCCURRED("An error occurred: "),
    WORDS_COUNT("Words count: "),
    SPLIT_REGEX("[\\s\\p{Punct}]+");

    public final String text;

    FileManagerConstants(String text) {
        this.text = text;
    }

    public static String filePath(String fileName) {
        return DIRECTORY.text + fileName + EXTENSION.text;
    }

    public static String outputFileName(String fileName) {
        return fileName + "_statistics.txt";
    }
}
