import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Client
{
    public static void main(String[] args)
    {
        Random rm = new Random();
        try
        {
            Socket sock = new Socket();
            //sock.setSoTimeout(3000);
            sock.connect(new InetSocketAddress("192.168.11.9", 59660), 50);

            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);

            //System.out.println(2);
            int rand = rm.nextInt(9) + 1;
            String random = String.valueOf(rand);
            out.println(random);
            System.out.println("送る行数:" + random);

            ArrayList<String> data = new ArrayList<>();
            char alphabet = 'a';
            for(int i = 0;i < rand;i++)
            {
                data.add(String.valueOf(alphabet));
                alphabet++;
            }
            for(int i = 0;i < rand;i++)
            {
                String send = "";
                for (int j = 0; j < rand; j++) {
                    send += data.get(i);
                    //System.out.println(1);
                }
                out.println(send);
                //System.out.println(2);
                //String keep = in.readLine();
                //System.out.println("サーバからの返信:" + keep);
            }
            //System.out.println(3);
            String result = in.readLine();
            //System.out.println(4);
            System.out.println("サーバからの返信:" + result);

            sock.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
