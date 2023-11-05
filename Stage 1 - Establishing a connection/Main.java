package hacker;

import java.io.*;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket(args[0], Integer.parseInt(args[1]));
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {
            String msg = args[2];

            output.writeUTF(msg); // send a message to the server
            String receivedMsg = input.readUTF(); // read the reply from the server

            System.out.println(receivedMsg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
