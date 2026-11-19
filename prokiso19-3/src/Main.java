import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File f = new File(sc.next());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();

            while(s != null)
            {
                int length = s.indexOf(" ");
                String address = s.substring(0, length);
                if(map.get(address) != null)
                {
                    map.compute(address, (k, v) -> v + 1);
                }else map.put(address, 1);

                s = br.readLine();
            }

            fr.close();
            br.close();
        }catch(IOException e)
        {
            System.out.println(e);
        }
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list);

        for(String s : list)
        {
            System.out.println(s + ": " + map.get(s) + " time(s)");
        }
    }
}

