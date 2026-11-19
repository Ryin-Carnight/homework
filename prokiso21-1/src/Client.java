import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Client
{
    public static void main(String[] args)
    {
        try
        {
            Socket sock = new Socket();
            sock.setSoTimeout(100);
            sock.connect(new InetSocketAddress("192.168.11.9", 59660), 50);

            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);

            //System.out.println(2);
            out.println("spam!!");
            String result = in.readLine();
            //System.out.println(3);
            System.out.println("サーバからの返信:" + result);

            sock.close();
        }catch(Exception e)
        {

        }
//            HashMap<String, Integer> map = new HashMap<>();
//        try
//        {
//            int a =172, b = 28,c = 0,d = 0;
//            String ip = a + "." + b + "." + c + "." + d;
//            for(;c < 256;)
//            {
//                ip = a + "." + b + "." + c + "." + d;
//                InetAddress id = InetAddress.getByName(ip);
//                if(id.isReachable(100))map.put(ip,0);
//
//                if(d < 255) d++;
//                else
//                {
//                    d = 0;
//                    c++;
//                }
//            }
//                //System.out.println(1);
//
//        }catch(Exception e)
//        {
//            System.out.println(e);
//        }
//        int sport = 49152;
//        int eport = 65535;
//        Set<String> ipaddress = map.keySet();
//
//        for(String i: ipaddress)
//        {
//            for(int port = sport;port < eport;port++)
//            {
//                try
//                {
//                    System.out.println(port);
//                    Socket sock = new Socket();
//                    sock.setSoTimeout(100);
//                    sock.connect(new InetSocketAddress(i, port), 50);
//                    map.put(i, port);
//
//                    BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
//                    PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
//
//                    //System.out.println(2);
//                    out.println("spam!!");
//                    String result = in.readLine();
//                    //System.out.println(3);
//                    System.out.println("サーバからの返信:" + result);
//
//                    sock.close();
//                    break;
//                }catch(Exception e)
//                {
//
//                }
//            }
//        }
    }
}
