package controlstructures;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Sockets {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();
        System.out.println("Client connected: " + socket.getInetAddress());

        // streams to communicate
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        // read message from client
        String message = in.readLine();
        System.out.println("Received: " + message);

        // respond back
        out.println("Hello Client! Message received: " + message);

        // close resources
        socket.close();

        FileInputStream fi = new FileInputStream(new File("hello.txt"));
    }
}
