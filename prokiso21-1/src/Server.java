import java.io.*;
import java.net.*;

public class Server
{
    public static void main(String[] args)
    {
        while(true)
        {
            try
            {
                ServerSocket ss = new ServerSocket(59660);
                Socket sock = ss.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                PrintWriter out = new PrintWriter(sock.getOutputStream(), true);

                String data = in.readLine();
                System.out.println(data + "を受け取りました");
                out.println("データの受信完了しました");

                System.out.println("切断します");
                sock.close();
                ss.close();
            }catch(Exception e)
            {

            }
        }

    }
}
