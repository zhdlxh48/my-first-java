package Chapter23;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket serverSocket = null;
    private static Socket socket = null;

    private static DataInputStream dataInput = null;
    private static DataOutputStream dataOutput = null;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            serverSocket = new ServerSocket(9000);
            socket = serverSocket.accept();

            System.out.println("Client Connected");

            dataInput = new DataInputStream(socket.getInputStream());
            dataOutput = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String serverMsg = scanner.nextLine();

                dataOutput.writeUTF(serverMsg);
                dataOutput.flush();
                System.out.println("Server: " + serverMsg);

                String clientMsg = dataInput.readUTF();
                System.out.println("Client: " + clientMsg);

                if (clientMsg == "STOP") break;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        }
    }
}
