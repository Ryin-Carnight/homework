import java.io.*;
public class Tripler
{
    public void writeCSV(String input)
    {
        File f_in = new File(input);
        File f_out = new File("result.csv");
        try{
            FileReader fr = new FileReader(f_in);
            FileWriter fw = new FileWriter(f_out);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String s = br.readLine();

            while(s != null)
            {
                String[] line = s.split(",");
                for(int i = 0;i < line.length;i++ )
                {
                    String word = line[i];
                    try
                    {
                        Integer triple_number = Integer.parseInt(word)*3;
                        String triple = triple_number.toString();
                        bw.write(triple);
                        if(i+1 < line.length)bw.write(",");
                    }catch(NumberFormatException e)
                    {
                        bw.write(word);
                        if(i+1 < line.length)bw.write(",");
                    }
                }
                bw.newLine();
                s = br.readLine();
            }
            br.close();
            bw.close();
            fr.close();
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}