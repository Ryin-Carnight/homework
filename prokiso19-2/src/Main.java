import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File f = new File(sc.next());
        String error_code = new String(sc.next());
        int count = 0;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();

            while(s != null)
            {
                if(s.contains(" " + error_code + " "))
                {
                    count++;
                }
                s = br.readLine();
            }

              fr.close();
            br.close();
        }catch(IOException e)
        {
            System.out.println(e);
        }
        System.out.println(count);
    }
}

