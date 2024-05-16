package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

//
// 1. При старті вашого додатка, він повинен слухати порт `8081` і очікувати підключення лише одного клієнта.
// 2. Після того, як клієнт підключився до сервера, обидві сторони повинні обмінятися привітаннями. Наприклад: з англійської "hello" перекладається як "привіт" на українську.
// 3. Якщо у привітанні клієнта є російські букви, яких немає в українській мові, ваш сервіс повинен надіслати запитання: "що таке паляниця?".
// 4. Якщо клієнт відповість правильно на це питання, сервер повинен відправити поточну дату та час, а потім попрощатися з клієнтом. Якщо відповідь буде неправильною, клієнт повинен бути відключений.
// Підказка
// Для отримання поточної дати та часу використовуйте стандартний Java API, наприклад, класи `LocalDate` та `LocalTime`.
// Додатково:
// Можна додати обробку помилок, логування та додаткові функції, якщо бажаєте.

public class SocketServer {

    MessageLanguageDetector languageDetector;
    private final String ORC_LANGUAGE_NAME = "RUSSIAN";
    private final String PLEASE_ENTER_THE_TEXT = "Будь ласка відправте якийсь текст!";

    private final String HELLO_MESSAGE = "Привіт!";
    private final String QUESTION_MESSAGE = "Що таке паляниця?";
    private final String CORRECT_ANSWER_MESSAGE = "Правильно. Сьогоднішня дата та час: ";
    private final String GOODBYE_MESSAGE = "Допобачення!";
    private final String HAVE_A_NICE_DAY_MESSAGE = "Гарного дня!";

    public void startServer() throws IOException {
        var notRu = true;
        languageDetector = new MessageLanguageDetector();
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            Logger logger = Logger.getLogger("");

            while (notRu) {
                Socket socket = serverSocket.accept();
                var inputStream = socket.getInputStream();
                sendMessage(socket, HELLO_MESSAGE);
                var in = new BufferedReader(new InputStreamReader(inputStream));
                var message = in.readLine();
                logger.log(Level.INFO, MessageFormat.format("Incoming message: {0}", message));
                if (message.isEmpty() || message.isBlank()) {
                    sendMessage(socket, PLEASE_ENTER_THE_TEXT);
                    return;
                } else if (languageDetector.getLanguage(message).equals(ORC_LANGUAGE_NAME)) {
                    logger.log(Level.INFO, "Question sent: " + QUESTION_MESSAGE);
                    sendMessage(socket, QUESTION_MESSAGE);
                    var response = in.readLine();
                    logger.log(Level.INFO, "Response received: " + response);

                    if (!response.equalsIgnoreCase("хліб")) {
                        logger.log(Level.INFO, "Incorrect response: " + response);
                        notRu = false;
                        socket.close();
                    } else {
                        logger.log(Level.INFO, "Correct response received");
                        sendMessage(socket, CORRECT_ANSWER_MESSAGE + LocalDateTime.now());
                        sendMessage(socket, GOODBYE_MESSAGE);
                        socket.close();
                        return;
                    }
                } else {
                    sendMessage(socket, HAVE_A_NICE_DAY_MESSAGE);
                }
            }
        }
    }

    private void sendMessage(Socket socket, String message) throws IOException {
        var out = new PrintWriter(socket.getOutputStream(), true);
        out.println(message + "\n");
        out.flush();
    }
}
