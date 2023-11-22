import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerAP extends Thread
{
    private Socket socket;

    public ServerAP(Socket socket)
    {
        this.socket=socket;
    }

    @Override
    public void run()
    {
        Scanner scan = null;
        PrintStream printout = null;
        int number;

        try
        {
            scan = new Scanner(socket.getInputStream());
            printout = new PrintStream(socket.getOutputStream());
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
        number = scan.nextInt();


        if(number % 2 ==0)
        {
            printout.println("EVEN");
            System.out.println("Address: " + socket.getInetAddress().getHostName());
        }
        else
        {
            printout.println("ODD");
            System.out.println("Address: " + socket.getInetAddress().getHostName());
        }
    }
}
