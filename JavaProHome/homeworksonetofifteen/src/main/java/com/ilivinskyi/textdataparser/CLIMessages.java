package textdataparser;

public enum CLIMessages {
    HELLO("Welcome to the book statistics parser."),
    HELP("Type '!quit' or send empty line to stop the app."),
    GOODBYE("Goodbye!"),
    DO_YOU_WANT_TO_CONTINUE(
            "Type 'next' if you want to continue, any other input will close the app."
    ),
    STATISTICS_SAVED("Book statistics has been saved."),
    INPUT_PROMPT("Enter name of the file you want to read:"),
    NUMBER_OF_UNIQUE("Number of unique words: "),
    MOST_POPULAR("Most popular words are: "),
    WORDS_COUNT("Words count in file: %s%n"),
    NEXT("next"),
    STOP("!quit");

    public final String message;

    CLIMessages(String message) {
        this.message = message;
    }
}
