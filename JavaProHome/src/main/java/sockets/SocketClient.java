package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

    private final String ip;
    private final int port;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public SocketClient(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    public void startConnection() {
        try {
            clientSocket = new Socket(ip, port);
        } catch (IOException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
        } catch (IOException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    public String sendMessage(String msg) {
        out.println(msg);
        String resp;
        try {
            resp = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return resp;
    }

    public void stopConnection() {
        try {
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
        out.close();
        try {
            clientSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }
}
