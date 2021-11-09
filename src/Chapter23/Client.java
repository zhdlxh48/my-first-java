package Chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static Socket socket = null;

    private static DataInputStream dataInput = null;
    private static DataOutputStream dataOutput = null;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            socket = new Socket("localhost", 9000);

            System.out.println("Connected to Server");

            dataInput = new DataInputStream(socket.getInputStream());
            dataOutput = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String serverMsg = dataInput.readUTF();
                System.out.println("Server: " + serverMsg);

                String clientMsg = scanner.nextLine();

                dataOutput.writeUTF(clientMsg);
                dataOutput.flush();
                System.out.println("Client: " + clientMsg);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
