import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int number;
        ServerSocket server = new ServerSocket(1211);

        while (true) {
            new ServerAP(server.accept()).start();
        }
    }
}
