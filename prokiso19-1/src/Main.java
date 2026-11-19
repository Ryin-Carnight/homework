import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        File f = new File(sc.next());
        try {
            FileReader fr= new FileReader(f);
            int c = fr.read();

            while(c != -1)
            {
                if(c >= 65 && c <= 90)
                {
                    c += 32;
                }else if(c >= 97 && c <= 122)
                {
                    c -= 32;
                }
                System.out.print((char)c);
                c = fr.read();
            }
            fr.close();
        }catch(IOException e)
        {
            System.out.println("File: " + f + " not found.");
        }
    }
}