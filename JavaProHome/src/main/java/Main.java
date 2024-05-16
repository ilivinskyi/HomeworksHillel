import sockets.SocketServer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var server = new SocketServer();
        try {
            server.startServer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
