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
                String line = in.readLine();
                String data = "";
                System.out.println("受信データ:" + line);
                for(int i = 0;i < Integer.parseInt(line);i++)
                {
                    data  = in.readLine();
                    System.out.println("受信データ:" + data);
                    //System.out.println(1);
                    //out.println("受信しています");
                }
                //System.out.println(2);
                out.println("データの受信完了しました");
                //System.out.println(3);

                System.out.println("切断します");
                sock.close();
                ss.close();
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
