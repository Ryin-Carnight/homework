import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Multi
{
    private int n;

    public Multi(int n)
    {
        this.n = n;
    }

    File f = new File("result.csv");

    public void writeCSV()
    {
        try
        {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 1;i <= n; i++)
            {
                for(int j = 1;j <= n ;j++ )
                {
                    Integer integer = i*j;
                    String ans = integer.toString();
                    bw.write(ans);
                    if(j+1 <= n)bw.write(",");

                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
