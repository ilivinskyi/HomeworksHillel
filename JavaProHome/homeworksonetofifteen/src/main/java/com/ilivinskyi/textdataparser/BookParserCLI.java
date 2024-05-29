package textdataparser;

import java.util.Scanner;

public class BookParserCLI {

    static Scanner scanner = new Scanner(System.in);

    public void run() {
        var fileManager = new FileManager();
        var isRunning = true;

        while (isRunning) {
            showWelcomeMessage();
            String userPrompt = scanner.nextLine();
            if (userPrompt.equalsIgnoreCase(CLIMessages.STOP.message) || userPrompt.isEmpty()) {
                scanner.close();
                showGoodbyeMessage();
                break;
            }
            var bookWords = fileManager.getFileContent(userPrompt);
            if (!bookWords.isEmpty()) {
                var book = new Book(bookWords);
                var parsedBook = new BookParser(book);
                showBookStatistics(parsedBook);
                fileManager.saveStatistics(userPrompt, parsedBook);
                System.out.println(CLIMessages.STATISTICS_SAVED.message);
                showContinueDialog();
                if (!scanner.nextLine().equalsIgnoreCase(CLIMessages.NEXT.message)) {
                    isRunning = false;
                    showGoodbyeMessage();
                }
            }
        }
    }

    private void showBookStatistics(BookParser parsedBook) {
        System.out.printf(CLIMessages.WORDS_COUNT.message, parsedBook.getNumberOfWords());
        System.out.println(
                CLIMessages.MOST_POPULAR.message + parsedBook.getMostPopularWords(10).keySet()
        );
        System.out.println(
                CLIMessages.NUMBER_OF_UNIQUE.message + parsedBook.getNumberOfUniqueWords()
        );
    }

    private void showWelcomeMessage() {
        System.out.println(CLIMessages.HELLO.message);
        System.out.println(CLIMessages.HELP.message);
        System.out.println(CLIMessages.INPUT_PROMPT.message);
    }

    private void showGoodbyeMessage() {
        System.out.println(CLIMessages.GOODBYE.message);
    }

    private void showContinueDialog() {
        System.out.println(CLIMessages.DO_YOU_WANT_TO_CONTINUE.message);
    }
}
