import java.io.*;
import java.util.*;

public class GradeProcessor
{
    private String score, setting, result;

    public GradeProcessor(String score, String setting, String result)
    {
        this.score = score;
        this.setting = setting;
        this.result = result;
    }

    public void process()
    {
        try
        {
            FileReader frs = new FileReader(this.score);
            BufferedReader brs = new BufferedReader(frs);
            FileWriter fw = new FileWriter(this.result);
            BufferedWriter bw = new BufferedWriter(fw);
            FileReader fri = new FileReader(this.setting);
            BufferedReader bri = new BufferedReader(fri);
            //System.out.println(1);

            HashMap<String, HashMap<String, Integer>> students = new HashMap<>();//<生徒名, <教科名, 点数// >>
            ArrayList<String> smm = new ArrayList<>();
            ArrayList<String> members = new ArrayList<>();
            String s = brs.readLine();

            String[] subjects = s.split(",");

            s = brs.readLine();
            String[] data;

            boolean max = false;
            boolean sum = false;
            boolean min = false;

            //System.out.println(2);
            while(s != null)//各生徒達の成績を順に格納していく
            {
                HashMap<String, Integer> scores = new HashMap<>(); //<教科名, 点数>
                data = s.split(",");
                for(int i = 1;i < data.length;i++)
                {
                    scores.put(subjects[i], Integer.parseInt(data[i]));
                }
                //System.out.println(3);
                String[] para;
                String ini = bri.readLine();

                while(ini != null)
                {
                    para = ini.split(" ");
                    switch(para[0])
                    {
                        case "max": if(Objects.equals(para[2], "yes"))
                                    {
                                        max = true;
                                        smm.addLast("Max");
                                    }
                            break;
                        case "min": if(Objects.equals(para[2], "yes"))
                                    {
                                        min = true;
                                        smm.add("Min");
                                    }
                            break;
                        case "sum": if(Objects.equals(para[2], "yes"))
                                    {
                                        sum = true;
                                        smm.addFirst("Sum");
                                    }
                    }
                    //System.out.println(4);
                    ini = bri.readLine();
                }
                //System.out.println(5);
                int[] scr =  new int[scores.size()];
                for(int i = 1;i < scores.size() + 1;i++)
                    scr[i-1] = scores.get(subjects[i]);
                if(min)scores.put("Min", searchMin(scr));
                if(max)scores.put("Max", searchMax(scr));
                if(sum)scores.put("Sum", searchSum(scr));
                students.put(data[0], scores);
                members.add(data[0]);
                s = brs.readLine();
            }
            //System.out.println(6);

            String[] status = new String[subjects.length + smm.size()];

            for(int i = 0;i < subjects.length;i++)
            {
                status[i] = subjects[i];
            }
            //System.out.println(7);
            for(int i = 0;i < smm.size();i++)
            {
                status[subjects.length + i] = smm.get(i);
            }
            //System.out.println(8);
            bw.write(status[0]);
            for(int i = 1;i < status.length;i++)
            {
                bw.write("," + status[i]);
            }
            bw.newLine();
            //System.out.println(9);

            String ss;

            for(int i = 0;i < members.size();i++)
            {
                ss = members.get(i);
                bw.write(ss);
                HashMap<String, Integer> subject_score = students.get(ss);
                for(int j = 1;j < subject_score.size() + 1;j++)
                {
                    bw.write("," + subject_score.get(status[j]));
                }
                bw.newLine();
            }


            brs.close();
            frs.close();
            bri.close();
            fri.close();
            bw.close();
            fw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }

    }
    private int searchMax(int [] scores)
    {
        int max = scores[0];
        for(Integer score: scores)
        {
            if(max < score)max = score;
        }
        return max;
    }

    private int searchMin(int[] scores)
    {
        int min = scores[0];
        for(Integer score: scores)
        {
            if(min > score)min = score;
        }
        return min;
    }

    private int searchSum(int[] scores)
    {
        int sum = 0;
        for(Integer score: scores)
        {
            sum += score;
        }
        return sum;
    }
}
